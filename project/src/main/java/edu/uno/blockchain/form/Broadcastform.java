package edu.UNO.blockChain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * The class for transaction object.
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
	 * 
	 * @param receiver
	 * @param amount
	 * @param hashid
	 */
	public Broadcastform(String receiver, int amount, String hashid) {
        this.receiver = receiver;
        this.amount = amount;
        this.hashid = hashid;
    }

	/**
	 * Get method for receiver.
	 * @return
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * Set method for receiver.
	 * @param receiver
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * Get method for amount.
	 * @return
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Set method for amount.
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * Get method for hash id.
	 * @return
	 */
	public String getHashid() {
		return hashid;
	}

	/**
	 * Set method for hash id.
	 * @param hashid
	 */
	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
}
