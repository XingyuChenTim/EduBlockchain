package edu.UNO.blockChain.form;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
/**
 * 
 * @author fire-holder
 *
 */
public class TokenMapper implements RowMapper<Tokenform> {
	/**
	 * 
	 * @param rs
	 * @param rowNum
	 * @return 
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