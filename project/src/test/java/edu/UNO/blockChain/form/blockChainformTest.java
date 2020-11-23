package edu.UNO.blockChain.form;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class blockChainformTest {

	private blockChainform b = new blockChainform();
	@Test
	public void testConstructor() {
		blockChainform bl = new blockChainform(12, "hehe", "123", "haha", "ccc", "fff", "eee", "ooo", 23, "jjj");
		assertEquals(bl.getId(), 12);
		assertEquals(bl.getBlockheader(), "hehe");
		assertEquals(bl.getNonce(), "123");
		assertEquals(bl.getPreviousblock(), "haha");
		assertEquals(bl.getTimestamp(), "ccc");
		assertEquals(bl.getTransaction(), "fff");
		assertEquals(bl.getSender(), "eee");
		assertEquals(bl.getReceiver(), "ooo");
		assertEquals(bl.getAmount(), 23);
		assertEquals(bl.getDate(), "jjj");
	}
	
	@Test
	public void testSetBlockheader() {
		b.setBlockheader("fjiewojf");
		assertEquals(b.getBlockheader(), "fjiewojf");
	}
	
	@Test
	public void testSetNonce() {
		b.setNonce("jfdewijf");
		assertEquals(b.getNonce(), "jfdewijf");
	}
	
	@Test
	public void testSetPreviousblock() {
		b.setPreviousblock("dsaDW");
		assertEquals(b.getPreviousblock(), "dsaDW");
	}
	
	@Test
	public void testSetTimestamp() {
		b.setTimestamp("eees");
		assertEquals(b.getTimestamp(), "eees");
	}
	
	@Test
	public void testSetTransaction()  {
		b.setTransaction("huih");
		assertEquals(b.getTransaction(), "huih");
	}
	
	@Test
	public void testSetId()  {
		b.setId(78);
		assertEquals(b.getId(), 78);
	}
	
	@Test
	public void testSetSender()  {
		b.setSender("jioj");
		assertEquals(b.getSender(), "jioj");
	}
	
	@Test
	public void testSetReceiver()  {
		b.setReceiver("hiouk");
		assertEquals(b.getReceiver(), "hiouk");
	}
	
	@Test
	public void testSetAmount()  {
		b.setAmount(8908);
		assertEquals(b.getAmount(), 8908);
	}
	
	@Test
	public void testDate()  {
		b.setDate("dfygui");
		assertEquals(b.getDate(), "dfygui");
	}
}
