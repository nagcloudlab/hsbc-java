package com.example.ex.repository;

import com.example.oo.ex10.model.Account;

import java.sql.SQLException;

public interface AccountRepository {

    Account loadAccount(String number) throws SQLException;

    void updateAccount(Account account);

}
