package edu.UNO.blockChain.form;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
/**
 * 
 * @author fire-holder
 *
 */
public class PollMapper implements RowMapper<Pollform>{
	/**
	 * 
	 * @param rs
	 * @param rowNum
	 * @return
	 * @throws SQLException
	 */
    @Override
	public Pollform mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pollform createTrans = new Pollform();
		createTrans.setId(rs.getInt("id"));
        createTrans.setAmount(rs.getInt("amount"));
        createTrans.setFee(rs.getInt("fee"));

        createTrans.setHash(rs.getString("hash"));
        createTrans.setDate(rs.getString("date"));
        createTrans.setSender(rs.getString("sender"));
        createTrans.setReceiver(rs.getString("receiver"));

		return createTrans;
	}
}