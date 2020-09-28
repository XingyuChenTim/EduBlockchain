package com.example.project.controller;

import com.example.project.form.UserForm;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// Will try to use RestControlller in the future implemetation
@Controller
public class webController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    //Changed the getmapping to from register to regist to avoid circular view path error.
    @GetMapping("/regist")
    public String register() {
        return "register";
    }
    
    //Changed the getmapping to from sign to login to avoid circular view path error.
    @GetMapping("/login")
    public String login() {
        return "sign";
    }
<<<<<<< Updated upstream

    @PostMapping(value = "/sign")
=======
    
    //Changed the getmapping to from sha256 to sha to avoid circular view path error.
    @GetMapping("/sha")
    public String hash() {
        return "sha256";
    }

    //Changed the postmapping to from sign to login to avoid circular view path error.
    @PostMapping(value = "/login")
>>>>>>> Stashed changes
    public String login(UserForm sig) {
        if (userRepository.signinUser(sig)) {
            return "user";
        }
        return "sign";
    }
    
    //Changed the postmapping to from register to regist to avoid circular view path error.
    @PostMapping(value = "/regist")
    public String userInfo(UserForm reg) {
        userRepository.registerUser(reg);
        return "home";
    }
    
    /*@PostMapping("/error")
    public String error() {
    	return "err";
    }*/
}
