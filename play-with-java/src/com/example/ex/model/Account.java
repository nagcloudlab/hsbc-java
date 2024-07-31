package com.example.ex.model;

public class Account {

    private String number;
    private double balance;

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
