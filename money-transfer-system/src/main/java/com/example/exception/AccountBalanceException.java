package com.example.exception;

public class AccountBalanceException extends RuntimeException {
    public AccountBalanceException(String message) {
        super(message);
    }
}
