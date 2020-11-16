package edu.UNO.blockChain.function;

import java.util.Date;
/**
 * The class of block function.
 * @author fire-holder
 *
 */
public class Block {
	public String blockheader;
	public int nonce;
	public long timeStamp;
	private String previousHash;
	private String transaction;
	/**
	 * Constructor to set all the variables with transaction and previous hash.
	 * @param transaction The transaction to be set.
	 * @param previousHash The previous hash to be set.
	 */
	public Block(String transaction, String previousHash) {
		this.nonce = 0;
		this.transaction = transaction;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.blockheader = StringUtil
				.applySha256(previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + transaction);
	}
	/**
	 * Mine the block.
	 * @param difficulty The int of difficulty.
	 */
	public void mineBlock(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty);
		while (!blockheader.substring(0, difficulty).equals(target)) {
			nonce++;
			blockheader = StringUtil
					.applySha256(previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + transaction);
		}
	}
}