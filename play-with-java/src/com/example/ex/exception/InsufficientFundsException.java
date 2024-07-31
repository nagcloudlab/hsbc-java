package com.example.ex.exception;

//public class InsufficientFundsException extends Exception {
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
