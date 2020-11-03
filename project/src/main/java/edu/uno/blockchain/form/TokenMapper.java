package edu.uno.blockchain.form;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TokenMapper implements RowMapper<Tokenform> {
	@Override
	public Tokenform mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tokenform createTrans = new Tokenform();
		createTrans.setId(rs.getInt("id"));
		createTrans.setToken(rs.getString("token"));
		return createTrans;
	}
}