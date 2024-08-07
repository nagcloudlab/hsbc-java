package com.example.service;

import com.example.model.Account;
import com.example.model.Transaction;
import com.example.model.TransactionType;
import com.example.repository.AccountRepository;
import com.example.repository.TransactionHistoryRepository;

import java.util.Date;

public class UPITransferService implements TransferService {

    private AccountRepository accountRepository;
    private TransactionHistoryRepository transactionHistoryRepository;

    public UPITransferService(AccountRepository accountRepository, TransactionHistoryRepository transactionHistoryRepository) {
        this.accountRepository = accountRepository;
        this.transactionHistoryRepository = transactionHistoryRepository;
    }

    @Override
    public void transfer(int sourceAccNumber, int destinationAccNumber, double amount) {

        Account sourceAccount = accountRepository.findAccount(sourceAccNumber);
        Account destinationAccount = accountRepository.findAccount(destinationAccNumber);

        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);

        accountRepository.updateAccount(sourceAccount);
        accountRepository.updateAccount(destinationAccount);

        Transaction debitTransaction = new Transaction();
        debitTransaction.setTransactionType(TransactionType.DEBIT);
        debitTransaction.setAmount(amount);
        debitTransaction.setAccount(sourceAccount);
        debitTransaction.setTransactionDate(new Date());

        Transaction creditTransaction = new Transaction();
        creditTransaction.setTransactionType(TransactionType.CREDIT);
        creditTransaction.setAmount(amount);
        creditTransaction.setAccount(destinationAccount);
        creditTransaction.setTransactionDate(new Date());

        transactionHistoryRepository.saveTransaction(debitTransaction);
        transactionHistoryRepository.saveTransaction(creditTransaction);


    }
}
