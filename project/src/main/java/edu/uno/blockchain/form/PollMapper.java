package edu.uno.blockchain.form;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PollMapper implements RowMapper<Pollform>{
    @Override
	public Pollform mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pollform createTrans = new Pollform();
		createTrans.setId(rs.getInt("id"));
        createTrans.setAmount(rs.getInt("amount"));
        createTrans.setDate(rs.getString("date"));
        createTrans.setFee(rs.getInt("fee"));
        createTrans.setReceiver(rs.getString("receiver"));
        createTrans.setSender(rs.getString("sender"));
        createTrans.setHash(rs.getString("hash"));
		return createTrans;
	}
}