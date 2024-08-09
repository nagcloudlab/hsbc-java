package com.example.dto;

public record TransferRequest(int fromAccountNumber, int toAccountNumber, double amount) {
}
