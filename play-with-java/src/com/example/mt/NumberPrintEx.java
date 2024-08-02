package com.example.mt;


class Outer1 {

    private static Object lock = new Object();
    private static String nextNumber = "odd";

    static class OddNumberTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i += 2) {
                synchronized (lock) {
                    try {
                        if (nextNumber.equals("even")) {
                            lock.wait(); // thread release the lock and wait
                        }
                        System.out.println("Odd Number: " + i);
                        nextNumber = "even";
                        lock.notify(); // notify the waiting thread
                        // every 1s
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class EvenNumberTask implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                synchronized (lock) {
                    try {
                        if (nextNumber.equals("odd")) {
                            lock.wait(); // thread release the lock and wait
                        }
                        System.out.println("Even Number: " + i);
                        nextNumber = "odd";
                        lock.notify(); // notify the waiting thread
                        // every 1s
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}


public class NumberPrintEx {

    public static void main(String[] args) {
        Thread oddThread = new Thread(new Outer1.OddNumberTask());
        Thread evenThread = new Thread(new Outer1.EvenNumberTask());

        oddThread.start();
        evenThread.start();
    }

}
