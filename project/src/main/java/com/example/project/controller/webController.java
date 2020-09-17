package com.example.project.controller;

import com.example.project.form.LoginForm;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String home1(){
        return "home";
    }

    @GetMapping("/home")
    public String home2(){
        return "home";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping(value="/login")
    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        if("test".equals(username) && "test".equals(password)) {
            return "user";
        }
        model.addAttribute("invalidCredentials", true);
        return "login";
    }

    @RequestMapping("/registeruser")
    public String userInfo(LoginForm reg) {
        userRepository.registerUser(reg);
        return "registeruser";
    }
    
}
