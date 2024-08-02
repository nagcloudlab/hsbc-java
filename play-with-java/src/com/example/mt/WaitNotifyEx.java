package com.example;

// Ex. Wait Notify | Producer Consumer Pattern

// buffer with 10 elements
// producer will produce 50 elements
// consumer will consume 45 elements

// producer will wait if buffer is full
// consumer will wait if buffer is empty

// producer will notify consumer if it produces an element
// consumer will notify producer if it consumes an element

// producer produce element every 1s,
// consumer consume element every 2s

// Write code for above scenario

// Hint: use wait() and notify() methods


class Outer {

    private Object lock = new Object();

    private int[] buffer = new int[10];
    private int index = 0;

    public void produce(int data) {
        synchronized (lock) {
            while (index == buffer.length) {
                try {
                    System.out.println("Buffer is full, waiting...");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer[index++] = data;
            System.out.println("Produced: " + data);
            lock.notify();
        }
    }

    public int consume() {
        synchronized (lock) {
            while (index == 0) {
                try {
                    System.out.println("Buffer is empty, waiting...");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int data = buffer[--index];
            System.out.println("Consumed: " + data);
            lock.notify();
            return data;
        }
    }
}


public class WaitNotifyEx {


    public static void main(String[] args) {

        Outer outer = new Outer();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                outer.produce(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 45; i++) {
                outer.consume();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done");

    }

}