package com.android.bankpal.CustomClasses;

public class User {
    private String name;
    private int accountNumber;
    private String phoneNumber;
    private String ifscCode;
    private int balance;
    private String email;

    public User(String name, int accountNumber, String phoneNumber, String ifscCode, int balance, String email) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.ifscCode = ifscCode;
        this.balance = balance;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public int getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

}
