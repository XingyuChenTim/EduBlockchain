package edu.UNO.blockChain.form;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TokenformTest {
	
	private Tokenform t = new Tokenform();
	@Test
	public void testConstructor() {
		Tokenform tf = new Tokenform(256, "gg", "mm");
		assertEquals(tf.getId(), 256);
		assertEquals(tf.getToken(), "gg");
		assertEquals(tf.getOwner(), "mm");
	}
	
	@Test
	public void testSetId() {
		t.setId(8899);
		assertEquals(t.getId(), 8899);
	}
	
	@Test
	public void testSetToken() {
		t.setToken("hola");
		assertEquals(t.getToken(), "hola");
	}
	
	@Test
	public void testSetOwner() {
		t.setOwner("bye");
		assertEquals(t.getOwner(), "bye");
	}
}
