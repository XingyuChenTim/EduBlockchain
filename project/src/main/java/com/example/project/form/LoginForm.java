package com.example.project.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class LoginForm {
    private String username;
    private String password;
    private Double wallet;

    public LoginForm() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

}