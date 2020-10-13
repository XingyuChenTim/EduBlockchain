package edu.uno.blockchain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/*
 * The class of user object.
 */

@EntityScan
public class UserForm {
	/*
	 * Variables of UNID, password and walletBalance.
	 */
    private String unid;
    private String password;
    private Integer wallet;
    private String authority;

    public UserForm() {
        super();
    }
    /*
     * Get method for user name.
     */
    public String getunid() {
        return unid;
    }
    /*
     * Set method for user name.
     */
    public void setunid(String unid) {
        this.unid = unid;
    }
    /*
     * Get method for password.
     */
    public String getPassword() {
        return password;
    }
    /*
     * Set method for password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /*
     * Get method for wallet.
     */
    public Integer getWallet() {
        return wallet;
    }
    /*
     * Set method for wallet.
     */
    public void setWallet(Integer wallet) {
        this.wallet = wallet;
    }
    /*
     * Get method for authority.
     */
    public String getAUTHORITY() {
        return authority;
    }
    /*
     * Set method for authority.
     */
    public void setAUTHORITY(String aUTHORITY) {
        this.authority = aUTHORITY;
    }

}