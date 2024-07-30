package com.example.ex10;

import com.example.ex10.repository.AccountRepository;
import com.example.ex10.repository.AccountRepositoryFactory;
import com.example.ex10.repository.MySqlAccountRepository;
import com.example.ex10.repository.OracleAccountRepository;
import com.example.ex10.service.TransferService;
import com.example.ex10.service.UPITransferService;

public class Application {

    public static void main(String[] args) {

//        AccountRepository mysqlAccountRepository = new MySqlAccountRepository();
//        AccountRepository oracleAccountRepository = new OracleAccountRepository();

        AccountRepository mysqlAccountRepository = AccountRepositoryFactory.getAccountRepository("mysql");
        AccountRepository oracleAccountRepository = AccountRepositoryFactory.getAccountRepository("oracle");

        TransferService upiTransferService = new UPITransferService(mysqlAccountRepository);

        upiTransferService.transfer("1", "2", 100.0);
        upiTransferService.transfer("2", "1", 50.0);


    }

}
