package com.example.project.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class createTransactionForm {
	private String senderName;
	private String receiverName;
	private int amount;
	private String hashid;
	
	public createTransactionForm () {
		 super();
	}

	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
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
