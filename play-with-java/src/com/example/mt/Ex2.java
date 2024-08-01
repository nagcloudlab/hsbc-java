package com.example.mt;


public class Ex2 {

    public static void main(String[] args) {

        class NameTask implements Runnable {
            // Runnable ->
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("im " + Thread.currentThread().getName());
                }
            }
            // -> Terminated
        }

        NameTask task = new NameTask();


        Thread fooThread = new Thread(task, "foo"); // New
        Thread barThread = new Thread(task, "bar");
        Thread bazThread = new Thread(task, "baz");

        fooThread.start(); // New -> Runnable
        barThread.start();
        bazThread.start();

    }

}
