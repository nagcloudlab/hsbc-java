package com.example.mt;

import java.util.Scanner;

public class App2 {

    private static void io() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }

    private static void computation() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name: " + threadName);
        class IOTask implements Runnable {
            public void run() {
                io();
            }
        }
        class ComputationTask implements Runnable {
            public void run() {
                computation();
            }
        }
        Thread ioThread = new Thread(new IOTask(), "IO-Thread");
        Thread computationThread = new Thread(new ComputationTask(), "Computation-Thread");
        ioThread.start();
        computationThread.start();


    }
}
