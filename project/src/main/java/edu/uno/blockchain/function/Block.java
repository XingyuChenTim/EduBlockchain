package edu.UNO.blockChain.function;

import java.util.Date;
/**
 * 
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
	 * 
	 * @param transaction
	 * @param previousHash
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
	 * 
	 * @param difficulty
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