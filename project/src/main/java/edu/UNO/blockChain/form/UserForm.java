package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/*
 * The class of user object.
 */
@EntityScan
public class UserForm {
	/*
	 * Variables of username, password and walletBalance.
	 */
    private String username;
    private String password;
    private Double wallet;

    public UserForm() {
        super();
    }
    /*
     * Get method for user name.
     */
    public String getUsername() {
        return username;
    }
    /*
     * Set method for user name.
     */
    public void setUsername(String username) {
        this.username = username;
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
    public Double getWallet() {
        return wallet;
    }
    /*
     * Set method for wallet.
     */
    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

}