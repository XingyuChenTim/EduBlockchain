package edu.UNO.blockChain.form;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
/**
 * This class is the poll mapper.
 * @author fire-holder
 *
 */
public class PollMapper implements RowMapper<Pollform>{
	/**
	 * To map a row of transaction.
	 * @param rs The result set.
	 * @param rowNum The number of rows.
	 * @return The poll that have set each data value.
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