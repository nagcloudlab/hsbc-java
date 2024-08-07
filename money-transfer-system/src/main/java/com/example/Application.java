package com.example;

import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
import com.example.exception.DatabaseException;
import com.example.model.TransactionType;
import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JdbcTransactionHistoryRepository;
import com.example.repository.TransactionHistoryRepository;
import com.example.service.TransferService;
import com.example.service.UPITransferService;

public class Application {

    public static void main(String[] args) {


        //------------------------------------
        // boot phase
        //------------------------------------

        AccountRepository jdbcAccountRepository = new JdbcAccountRepository();
        TransactionHistoryRepository transactionHistoryRepository = new JdbcTransactionHistoryRepository();
        TransferService upiTransferService = new UPITransferService(jdbcAccountRepository, transactionHistoryRepository);


        //------------------------------------
        // Use phase
        //------------------------------------

        try {

            upiTransferService.transfer(11, 2, 400);
            System.out.println("✅");

//
//        transactionHistoryRepository.findAll()
//                .stream()
//                .filter(transaction -> transaction.getTransactionType().equals(TransactionType.DEBIT))
//                .forEach(System.out::println);


        } catch (DatabaseException e) {
            System.out.println("❌");
            System.out.println(e.getMessage());
        } catch (AccountNotFoundException e) {
            System.out.println("❌");
            System.out.println(e.getMessage());
        } catch (AccountBalanceException e) {
            System.out.println("❌");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("❌");
            System.out.println("Something went wrong");
        }

    }

}
