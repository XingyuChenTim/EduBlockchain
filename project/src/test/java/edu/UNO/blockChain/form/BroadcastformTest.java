package edu.UNO.blockChain.form;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BroadcastformTest {
	
	
	private Broadcastform b = new Broadcastform();
	
	@Test
	public void testConstructor() {
		Broadcastform bc = new Broadcastform("hh", 12, "ii");
		assertEquals(bc.getAmount(), 12);
		assertEquals(bc.getHashid(), "ii");
		assertEquals(bc.getReceiver(), "hh");
	}
	
	@Test
	public void testSetAmount() {
		b.setAmount(122);
		assertEquals(b.getAmount(), 122);
	}
	
	@Test
	public void testSetHashid() {
		b.setHashid("aaa");
		assertEquals(b.getHashid(), "aaa");
	}
	
	@Test
	public void testSetReceiver() {
		b.setReceiver("bbb");
		assertEquals(b.getReceiver(), "bbb");
	}
}
