package edu.uno.blockchain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.uno.blockchain.form.UserForm;
import edu.uno.blockchain.form.Broadcastform;
import edu.uno.blockchain.repository.UserRepository;
import edu.uno.blockchain.repository.Broadcastrepo;

/*
 * This class is the web controller.
 * Will try to use RestController in the future implemetation
 */
@Controller
public class WebController {

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    Broadcastrepo broadcastrepo;

    /*
	 * Get mapping and go to the home page.
	 */
    @GetMapping("/")
    public String home() {
        return "home";
    }
    /*
	 * Get mapping and go to the register page.
	 * This might be changed to avoid the circular error.
	 */
    @GetMapping("/register")
    public String register() {
        return "register";
    }
    /*
     * Get mapping and go to the login page.
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/sign")
    public String login() {
        return "sign";
    }
    /*
     * Get mapping and go to the user page.
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/user")
    public String user() {
        return "user";
    }
    /*
     * Get mapping and go to the sha256 page.
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/sha256")
    public String hash() {
        return "sha256";
    }
    /*
     * Get mapping and go to the block page.
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/block")
    public String block() {
        return "block";
    }
    /*
     * Get mapping and create the transaction, then go to the transaction page.
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/broadcast")
    public String createTransaction(Model model) {
    	Broadcastform createtrans = new Broadcastform();
    	model.addAttribute("createtrans",createtrans);
        return "broadcast";
    } 
    /*
     * Post mapping and go to the user page if the transaction was created.
     */
    @PostMapping(value = "/broadcast")
    public String createTransaction(@ModelAttribute("createtrans") Broadcastform createtrans) {
    	broadcastrepo.createTransaction(createtrans);
        return "user";
    }
    /*
     * Post mapping and go to the user page if signed in successfully.
     * Remain in the sign in page if unsuccessful.
     */
    @PostMapping(value = "/sign")
    public String login(UserForm sig) {
        if (userRepository.signinUser(sig)) {
            return "user";
        }
        return "sign";
    }
    /*
     * Post mapping and go to the home page if registered.
     */
    @PostMapping(value = "/register")
    public String userInfo(UserForm reg) {
        userRepository.registerUser(reg);
        return "home";
    }

}
