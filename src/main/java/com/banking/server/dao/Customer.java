package com.banking.server.dao;

import com.banking.server.TTransaction;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Customer {
    @Id
    private String id;
    private String accountNumber;
    private String username;
    private String branchCode;
    private double balance;
    private boolean isVerified;
    private String verifiedByManagerAccountNo;
    private List<TTransaction> transactions;

    public Customer() {
    }

    public Customer(String accountNumber,String branchCode, String username, List<TTransaction> transactions) {
        this.accountNumber = accountNumber;
        this.branchCode = branchCode;
        this.username = username;
        this.balance = 0;
        this.isVerified = false;
        this.verifiedByManagerAccountNo = "";
        this.transactions = transactions;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public List<TTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(TTransaction transactions) {
        this.transactions.add(transactions);
    }
    public String getVerifiedByManagerAccountNo() {
        return verifiedByManagerAccountNo;
    }

    public void setVerifiedByManagerAccountNo(String verifiedByManagerAccountNo) {
        this.verifiedByManagerAccountNo = verifiedByManagerAccountNo;
    }
}
