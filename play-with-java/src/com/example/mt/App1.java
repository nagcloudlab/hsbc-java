package com.example.mt;


// project
// 2 tasks
// task1: io ( get input from user , print it)
// task2: computation ( print 1 to 1000)


import java.util.Scanner;

public class App1 {

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
        System.out.println("Thread Name: " + threadName);

        // task1
        System.out.println("task-1");
        io();

        // task2
        System.out.println("task-2");
        computation();

    }


}
