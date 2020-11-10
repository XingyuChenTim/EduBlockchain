package edu.uno.blockchain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Pollform {
    private int id;
    private int amount;
    private int fee;
    private String hash;
    private String date;
    private String sender;
    private String receiver;

    public Pollform() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
