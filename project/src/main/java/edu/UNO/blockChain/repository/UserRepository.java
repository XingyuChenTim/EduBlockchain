package edu.uno.blockchain.repository;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.uno.blockchain.form.UserForm;
import edu.uno.blockchain.function.Hashfunctions;

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
        Hashfunctions hash = new Hashfunctions();
        String sql = "insert into user(NUID,PASSWORD,WALLET,AUTHORITY, PRIVATEKEY) values(?,?,?,?,?)";
        String tokensql = "create table token" + user.getunid() + " (id INT NOT NULL AUTO_INCREMENT, token VARCHAR(64) NOT NULL, PRIMARY KEY (id)) ";
        String historysql = "create table history" + user.getunid() + " (id INT NOT NULL AUTO_INCREMENT, amount VARCHAR(64) NOT NULL, date VARCHAR(45) NOT NULL, status VARCHAR(45) NOT NULL, hash VARCHAR(64) NOT NULL, sender VARCHAR(64) NOT NULL, receiver VARCHAR(64) NOT NULL, PRIMARY KEY (id)) ";     
        jdbcTemplate.execute(tokensql);
        jdbcTemplate.execute(historysql);
        String privatekey = "";
        try{
            privatekey = hash.hash(user.getunid());
        }
        catch (NoSuchAlgorithmException e){
            privatekey = "wrong";
        }
        return jdbcTemplate.update(sql, user.getunid(), user.getPassword(), 0, "student", privatekey);
    }
    /*
     * Select the user information from myTable when sign in.
     */
    public boolean signinUser(UserForm user){
        String sql = "select * from user where UNID = ? and PASSWORD = ?";
        return !jdbcTemplate.queryForList(sql, user.getunid(), user.getPassword()).isEmpty();
    }

}
