package com.example.project.controller;

import com.example.project.form.UserForm;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * This class is the web controller.
 * Will try to use RestController in the future implemetation
 */

@Controller
public class webController {

    @Autowired
    UserRepository userRepository;
	/*
	 * Get mapping and go to the home page
	 */
    @GetMapping("/")
    public String home() {
        return "home";
    }
	/*
	 * Get mapping and go to the register page
	 * This might be changed to avoid the circular error.
	 */
    @GetMapping("/register")
    public String register() {
        return "register";
    }
    /*
     * Get mapping and go to the register page
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/sign")
    public String login() {
        return "sign";
    }
    /*
     * Get mapping and go to the sha256 page
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/sha256")
    public String hash() {
        return "sha256";
    }
    /*
     * Get mapping and go to the block page
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/block")
    public String block() {
        return "block";
    }
    
   /*
    * Post mapping and go to the user page if signed in successfully
    * Remain in the sign in page if unsuccessful
    */
    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @PostMapping(value = "/sign")
    public String login(UserForm sig) {
        if (userRepository.signinUser(sig)) {
            return "user";
        }
        return "sign";
    }
    /*
     * Post mapping and go to the home page if registered
     */
    @PostMapping(value = "/register")
    public String userInfo(UserForm reg) {
        userRepository.registerUser(reg);
        return "home";
    }

}
