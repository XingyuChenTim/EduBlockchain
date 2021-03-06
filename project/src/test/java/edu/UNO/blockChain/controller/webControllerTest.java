package edu.UNO.blockChain.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import edu.UNO.blockChain.controller.webController;

public class webControllerTest {
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new webController()).build();
	}
	
	@Test
	public void testHome() throws Exception {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new webController()).build();
		this.mockMvc.perform(get("/")
				.accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
		.andExpect(status().isOk());
	}
	/*
	 * Fails.
	 * Will get circular error using the same name as template
	 */
	@Test
	public void testRegister() throws Exception {
		this.mockMvc.perform(get("/register")
				.accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
		.andExpect(status().isOk());
	}
	/*
	 * Fails.
	 * Will get circular error using the same name as template
	 */
	@Test
	public void testLogin() throws Exception {
		this.mockMvc.perform(get("/sign")
				.accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
		.andExpect(status().isOk());
	}
	/*
	 * Fails.
	 * Will get circular error using the same name as template
	 */
	@Test
	public void testSha256() throws Exception {
		this.mockMvc.perform(get("/sha256")
				.accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
		.andExpect(status().isOk());
	}

}

