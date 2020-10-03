package edu.UNO.blockChain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.UNO.blockChain.form.UserForm;
import edu.UNO.blockChain.form.createTransactionForm;
import edu.UNO.blockChain.repository.UserRepository;
import edu.UNO.blockChain.repository.createTransactionRepository;


// Will try to use RestControlller in the future implemetation
@Controller
public class webController {

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    createTransactionRepository createTransactionRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/sign")
    public String login() {
        return "sign";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }
    
    @GetMapping("/sha256")
    public String hash() {
        return "sha256";
    }

    @GetMapping("/block")
    public String block() {
        return "block";
    }
    
    @GetMapping("/createTransaction")
    public String createTransaction(Model model) {
    	createTransactionForm createtrans = new createTransactionForm();
    	model.addAttribute("createtrans",createtrans);
        return "createTransaction";
    } 
    
    @PostMapping(value = "/createTransaction")
    public String createTransaction(@ModelAttribute("createtrans") createTransactionForm createtrans) {
    	createTransactionRepository.createTransaction(createtrans);
        return "user";
    }
    
    @PostMapping(value = "/sign")
    public String login(UserForm sig) {
        if (userRepository.signinUser(sig)) {
            return "user";
        }
        return "sign";
    }

    @PostMapping(value = "/register")
    public String userInfo(UserForm reg) {
        userRepository.registerUser(reg);
        return "home";
    }

}
