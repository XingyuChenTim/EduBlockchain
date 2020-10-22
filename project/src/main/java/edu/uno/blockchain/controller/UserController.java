package edu.uno.blockchain.controller;

import edu.uno.blockchain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/token")
    public List<String> gettokentable(){
        return userRepository.gettokentable();
    }

    @GetMapping(path = "/transactionpoll")
    public List<String> gettransactionpoll(){
        return userRepository.gettransactionpoll();
    }

}
