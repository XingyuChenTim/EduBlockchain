package edu.uno.blockchain.function;

import java.util.Date;

public class Block {
	public String blockheader;
	private int nonce;
	public int difficulty;
	private long timeStamp;
	public String previousHash; 
	private String transaction; 

	//Block Constructor.  
	public Block(String transaction,String previousHash) {
		this.transaction = transaction;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.blockheader = calculateBlockHeader(); //Making sure we do this after we set the other values.
	}
	
	//Calculate new hash based on blocks contents
	public String calculateBlockHeader() {
		String calculatedBlockHeader = StringUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				Integer.toString(nonce) + 
				transaction 
				);
		return calculatedBlockHeader;
	}
	
	//Increases nonce value until hash target is reached.
	public void mineBlock(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!blockheader.substring( 0, difficulty).equals(target)) {
			nonce ++;
			blockheader = calculateBlockHeader();
		}
		System.out.println("Block Mined!!! : " + blockheader);
	}
}