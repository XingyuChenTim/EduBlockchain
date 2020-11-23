package edu.UNO.blockChain.form;

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

    public blockChainform() {
    }

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

    public String getBlockheader() {
        return blockheader;
    }

    public void setBlockheader(String blockheader) {
        this.blockheader = blockheader;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getPreviousblock() {
        return previousblock;
    }

    public void setPreviousblock(String previousblock) {
        this.previousblock = previousblock;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
   
}
