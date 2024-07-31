package com.example.ex.service;

import com.example.ex.exception.AccountNotFoundException;
import com.example.ex.exception.ConnectionException;
import com.example.ex.exception.InsufficientFundsException;
import com.example.ex.repository.AccountRepository;
import com.example.oo.ex10.model.Account;

import java.sql.SQLException;

public class UPITransferService implements TransferService {

    private AccountRepository accountRepository;

    public UPITransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transfer(String fromAccount, String toAccount, double amount) {

        try {
            Account from = accountRepository.loadAccount(fromAccount);
            Account to = accountRepository.loadAccount(toAccount);
            if (from == null)
                throw new AccountNotFoundException("Account " + fromAccount + " not found");
            if (to == null)
                throw new AccountNotFoundException("Account " + toAccount + " not found");
            if (from.getBalance() < amount)
                throw new InsufficientFundsException("Insufficient funds in account " + fromAccount);
            // debit from account
            from.setBalance(from.getBalance() - amount);
            // credit to account
            to.setBalance(to.getBalance() + amount);
        } catch (SQLException e) {
            throw new ConnectionException(e.getMessage());
        }

    }
}
