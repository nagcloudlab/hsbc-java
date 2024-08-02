package com.example.mt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.io.*;
import java.nio.*;

public class ExecutorFrameworkEx {


    public static void main(String[] args) {

        class Task implements Runnable {
            @Override
            public void run() {
                System.out.println("Task executed by " + Thread.currentThread().getName());
                // simulate some work
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task completed by " + Thread.currentThread().getName());
            }
        }

        // without executor framework
//        // 100 tasks
//        for (int i = 0; i < 100; i++) {
//            new Thread(new Task()).start();
//        }

        // with executor framework ( thread pool)

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // 100 tasks
        for (int i = 0; i < 60; i++) {
            executorService.submit(new Task());
        }
        executorService.shutdown();

    }


}
