package com.example.customerportal.viewmodels;


public class AccountCreateViewModel {
    private String accountNumber;
    private String accountBranch;
    private double accountBalance;
    private int accountType;
    private int customerId;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountBranch() {
        return accountBranch;
    }

    public void setAccountBranch(String accountBranch) {
        this.accountBranch = accountBranch;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
