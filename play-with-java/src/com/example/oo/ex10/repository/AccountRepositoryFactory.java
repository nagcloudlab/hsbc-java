package com.example.oo.ex10.repository;

/*
     what is factory design pattern?
        - Factory design pattern is a creational design pattern
          that provides an interface for creating objects in a superclass,
          but allows subclasses to alter the type of objects that will be created.
 */

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
