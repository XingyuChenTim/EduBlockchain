package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * 
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
     * 
     * @return
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return
     */
    public String getToken() {
        return token;
    }
    /**
     * 
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }
    /**
     * 
     * @param id
     * @param token
     * @param owner
     */
    public Tokenform(int id, String token, String owner) {
        this.id = id;
        this.token = token;
        this.owner = owner;
    }
    /**
     * 
     * @return
     */
    public String getOwner() {
        return owner;
    }
    /**
     * 
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

}
