package com.banking.server.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {
    @Id
    private String accountNumber;
    private String role;
    private String password;
    private boolean isLoggedIn;

    public Account() {
    }

    public Account(String accountNumber, String role, String password, boolean isLoggedIn) {
        this.accountNumber = accountNumber;
        this.role = role;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
