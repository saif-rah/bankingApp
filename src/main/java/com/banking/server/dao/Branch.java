package com.banking.server.dao;

import org.springframework.data.annotation.Id;

public class Branch {


    @Id
    private String branchCode;

    private String branchName;

    private String branchCity;

    private double asset;

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCity() {
        return branchCity;
    }

    public void setBranchCity(String branchCity) {
        this.branchCity = branchCity;
    }

    public double getAsset() {
        return asset;
    }

    public void setAsset(double asset) {
        this.asset = asset;
    }

    public Branch(String branchCode, String branchName, String branchCity, double asset) {
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.branchCity = branchCity;
        this.asset = asset;
    }
}
