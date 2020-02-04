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

}
