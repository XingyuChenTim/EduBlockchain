package edu.UNO.blockChain.repository;

import static edu.UNO.blockChain.function.Hashfunctions.sha256hash;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.UNO.blockChain.form.UserForm;
import edu.UNO.blockChain.function.*;


@Repository
public class MinerRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    /**
     * To deal with the pending mining block.
     * @return The pending block header. 
     */
    public String miningpending() {

        String transaction = jdbcTemplate.queryForList("select hash from transactionpoll", String.class).get(0);
        String previousblock = jdbcTemplate
                .queryForList("select blockheader from blockchain ORDER BY id DESC LIMIT 1", String.class).get(0);

        Block pending = new Block(transaction, previousblock);
        pending.mineBlock(5);

        String blockheader = pending.blockheader;
        int nonce = pending.nonce;
        long timestamp = pending.timeStamp;

        String sender = jdbcTemplate.queryForList("select sender from transactionpoll", String.class).get(0);
        String receiver = jdbcTemplate.queryForList("select receiver from transactionpoll", String.class).get(0);
        String date = jdbcTemplate.queryForList("select date from transactionpoll", String.class).get(0);
        String amount = jdbcTemplate.queryForList("select amount from transactionpoll", String.class).get(0);
        int difficulty = 5;

        String insertsql = "insert into blockchain(blockheader, nonce, difficulty, timestamp, previousblock, transaction, sender, receiver, date, amount) values(?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(insertsql, blockheader, nonce, difficulty, timestamp, previousblock, transaction, sender,
                receiver, date, amount);

        String removesql = "DELETE FROM transactionpoll where id = '1'";
        jdbcTemplate.execute(removesql);
        
        String count = jdbcTemplate.queryForList("select count(token) from token", String.class).get(0);
        int tolrow = Integer.parseInt(count);
        int ownerchanged = Integer.parseInt(amount);
        int affected = 0;
        for (int t = 1; t <= tolrow; t++){
            int tem = jdbcTemplate.update("update token set owner = "+receiver+" where owner = "+sender+" AND id = "+t);
            if (tem == 1)
            {
               affected++; 
            }
            if (affected == ownerchanged)
            {
                break;
            }
        }
        return blockheader;

    }
}
