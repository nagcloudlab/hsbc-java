package com.example;

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

        upiTransferService.transfer(1, 2, 200);
        System.out.println("✅");

    }

}
