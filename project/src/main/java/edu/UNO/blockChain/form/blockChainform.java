package edu.UNO.blockChain.form;

// public class blockChainform extends Pollform{
    public class blockChainform {
    private int id;
    private String blockheader;
    private String nonce;
    private String previousblock;
    private String transaction;
    private String timestamp;

    public blockChainform() {
    }

    public blockChainform(int id,String blockheader,String nonce,String previousblock,String timestamp,String transaction) {
        this.id = id;
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
    
}
