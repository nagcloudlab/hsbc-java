package com.example.ex.repository;

import com.example.oo.ex10.model.Account;

import java.sql.SQLException;

public class SqlAccountRepository implements AccountRepository {

    @Override
    public Account loadAccount(String number)throws SQLException {
        System.out.println("Loading account from the database, number: " + number);

        // connection failed..( JDBC api )
        boolean connectionFailed = true;
        if (connectionFailed)
            throw new SQLException("Connection failed");

        if (number.equals("13"))
            return null;

        return new Account(number, 100);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("Account updated in the database, number: " + account.getNumber());
    }
}
