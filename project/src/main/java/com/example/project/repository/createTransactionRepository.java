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
    	jdbcTemplate.execute("create table transaction (ID int,SENDER varchar, RECEIVER varchar, AMOUNT int, HASHID varchar, primary key(ID) )");
        String sql = "insert into transaction(ID,SENDER,RECEIVER,AMOUNT,HASHID) values(?,?,?,?,?)";
        return jdbcTemplate.update(sql, 1, createForm.getSenderName(), createForm.getReceiverName(), createForm.getAmount(), createForm.getHashid());
    }

}
