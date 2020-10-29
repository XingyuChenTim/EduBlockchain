package edu.uno.blockchain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Date;
import edu.uno.blockchain.form.Broadcastform;

/*bodc
 * Transaction repository
 * Repository that stores transaction information.
 */

@Repository
public class Broadcastrepo {
	
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int createTransaction(Broadcastform createForm){
        String sql = "insert into transactionpoll(id, amount, fee, hash, date, sender, receiver) values(?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, 1, createForm.getAmount(), 1, createForm.getHashid(), new Date().getTime(), createForm.getSender(), createForm.getReceiver());
    }

}
