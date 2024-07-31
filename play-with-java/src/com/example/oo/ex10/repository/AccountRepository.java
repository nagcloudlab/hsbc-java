package com.example.oo.ex10.repository;

import com.example.oo.ex10.model.Account;

public interface AccountRepository {
    Account loadAccount(String accountNumber);
    void updateAccount(Account account);
}
