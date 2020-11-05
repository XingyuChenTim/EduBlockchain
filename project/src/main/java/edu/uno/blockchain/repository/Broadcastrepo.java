package edu.uno.blockchain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import static edu.uno.blockchain.function.Hashfunctions.sha256hash;

import edu.uno.blockchain.form.Broadcastform;
import edu.uno.blockchain.form.Tokenform;
import edu.uno.blockchain.form.TokenMapper;
import edu.uno.blockchain.form.Pollform;
import edu.uno.blockchain.form.PollMapper;

/*bodc
 * Transaction repository
 * Repository that stores transaction information.
 */

@Repository
public class Broadcastrepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int createTransaction(Broadcastform createForm) {
        String sql = "insert into transactionpoll(id, amount, fee, hash, date, sender, receiver) values(?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, 1, createForm.getAmount(), 1, createForm.getHashid(), new Date().getTime(),
                createForm.getSender(), createForm.getReceiver());
    }

    public List<Tokenform> findByTokens() {

        return jdbcTemplate.query("SELECT id,token FROM token", new TokenMapper());

    }

    public List<Pollform> findByPolls() {

        return jdbcTemplate.query("SELECT * FROM transactionpoll", new PollMapper());

    }

    public String minereward(String miner, String minerprivatekey) {
        // Miner will also get the fee from the sender, which is 1 bitcoin.
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

    /*
    public String transaction(String sender, String receiver, int amount) {
        //change owner of sender to receiver

    }
    */
}
