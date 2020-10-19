package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/*
 * The class for transaction object.
 */
@EntityScan
public class createTransactionForm {
	private String sender;
	private String receiver;
	private int amount;
	private String token;
	private String hashid;
	
	/*
	 * Default constructor
	 */
	public createTransactionForm () {
	}
	
	/*
	 * Constructor with initial value.
	 */
	public createTransactionForm(String sender, String receiver, int amount, String token, String hashid) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
		this.token = token;
		this.hashid = hashid;
	}
	/*
	 * Get method for sender.
	 */
	public String getSender() {
		return sender;
	}
	/*
	 * Set method for sender.
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}
	/*
	 * Get method for receiver.
	 */
	public String getReceiver() {
		return receiver;
	}
	/*
	 * Set method for receiver.
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	/*
	 * Get method for amount.
	 */
	public int getAmount() {
		return amount;
	}
	/*
	 * Set method for amount.
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/*
	 * Get method for hash id.
	 */
	public String getHashid() {
		return hashid;
	}
	/*
	 * Set method for hash id.
	 */
	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
	
	/*
	 * Get method for getToken
	 */
	public String getToken() {
		return token;
	}

	/*
	 * Set method for set Token
	 */
	public void setToken(String token) {
		this.token = token;
		
	}

}
