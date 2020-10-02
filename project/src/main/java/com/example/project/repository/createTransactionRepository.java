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
    	//jdbcTemplate.execute("create table transaction (SENDER varchar(32) not null, RECEIVER varchar(32) not null, AMOUNT int not null, HASHID varchar(32) not null)");
        String sql = "insert into transaction(SENDER,RECEIVER,AMOUNT,HASHID) values(?,?,?,?)";
        return jdbcTemplate.update(sql, createForm.getSenderName(), createForm.getReceiverName(), createForm.getAmount(), createForm.getHashid());
        
    }

}
