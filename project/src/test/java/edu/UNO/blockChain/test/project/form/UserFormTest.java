package edu.UNO.blockChain.test.project.form;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.UNO.blockChain.form.UserForm;

class UserFormTest {

	private UserForm u = new UserForm();
	@Test
	public void testConstructorOne() {
		u.setPassword("123456");
		assertEquals("123456", u.getPassword());
	}
	
	//@Test
	//public void testSetWallet() {
		//u.setWallet(123.2);
		//assertEquals(u.getWallet(), 123.2);
	//}
	
	//@Test
	//public void testSetUsername() {
		//u.setUsername("Hello");
		//assertEquals(u.getUsername(), "Hello");
	//}
}