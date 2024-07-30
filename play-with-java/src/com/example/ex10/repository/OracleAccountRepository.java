package com.example.ex10.repository;

import com.example.ex10.model.Account;

public class OracleAccountRepository implements AccountRepository {

    public OracleAccountRepository() {
        System.out.println("MySqlAccountRepository instance created");
    }

    public Account loadAccount(String accountNumber) {
        // e.g select * from ACCOUNTS where accountNumber=?
        return new Account(accountNumber, 1000);
    }

    public void updateAccount(Account account) {
        // Do something
        // e.g update ACCOUNTS set balance=? where accountNumber=?
    }
}
