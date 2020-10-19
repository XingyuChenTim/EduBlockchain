package edu.UNO.blockChain.form;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class createTransactionMapper implements RowMapper<createTransactionForm>{

	@Override
	public createTransactionForm mapRow(ResultSet rs, int rowNum) throws SQLException {
		createTransactionForm createTrans = new createTransactionForm();
		createTrans.setSender(rs.getString("SENDER"));
//		createTrans.setReceiver(rs.getString("RECEIVER"));
//		createTrans.setAmount(rs.getInt("AMOUNT"));
//		createTrans.setHashid(rs.getString("HASHID"));
		createTrans.setToken(rs.getString("Token"));
		return createTrans;
	}

}
