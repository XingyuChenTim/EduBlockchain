package com.example.project.controller;

import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/capstone")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/getusernames")
    public List<String> getAllUserNames(){
        return userRepository.getAllUserNames();
    }
}
