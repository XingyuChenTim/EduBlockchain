package edu.UNO.blockChain.repository;

import static edu.UNO.blockChain.function.Hashfunctions.sha256hash;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.UNO.blockChain.form.UserForm;


/**
 * User repository
 * Repository that stores users information.
 * @author fire-holder
 *
 */
@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * Insert the user information into user table when register.
     * @param user The user object to be registered.
     * @return The number of rows that are updated.
     */
    public int registerUser(UserForm user) {
        String sql = "insert into user(NUID,PASSWORD,AUTHORITY, PRIVATEKEY) values(?,?,?,?)";
        String privatekey = "";
        try {
            privatekey = sha256hash(user.getnuid());
        } catch (NoSuchAlgorithmException e) {
            privatekey = "wrong";
        }
        return jdbcTemplate.update(sql, user.getnuid(), user.getPassword(), "student", privatekey);
    }

    /**
     * Select the user information from user table when sign in.
     * @param user The user object that need to sign in.
     * @return The list that contains a map of row.
     */
    public boolean signinUser(UserForm user) {
        String sql = "select * from user where NUID = ? and PASSWORD = ?";
        return !jdbcTemplate.queryForList(sql, user.getnuid(), user.getPassword()).isEmpty();
    }
    

}