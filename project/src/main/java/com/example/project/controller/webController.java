package com.example.project.controller;

import com.example.project.form.UserForm;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// Will try to use RestControlller in the future implemetation
@Controller
public class WebController {

    @Autowired
    UserRepository userRepository;

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

    @GetMapping("/sha256")
    public String hash() {
        return "sha256";
    }

    @GetMapping("/block")
    public String block() {
        return "block";
    }

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

    @PostMapping(value = "/register")
    public String userInfo(UserForm reg) {
        userRepository.registerUser(reg);
        return "home";
    }

}
