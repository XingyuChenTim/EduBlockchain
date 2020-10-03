package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class createTransactionForm {
	private String sender;
	private String receiver;
	private int amount;
	private String hashid;
	
	public createTransactionForm () {
	}
	

	public createTransactionForm(String sender, String receiver, int amount, String hashid) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
		this.hashid = hashid;
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
	public String getHashid() {
		return hashid;
	}
	public void setHashid(String hashid) {
		this.hashid = hashid;
	}

}
