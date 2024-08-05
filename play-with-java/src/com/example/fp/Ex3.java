package com.example.fp;

// SAM interface
interface Adder {
    int add(int a, int b);
}

public class Ex3 {
    public static void main(String[] args) {


        Adder f = (int a, int b) -> {
            return a + b;
        };

        int r = f.add(1, 2);
        System.out.println(r);


        Thread t = new Thread(() -> {
            System.out.println("Hello from thread");
        });
        t.start();

    }
}
