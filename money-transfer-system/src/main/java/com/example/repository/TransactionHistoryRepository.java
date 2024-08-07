package com.example.repository;

import com.example.model.Transaction;

import java.util.List;

public interface TransactionHistoryRepository {

    void saveTransaction(Transaction transaction);
    List<Transaction> findAll();

}
