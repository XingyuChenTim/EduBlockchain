package edu.UNO.blockChain.form;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
/**
 * This class is the token mapper.
 * @author fire-holder
 *
 */
public class TokenMapper implements RowMapper<Tokenform> {
	/**
	 * To map a row of token.
	 * @param rs The result set.
	 * @param rowNum The number of rows.
	 * @return The token that have set each data value.
	 * @throws SQLException 
	 */
	@Override
	public Tokenform mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tokenform createTrans = new Tokenform();
		createTrans.setId(rs.getInt("id"));
		createTrans.setToken(rs.getString("token"));
		createTrans.setOwner(rs.getString("owner"));
		return createTrans;
	}
}