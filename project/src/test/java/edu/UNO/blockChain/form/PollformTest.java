package edu.UNO.blockChain.form;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PollformTest {
	private Pollform p = new Pollform();
	@Test
	public void testConstructor() {
		Pollform pf = new Pollform(1, 2, 3, "hh", "ww", "wow", "yes");
		assertEquals(pf.getId(), 1);
		assertEquals(pf.getAmount(), 2);
		assertEquals(pf.getFee(), 3);
		assertEquals(pf.getHash(), "hh");
		assertEquals(pf.getDate(), "ww");
		assertEquals(pf.getSender(), "wow");
		assertEquals(pf.getReceiver(), "yes");
	}
	
	@Test
	public void testSetId() {
		p.setId(12580);
		assertEquals(p.getId(), 12580);
	}
	
	@Test
	public void testSetAmount() {
		p.setAmount(12138);
		assertEquals(p.getAmount(), 12138);
	}
	
	@Test
	public void testSetFee() {
		p.setFee(2333);
		assertEquals(p.getFee(), 2333);
	}
	
	@Test
	public void testSetHash() {
		p.setHash("hey");
		assertEquals(p.getHash(), "hey");
	}
	@Test
	public void testSetDate() {
		p.setDate("08/08/18");
		assertEquals(p.getDate(), "08/08/18");
	}
	@Test
	public void testSetSender() {
		p.setSender("Peter");
		assertEquals(p.getSender(), "Peter");
	}
	@Test
	public void testSetReceiver() {
		p.setReceiver("Nancy");
		assertEquals(p.getReceiver(), "Nancy");
	}
}
