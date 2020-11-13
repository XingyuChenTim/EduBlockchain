package edu.UNO.blockChain.form;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class searchBarMapper implements RowMapper<blockChainform>{
    @Override
	public blockChainform mapRow(ResultSet rs, int rowNum) throws SQLException {
		blockChainform blkf = new blockChainform();

        blkf.setBlockheader(rs.getString("blockheader"));

        blkf.setTransaction(rs.getString("transaction"));

		return blkf;
	}
}