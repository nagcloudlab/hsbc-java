package com.example.oo.ex10.service;

import com.example.oo.ex10.model.Account;
import com.example.oo.ex10.repository.AccountRepository;

public class UPITransferService implements TransferService {

    private AccountRepository accountRepository;

    public UPITransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        System.out.println("UPITransferService instance created");
    }

    @Override
    public void transfer(String fromAccNumber, String toAccNumber, double amount) {

        System.out.println("Transferring amount using UPI");

        // Load from account
        Account fromAccount = accountRepository.loadAccount(fromAccNumber);
        // Load to account
        Account toAccount = accountRepository.loadAccount(toAccNumber);

        // Withdraw from fromAccount
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        // Deposit to toAccount
        toAccount.setBalance(toAccount.getBalance() + amount);

        // Update fromAccount
        accountRepository.updateAccount(fromAccount);
        // Update toAccount
        accountRepository.updateAccount(toAccount);

        System.out.println("Transfer completed");

    }
}
