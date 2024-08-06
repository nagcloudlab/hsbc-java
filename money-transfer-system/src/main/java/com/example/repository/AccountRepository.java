package com.example.repository;

import com.example.model.Account;

public interface AccountRepository {
    Account findAccount(int accountNumber);
    void updateAccount(Account account);
}
