package com.example.ex.service;

import com.example.ex.exception.AccountNotFoundException;
import com.example.ex.exception.InsufficientFundsException;

import java.sql.SQLException;

public interface TransferService {
    void transfer(String fromAccount, String toAccount, double amount);
}
