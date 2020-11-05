package edu.uno.blockchain.repository;

import static edu.uno.blockchain.function.Hashfunctions.sha256hash;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.uno.blockchain.form.UserForm;
import edu.uno.blockchain.function.*;

/*
 * User repository
 * Repository that stores users information.
 */
@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /*
     * Insert the user information into myTable when register.
     */
    public int registerUser(UserForm user) {
        String sql = "insert into user(NUID,PASSWORD,WALLET,AUTHORITY, PRIVATEKEY) values(?,?,?,?,?)";
        String tokensql = "create table token" + user.getnuid()
                + " (id INT NOT NULL AUTO_INCREMENT, token VARCHAR(64) NOT NULL, PRIMARY KEY (id)) ";
        String historysql = "create table history" + user.getnuid()
                + " (id INT NOT NULL AUTO_INCREMENT, amount VARCHAR(64) NOT NULL, date VARCHAR(45) NOT NULL, status VARCHAR(45) NOT NULL, hash VARCHAR(64) NOT NULL, sender VARCHAR(64) NOT NULL, receiver VARCHAR(64) NOT NULL, PRIMARY KEY (id)) ";
        jdbcTemplate.execute(tokensql);
        jdbcTemplate.execute(historysql);
        String privatekey = "";
        try {
            privatekey = sha256hash(user.getnuid());
        } catch (NoSuchAlgorithmException e) {
            privatekey = "wrong";
        }
        return jdbcTemplate.update(sql, user.getnuid(), user.getPassword(), 0, "student", privatekey);
    }

    /*
     * Select the user information from myTable when sign in.
     */
    public boolean signinUser(UserForm user) {
        String sql = "select * from user where NUID = ? and PASSWORD = ?";
        return !jdbcTemplate.queryForList(sql, user.getnuid(), user.getPassword()).isEmpty();
    }

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

        return blockheader;

    }
}
