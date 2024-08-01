package com.example.mt;

// 2 ways to create a thread in Java
// 1. Implement Runnable interface
// 2. Extend Thread class

class Task1 implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Task1 is being executed by " + name);
    }
}

class Task2 extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Task2 is being executed by " + name);
    }
}

public class Ex1 {
    public static void main(String[] args) {

        //Thread t1 = new Thread(new Task1(), "T1");
        //t1.start(); // start() method is used to start a new thread
        //t1.run(); // run() method is used to run the task in the current thread

        //Thread t2 = new Thread(new Task2(), "T2");
        //t2.start();

//        Task2 t2 = new Task2();
//        t2.start();

    }
}
