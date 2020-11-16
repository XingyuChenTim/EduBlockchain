package edu.UNO.blockChain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import static edu.UNO.blockChain.function.Hashfunctions.sha256hash;

import edu.UNO.blockChain.form.Broadcastform;
import edu.UNO.blockChain.form.blockChainform;
import edu.UNO.blockChain.form.searchBarMapper;
import edu.UNO.blockChain.form.Tokenform;
import edu.UNO.blockChain.form.blockChainMapper;
import edu.UNO.blockChain.form.TokenMapper;
import edu.UNO.blockChain.form.Pollform;
import edu.UNO.blockChain.form.PollMapper;

/*bodc
 * Transaction repository
 * Repository that stores transaction information.
 */

@Repository
public class Broadcastrepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int createTransaction(Broadcastform createForm, String user) {
        String sql = "insert into transactionpoll(id, amount, fee, hash, date, sender, receiver) values(?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, 1, createForm.getAmount(), 1, createForm.getHashid(), new Date().getTime(),
                user,createForm.getReceiver());
    }

    public List<Tokenform> findByTokens(String user) {
        return jdbcTemplate.query("SELECT id,token,owner FROM token where owner = "+user, new TokenMapper());

    }

    public List<Pollform> findByPolls() {

        return jdbcTemplate.query("SELECT id,amount,fee,hash,date,sender,receiver FROM transactionpoll", new PollMapper());

    }

    public String minereward(String miner) {
        // Miner will also get the fee from the sender, which is 1 bitcoin.
        String minerprivatekey = jdbcTemplate.queryForList("select PRIVATEKEY from user where NUID ="+miner, String.class).get(0);
        String sql = "insert into token(token, owner) values(?,?)";
        String tokenkey = "";
        for (int i = 0; i < 5; i++) {
            try {
                tokenkey = sha256hash(minerprivatekey + i);
                jdbcTemplate.update(sql, tokenkey, miner);
            } catch (NoSuchAlgorithmException e) {
                return "reward insert failed";
            }
        }
        return "reward inserted";
    }

    public List<blockChainform> findbyCardView() {

        return jdbcTemplate.query("SELECT id,blockheader,nonce,timestamp,previousblock FROM blockChain",
                new blockChainMapper());
    }

    public List<blockChainform> findByKeyword(String keyword) {
        
        //System.out.println("BroadRepKeyword: " + keyword);
        return jdbcTemplate.query("SELECT blockheader,transaction FROM blockchain b where b.blockheader like '%"
                + keyword + "%' or b.transaction like '%" + keyword + "%'", new searchBarMapper());
    }


}
