package edu.uno.blockchain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/*
 * The class for transaction object.
 */
@EntityScan
public class Broadcastform extends UserForm{
	private String receiver;
	private int amount;
	private String hashid;

	/*
	 * Default constructor
	 */
	public Broadcastform() {
		super();
	}

	public Broadcastform(String receiver, int amount, String hashid) {
        this.receiver = receiver;
        this.amount = amount;
        this.hashid = hashid;
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
}
