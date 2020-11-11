package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * The class is the object of token.
 * @author fire-holder
 *
 */
@EntityScan
public class Tokenform {
    private int id;
    private String token;
    private String owner;

    /**
     * Default constructor.
     */
    public Tokenform() {
        super();
    }
    /**
     * Get method for id.
     * @return The int of id.
     */
    public int getId() {
        return id;
    }
    /**
     * Set method for id.
     * @param id The int to be set as id.
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Get method for token.
     * @return The string of token.
     */
    public String getToken() {
        return token;
    }
    /**
     * Set method for token.
     * @param token The String to be set as token.
     */
    public void setToken(String token) {
        this.token = token;
    }
    /**
     * The constructor which set the id, token and owner.
     * @param id The int to be set as id.
     * @param token The String to be set as token.
     * @param owner The String to be set as owner.
     */
    public Tokenform(int id, String token, String owner) {
        this.id = id;
        this.token = token;
        this.owner = owner;
    }
    /**
     * Get method for owner.
     * @return The string of owner.
     */
    public String getOwner() {
        return owner;
    }
    /**
     * Set method for owner.
     * @param owner The string to be set as owner.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

}
