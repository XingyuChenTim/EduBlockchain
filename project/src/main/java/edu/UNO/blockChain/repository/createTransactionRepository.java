package edu.UNO.blockChain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.UNO.blockChain.form.createTransactionForm;

/*
 * Transaction repository
 * Repository that stores transaction information.
 */

@Repository
public class createTransactionRepository {
	
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int createTransaction(createTransactionForm createForm){
    	jdbcTemplate.execute("DROP TABLE IF EXISTS transaction");
    	jdbcTemplate.execute("create table transaction (SENDER varchar(32), RECEIVER varchar(32), AMOUNT int, HASHID varchar(64))");
        String sql = "insert into transaction(SENDER,RECEIVER,AMOUNT,HASHID) values(?,?,?,?)";
        return jdbcTemplate.update(sql, createForm.getSender(), createForm.getReceiver(), createForm.getAmount(), createForm.getHashid());
        
    }

}
