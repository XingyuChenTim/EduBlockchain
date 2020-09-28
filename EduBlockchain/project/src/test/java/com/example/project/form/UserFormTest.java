package com.example.project.form;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserFormTest {

	private UserForm u = new UserForm();
	@Test
	public void testConstructorOne() {
		u.setPassword("123456");
		assertEquals(u.getPassword(), "123456");
	}
	
	@Test
	public void testSetWallet() {
		u.setWallet(123.2);
		assertEquals(u.getWallet(), 123.2);
	}
	
	@Test
	public void testSetUsername() {
		u.setUsername("Hello");
		assertEquals(u.getUsername(), "Hello");
	}
	
<<<<<<< Updated upstream
	@Test
	public void testToString() {
		assertEquals(u.toString(), "UserForm [password=" + u.getPassword() + ", username=" 
	+ u.getUsername() + ", wallet=" + u.getWallet() + "]");
	}
}
=======

}
>>>>>>> Stashed changes
