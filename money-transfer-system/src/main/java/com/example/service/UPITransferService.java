package com.example.service;

import com.example.model.Account;
import com.example.repository.AccountRepository;

public class UPITransferService implements TransferService {

    private AccountRepository accountRepository;

    public UPITransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transfer(int sourceAccNumber, int destinationAccNumber, double amount) {

        Account sourceAccount = accountRepository.findAccount(sourceAccNumber);
        Account destinationAccount = accountRepository.findAccount(destinationAccNumber);

        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);

        accountRepository.updateAccount(sourceAccount);
        accountRepository.updateAccount(destinationAccount);


    }
}
