package com.banking.server.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Manager {
    @Id
    private String accountNumber;
    private String branchCode;
    private String username;

    public Manager() {
    }

    public Manager(String accountNumber,String branchCode, String username) {
        this.accountNumber=accountNumber;
        this.branchCode = branchCode;
        this.username = username;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
