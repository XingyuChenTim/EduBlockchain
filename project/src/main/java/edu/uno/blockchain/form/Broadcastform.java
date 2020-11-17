package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * The class for broadcast object.
 * @author fire-holder
 *
 */
@EntityScan
public class Broadcastform {
	private String receiver;
	private int amount;
	private String hashid;

	/**
	 * Default constructor
	 */
	public Broadcastform() {
		super();
	}
	/**
	 * Constructor to set the receiver, amount and hash id.
	 * @param receiver String of receiver
	 * @param amount An int for amount
	 * @param hashid String for hash id.
	 */
	public Broadcastform(String receiver, int amount, String hashid) {
        this.receiver = receiver;
        this.amount = amount;
        this.hashid = hashid;
    }

	/**
	 * Get method for receiver.
	 * @return String of receiver.
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * Set method for receiver.
	 * @param receiver String of receiver
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * Get method for amount.
	 * @return An int of amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Set method for amount.
	 * @param amount The int to set the amount.
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * Get method for hash id.
	 * @return String of hash id.
	 */
	public String getHashid() {
		return hashid;
	}

	/**
	 * Set method for hash id.
	 * @param hashid The string to set the hash id.
	 */
	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
}
