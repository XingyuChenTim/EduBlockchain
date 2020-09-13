package com.example.project.controller;

import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/capstone")
public class webController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/home")
    public String home(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name){
        model.addAttribute("name", "name");
        return "home";
    }
}
