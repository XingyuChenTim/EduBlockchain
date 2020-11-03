package edu.uno.blockchain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import edu.uno.blockchain.form.Broadcastform;
import edu.uno.blockchain.form.Tokenform;
import edu.uno.blockchain.form.TokenMapper;

/*bodc
 * Transaction repository
 * Repository that stores transaction information.
 */

@Repository
public class Broadcastrepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int createTransaction(Broadcastform createForm) {
        String sql = "insert into transactionpoll(id, amount, fee, hash, date, sender, receiver) values(?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, 1, createForm.getAmount(), 1, createForm.getHashid(), new Date().getTime(),
                createForm.getSender(), createForm.getReceiver());
    }

    public List<Tokenform> findByTokens() {

        return jdbcTemplate.query("SELECT id,token FROM token09255062", new TokenMapper());

    }
}
