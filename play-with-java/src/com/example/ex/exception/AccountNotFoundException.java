package com.example.ex.exception;

//public class AccountNotFoundException extends Exception {
public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
