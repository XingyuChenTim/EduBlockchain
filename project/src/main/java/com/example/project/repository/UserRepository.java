package com.example.project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getAllUserNames(){
        List<String> usernameList = new ArrayList<>();
        usernameList.addAll(jdbcTemplate.queryForList("select username from myTable",String.class));
        return usernameList;
    }
}
