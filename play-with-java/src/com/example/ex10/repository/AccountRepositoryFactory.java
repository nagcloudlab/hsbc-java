package com.example.ex10.repository;

public class AccountRepositoryFactory {

    public static AccountRepository getAccountRepository(String databaseType) {
        if (databaseType.equals("mysql")) {
            return new MySqlAccountRepository();
        } else if (databaseType.equals("oracle")) {
            return new OracleAccountRepository();
        }
        return null;
    }

}
