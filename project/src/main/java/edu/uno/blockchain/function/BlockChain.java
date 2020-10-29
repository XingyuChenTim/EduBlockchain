package edu.uno.blockchain.function;

public class BlockChain {
	public static int difficulty = 5;

	public static void main(String[] args) {	
		
		System.out.println("Trying to Mine block ... ");
		Block pending = new Block("The transaction details", "ad799c76e990cb5553dcb2fdd932b0f0650e98e4366f5506eaf0fc1918f45cb0");
		pending.mineBlock(difficulty);
		System.out.println("Block Mined!!! : " + pending.blockheader);
		System.out.println("The nonce is : " + pending.nonce);
	}
}
