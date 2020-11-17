package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;
/**
 * The class for poll object.
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
     * Default constructor.
     */
    public Pollform() {
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
     * Get method for amount.
     * @return The int of amount.
     */
    public int getAmount() {
        return amount;
    }
    /**
     * Set method for amount.
     * @param amount The int to be set as amount.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    /**
     * Get method for fee.
     * @return The int of fee.
     */
    public int getFee() {
        return fee;
    }
    /**
     * Set method for fee.
     * @param fee The int to be set as fee.
     */
    public void setFee(int fee) {
        this.fee = fee;
    }
    /**
     * Get method for hash.
     * @return The string of hash.
     */
    public String getHash() {
        return hash;
    }
    /**
     * Set method for hash.
     * @param hash The String to be set as hash.
     */
    public void setHash(String hash) {
        this.hash = hash;
    }
    /**
     * Get method for date.
     * @return The string of date.
     */
    public String getDate() {
        return date;
    }
    /**
     * Set method for date.
     * @param date The string to be set as date.
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * Get method for sender.
     * @return The string of sender.
     */
    public String getSender() {
        return sender;
    }
    /**
     * Set method for sender.
     * @param sender The string to be set as sender.
     */
    public void setSender(String sender) {
        this.sender = sender;
    }
    /**
     * Get method for receiver.
     * @return The string of receiver.
     */
    public String getReceiver() {
        return receiver;
    }
    /**
     * Set method for receiver.
     * @param receiver The string to be set as receiver.
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    /**
     * The constructor to set with id, amount, fee, hash, date, sender and receiver.
     * @param id The int to be set as id.
     * @param amount The int to be set as amount.
     * @param fee The int to be set as fee.
     * @param hash The string to be set as hash.
     * @param date The string to be set as date.
     * @param sender The string to be set as sender.
     * @param receiver The string to be set as receiver.
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
