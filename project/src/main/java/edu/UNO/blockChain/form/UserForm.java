package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * The class of user object.
 * @author fire-holder
 *
 */

@EntityScan
public class UserForm {
	/**
	 * Variables of UNID, password and walletBalance.
	 */
    private String nuid;
    private String password;
    private String authority;
    private String privatekey;

    public UserForm() {
        super();
    }
    /**
     * Get method for user name.
     * @return The string of NUID.
     */
    public String getnuid() {
        return nuid;
    }
    /**
     * Set method for user name.
     * @param unid The string to be set as NUID.
     */
    public void setnuid(String unid) {
        this.nuid = unid;
    }
    /**
     * Get method for password.
     * @return The string of password.
     */
    public String getPassword() {
        return password;
    }
    /**
     * Set method for password.
     * @param password The string to be set as password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Get method for authority.
     * @return The string of authority.
     */
    public String getAUTHORITY() {
        return authority;
    }
    /**
     * Set method for authority.
     * @param aUTHORITY The string to be set as authority.
     */
    public void setAUTHORITY(String aUTHORITY) {
        this.authority = aUTHORITY;
    }
    /**
     * Get method for private key.
     * @return The string of private key.
     */
	public String getPrivatekey() {
		return privatekey;
	}
	/**
	 * Set method for private key.
	 * @param privatekey The string to be set as private key.
	 */
	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}

}