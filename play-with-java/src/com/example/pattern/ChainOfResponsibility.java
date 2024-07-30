package com.example.pattern;

// Chain of Responsibility Pattern
// ATM Machine Example

// Handler
abstract class Handler {
    protected Handler nextHandler;
    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
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

        handler500.setNextHandler(handler50).setNextHandler(handler100);

        handler500.handleRequest(3650);



    }
}
