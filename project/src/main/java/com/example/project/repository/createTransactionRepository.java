package com.example.project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.project.form.createTransactionForm;



@Repository
public class createTransactionRepository {
	
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int createTransaction(createTransactionForm createForm){
    	jdbcTemplate.execute("DROP TABLE IF EXISTS transaction");
    	jdbcTemplate.execute("create table transaction (SENDER varchar(32), RECEIVER varchar(32), AMOUNT int, HASHID varchar(32))");
        String sql = "insert into transaction(SENDER,RECEIVER,AMOUNT,HASHID) values(?,?,?,?)";
        return jdbcTemplate.update(sql, createForm.getSender(), createForm.getReceiver(), createForm.getAmount(), createForm.getHashid());
        
    }

}
