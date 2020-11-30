package edu.UNO.blockChain.form;
/**
 * The class for block chain object.
 * @author fire-holder
 *
 */
    public class blockChainform {
    private int id;
    private String sender;
    private String receiver;
    private int amount;
    private String date;
    private String blockheader;
    private String nonce;
    private String previousblock;
    private String transaction;
    private String timestamp;
    /**
	 * Default constructor
	 */
    public blockChainform() {
    }
    /**
     * Constructor to set id, block header, nonce, previous block, timestamp, transaction, sender
     * receiver, amount and date.
     * @param id An int of id.
     * @param blockheader A string of block header.
     * @param nonce A string of nonce.
     * @param previousblock A string of previous block.
     * @param timestamp A string of time stamp.
     * @param transaction A string of transaction.
     * @param sender A string of sender.
     * @param receiver A string of receiver.
     * @param amount An int of amount.
     * @param date A string of date.
     */
    public blockChainform(int id, String blockheader, String nonce, String previousblock, 
    		String timestamp, String transaction, String sender, String receiver, int amount, String date) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.date = date;
        this.blockheader = blockheader;
        this.nonce = nonce;
        this.previousblock = previousblock;
        this.timestamp = timestamp;
        this.transaction = transaction;
        
    }
    /**
     * Get method for block header. 
     * @return String of block header.
     */
    public String getBlockheader() {
        return blockheader;
    }
    /**
     * Set method for block header.
     * @param blockheader The string of block header.
     */
    public void setBlockheader(String blockheader) {
        this.blockheader = blockheader;
    }
    /**
     * Get method for nonce.
     * @return String of nonce.
     */
    public String getNonce() {
        return nonce;
    }
    /**
     * Set method for nonce.
     * @param nonce The string of nonce.
     */
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }
    /**
     * Get method for previous block.
     * @return The string of previous block.
     */
    public String getPreviousblock() {
        return previousblock;
    }
    /**
     * Set method for previous block.
     * @param previousblock The string of previous block.
     */
    public void setPreviousblock(String previousblock) {
        this.previousblock = previousblock;
    }
    /**
     * Get method for time stamp.
     * @return The string of time stamp.
     */
    public String getTimestamp() {
        return timestamp;
    }
    /**
     * Set method for time stamp.
     * @param timestamp The string of time stamp.
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    /**
     * Get method for transaction.
     * @return The string of transaction.
     */
    public String getTransaction() {
        return transaction;
    }
    /**
     * Set method for transaction.
     * @param transaction The string of transaction.
     */
    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
    /**
     * Get method for ID.
     * @return An int of ID.
     */
    public int getId() {
        return id;
    }
    /**
     * Set method for ID.
     * @param id The int of ID.
     */
    public void setId(int id) {
        this.id = id;
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
     * @param sender The string of sender.
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
     * @param receiver The string of receiver.
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
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
     * @param amount The int of amount.
     */
    public void setAmount(int amount) {
        this.amount = amount;
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
     * @param date The string of date.
     */
    public void setDate(String date) {
        this.date = date;
    }
   
}
