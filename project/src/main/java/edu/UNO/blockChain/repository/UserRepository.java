package edu.UNO.blockChain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.UNO.blockChain.form.UserForm;
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
    public int registerUser(UserForm user){
        String sql = "insert into userform(USERNAME,PASSWORD,WALLET) values(?,?,?)";
        return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), 0);
    }
    /*
     * Select the user information from myTable when sign in.
     */
    public boolean signinUser(UserForm user){
        String sql = "select * from userform where USERNAME = ? and PASSWORD = ?";
        return !jdbcTemplate.queryForList(sql, user.getUsername(), user.getPassword()).isEmpty();
    }
}
