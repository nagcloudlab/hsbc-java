package com.example.ex;

import com.example.ex.exception.AccountNotFoundException;
import com.example.ex.exception.ConnectionException;
import com.example.ex.exception.InsufficientFundsException;
import com.example.ex.repository.AccountRepository;
import com.example.ex.repository.SqlAccountRepository;
import com.example.ex.service.TransferService;
import com.example.ex.service.UPITransferService;
import com.example.oo.ex10.model.Account;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {

        // Web layer / UI layer

        AccountRepository accountRepository = new SqlAccountRepository();
        TransferService transferService = new UPITransferService(accountRepository);

        try {
            //transferService.transfer("1", "2", 100.00);
        } catch (AccountNotFoundException | InsufficientFundsException e) {
            System.out.println("UI/Web: " + e.getMessage());
        } catch (ConnectionException e) {
            System.out.println("UI/Web: " + e.getMessage());
            e.printStackTrace(); // to know the stack trace, where the exception occurred
        }


        //------------------------------------------------------
        //built-in execption classes
        //------------------------------------------------------

        // ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException

        try {
            int[] arr = new int[5];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        // NumberFormatException

        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        // ClassCastException

        try {
            V v = new C();
            B b = (B) v;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }


    }
}


class V {
}

class B extends V {
}

class C extends V {
}