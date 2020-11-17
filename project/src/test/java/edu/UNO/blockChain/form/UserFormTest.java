package edu.UNO.blockChain.form;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserFormTest {

	private UserForm u = new UserForm();
	@Test
	public void testConstructorOne() {
		u.setPassword("123456");
		assertEquals("123456", u.getPassword());
	}
	@Test
	public void testSetNuid() {
		u.setnuid("1234");
		assertEquals(u.getnuid(), "1234");
	}
	@Test
	public void testSetAUTHORITY() {
		u.setAUTHORITY("Hello");
		assertEquals(u.getAUTHORITY(), "Hello");
	}
	@Test
	public void testSetPrivatekey() {
		u.setPrivatekey("world");
		assertEquals(u.getPrivatekey(), "world");
	}
}
