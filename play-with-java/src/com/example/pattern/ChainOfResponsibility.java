package com.example.pattern;

// Chain of Responsibility Pattern
/*

    Need ATM box,
    where we can withdraw money in multiple of 100, 500, 2000.
    If we try to withdraw 1000, it should give 500 + 500.
    If we try to withdraw 1500, it should give 500 + 500 + 500.
    If we try to withdraw 2000, it should give 2000.
    If we try to withdraw 2500, it should give 2000 + 500.
    If we try to withdraw 3000, it should give 2000 + 1000.
    If we try to withdraw 3500, it should give 2000 + 1000 + 500.
    If we try to withdraw 4000, it should give 2000 + 2000.
    If we try to withdraw 4500, it should give 2000 + 2000 + 500.

 */

// Handler
abstract class Handler {
    protected Handler nextHandler;
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handleRequest(int amount);
}

// Concrete Handler
class ATMHandler extends Handler {
    private int denomination;
    public ATMHandler(int denomination) {
        this.denomination = denomination;
    }
    @Override
    public void handleRequest(int amount) {
        int notes = amount / denomination;
        int remainingAmount = amount % denomination;

        if (notes > 0) {
            System.out.println(notes + " notes of " + denomination);
        }

        if (remainingAmount > 0 && nextHandler != null) {
            nextHandler.handleRequest(remainingAmount);
        }
    }
}


public class ChainOfResponsibility {
    public static void main(String[] args) {

        Handler handler50 = new ATMHandler(50);
        Handler handler100 = new ATMHandler(100);
        Handler handler500 = new ATMHandler(500);

        handler100.setNextHandler(handler50);
        handler500.setNextHandler(handler100);

        handler500.handleRequest(1625);


    }
}
