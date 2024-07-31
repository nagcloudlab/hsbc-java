package com.example.ex11;


// When to use Checked Exception?
// 1. When the exception is recoverable
// 2. When the caller can handle the exception
// 3. When the caller can't ignore the exception
// 4. When the caller can't continue without handling the exception

// When to use Unchecked Exception?
// 1. When the caller can ignore the exception
// 2. When the caller can continue without handling the exception

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

class CheckedException extends Exception {
    public CheckedException(String message) {
        super(message);
    }
}

class UncheckedException extends RuntimeException {
    public UncheckedException(String message) {
        super(message);
    }
}


class SomeService {
    public void m1(int x) throws CheckedException {
        if (x < 0)
            throw new CheckedException("SomeService.m1() failed");
    }

    public void m2(int y) {
        if (y < 0)
            throw new UncheckedException("SomeService.m2() failed");
    }
}


public class Checked_Vs_Unchecked_Exception {
    public static void main(String[] args) {

        SomeService service = new SomeService();

        try {
            service.m1(-1);
        } catch (CheckedException e) {
            System.out.println("CheckedException: " + e.getMessage());
        }

        try {
            service.m2(-1);
        } catch (UncheckedException e) {
            System.out.println("UncheckedException: " + e.getMessage());
        }


        //----------------------------------------------
        // Checked Exception
        //----------------------------------------------

        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            int ucv = reader.read();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        }

        //----------------------------------------------
        // Unchecked Exception
        //----------------------------------------------

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        //----------------------------------------------


    }
}
