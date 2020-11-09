package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;
/**
 * 
 * @author fire-holder
 *
 */
@EntityScan
public class Pollform {
    private int id;
    private int amount;
    private int fee;
    private String hash;
    private String date;
    private String sender;
    private String receiver;
    /**
     * 
     */
    public Pollform() {
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
    public int getAmount() {
        return amount;
    }
    /**
     * 
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    /**
     * 
     * @return
     */
    public int getFee() {
        return fee;
    }
    /**
     * 
     * @param fee
     */
    public void setFee(int fee) {
        this.fee = fee;
    }
    /**
     * 
     * @return
     */
    public String getHash() {
        return hash;
    }
    /**
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }
    /**
     * 
     * @return
     */
    public String getDate() {
        return date;
    }
    /**
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * 
     * @return
     */
    public String getSender() {
        return sender;
    }
    /**
     * 
     * @param sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }
    /**
     * 
     * @return
     */
    public String getReceiver() {
        return receiver;
    }
    /**
     * 
     * @param receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    /**
     * 
     * @param id
     * @param amount
     * @param fee
     * @param hash
     * @param date
     * @param sender
     * @param receiver
     */
    public Pollform(int id, int amount, int fee, String hash, String date, String sender, String receiver) {
        this.id = id;
        this.amount = amount;
        this.fee = fee;
        this.hash = hash;
        this.date = date;
        this.sender = sender;
        this.receiver = receiver;
    }
}
