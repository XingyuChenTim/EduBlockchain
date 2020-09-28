package com.example.project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.project.form.UserForm;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int registerUser(UserForm user){
        String sql = "insert into myTable(USERNAME,PASSWORD,WALLET) values(?,?,?)";
        return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), 0);
    }

    public boolean signinUser(UserForm user){
        String sql = "select * from myTable where USERNAME = ? and PASSWORD = ?";
        return !jdbcTemplate.queryForList(sql, user.getUsername(), user.getPassword()).isEmpty();
    }
}
