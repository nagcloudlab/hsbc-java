package com.example.service;

import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
import com.example.model.Account;
import com.example.model.Transaction;
import com.example.model.TransactionType;
import com.example.repository.AccountRepository;
import com.example.repository.TransactionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Random;

@Service
public class UPITransferService implements TransferService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TransactionHistoryRepository transactionHistoryRepository;


    @Transactional
    @Override
    public void transfer(int sourceAccNumber, int destinationAccNumber, double amount) {

        // step-1: Load source account
        Account sourceAccount = accountRepository.findById(sourceAccNumber).orElseThrow(() -> new AccountNotFoundException("Account not found: "+sourceAccNumber));
       // step-2: Load destination account
        Account destinationAccount = accountRepository.findById(destinationAccNumber).orElseThrow(() -> new AccountNotFoundException("Account not found: "+destinationAccNumber));
        if(sourceAccount.getBalance() < amount)
            throw new AccountBalanceException("Insufficient balance in account: "+sourceAccNumber);
        // step-3: debit source account
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        // step-4: credit destination account
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        // step-5: update source account
        accountRepository.save(sourceAccount);
        if(false)
            throw new RuntimeException("Error in updating destination account");
        // step-6: update destination account
        accountRepository.save(destinationAccount);

        Transaction debitTransaction = new Transaction();
        debitTransaction.setTransactionId(new Random(1000).nextInt());
        debitTransaction.setTransactionType(TransactionType.DEBIT);
        debitTransaction.setAmount(amount);
        debitTransaction.setAccount(sourceAccount);
        debitTransaction.setTransactionDate(new Date());

        Transaction creditTransaction = new Transaction();
        creditTransaction.setTransactionId(new Random(1000).nextInt());
        creditTransaction.setTransactionType(TransactionType.CREDIT);
        creditTransaction.setAmount(amount);
        creditTransaction.setAccount(destinationAccount);
        creditTransaction.setTransactionDate(new Date());

        // step-7: save transaction history
        transactionHistoryRepository.save(debitTransaction);
        transactionHistoryRepository.save(creditTransaction);


    }
}
