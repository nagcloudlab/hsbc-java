package com.example.ex10.repository;

import com.example.ex10.model.Account;

public interface AccountRepository {
    Account loadAccount(String accountNumber);
    void updateAccount(Account account);
}
