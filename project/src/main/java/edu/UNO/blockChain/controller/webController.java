package edu.UNO.blockChain.controller;

import java.lang.reflect.Array;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.UNO.blockChain.form.UserForm;
import edu.UNO.blockChain.form.createTransactionForm;
import edu.UNO.blockChain.repository.UserRepository;
import edu.UNO.blockChain.repository.createTransactionRepository;

/*
 * This class is the web controller.
 * Will try to use RestController in the future implemetation
 */
@Controller
public class webController {

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    createTransactionRepository createTransactionRepository;
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
    
    @GetMapping("/getAllTokens")
    public String getAllTokens(Model model) {
    	List<createTransactionForm> ctf = createTransactionRepository.findByTokens();
    	/*
    	TO test if the data is being received from the repo.
    	
    	for (createTransactionForm c : ctf) {
    		System.out.println(c.getSender());
    	}
    	*/
    	
    	model.addAttribute("tokenList", ctf);
    	return "getAllTokens";
    }
    /*
     * Get mapping and create the transaction, then go to the transaction page.
     * This might be changed to avoid the circular error.
     */
    @GetMapping("/createTransaction")
    public String createTransaction(Model model) {
    	createTransactionForm createtrans = new createTransactionForm();
    	model.addAttribute("createtrans",createtrans);
        return "createTransaction";
    } 
    /*
     * Post mapping and go to the user page if the transaction was created.
     */
    @PostMapping(value = "/createTransaction")
    public String createTransaction(@ModelAttribute("createtrans") createTransactionForm createtrans) {
    	createTransactionRepository.createTransaction(createtrans);
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
