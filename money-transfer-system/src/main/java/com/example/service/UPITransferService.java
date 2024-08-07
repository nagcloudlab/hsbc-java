package com.example.service;

import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
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

        // step-1: Load source account
        Account sourceAccount = accountRepository.findAccount(sourceAccNumber);
        if(sourceAccount==null)
            throw new AccountNotFoundException("Account not found with account number: "+sourceAccNumber);
       // step-2: Load destination account
        Account destinationAccount = accountRepository.findAccount(destinationAccNumber);
        if (destinationAccount == null)
            throw new AccountNotFoundException("Account not found with account number: "+destinationAccNumber);
        if(sourceAccount.getBalance() < amount)
            throw new AccountBalanceException("Insufficient balance in account: "+sourceAccNumber);
        // step-3: debit source account
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        // step-4: credit destination account
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        // step-5: update source account
        accountRepository.updateAccount(sourceAccount);
        if(false)
            throw new RuntimeException("Error in updating destination account");
        // step-6: update destination account
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

        // step-7: save transaction history
        transactionHistoryRepository.saveTransaction(debitTransaction);
        transactionHistoryRepository.saveTransaction(creditTransaction);


    }
}
