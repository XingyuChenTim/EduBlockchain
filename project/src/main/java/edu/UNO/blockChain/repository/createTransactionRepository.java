package edu.UNO.blockChain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import edu.UNO.blockChain.form.createTransactionForm;
import edu.UNO.blockChain.form.createTransactionMapper;

/*
 * Transaction repository
 * Repository that stores transaction information.
 */

@Repository
public class createTransactionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int createTransaction(createTransactionForm createForm){
		
		//Generate Random string for tokens
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	 
	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	    
	    //Drop tables for testing purposes so that data dont get overcrowded in the database
//		jdbcTemplate.execute("DROP TABLE IF EXISTS transaction");
//		jdbcTemplate.execute("create table transaction (SENDER varchar(32), RECEIVER varchar(32), AMOUNT int, Token varchar(64), HASHID varchar(64))");
		String sql = "insert into transaction(SENDER,RECEIVER,AMOUNT,Token,HASHID) values(?,?,?,?,?)";
		return jdbcTemplate.update(sql, createForm.getSender(), createForm.getReceiver(), createForm.getAmount(), generatedString, createForm.getHashid());

	}

	public List<createTransactionForm> findByTokens(){

		return jdbcTemplate.query("SELECT SENDER,Token FROM transaction", new createTransactionMapper());
		
	}

}
