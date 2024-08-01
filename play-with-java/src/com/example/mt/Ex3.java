package com.example.mt;


class A {
    public synchronized static void m1() {
        String threadName = Thread.currentThread().getName();
        System.out.println("m1() called by " + threadName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1() completed by " + threadName);
    }

    public synchronized static void m2() {
        String threadName = Thread.currentThread().getName();
        System.out.println("m2() called by " + threadName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2() completed by " + threadName);
    }
}


public class Ex3 {
    public static void main(String[] args) {


        class M1Task implements Runnable {
            @Override
            public void run() {
                A.m1();
            }
        }

        class M2Task implements Runnable {
            @Override
            public void run() {
                A.m2();
            }
        }

        M1Task m1Task = new M1Task();
        M2Task m2Task = new M2Task();

        Thread t1 = new Thread(m1Task, "T1");
        Thread t2 = new Thread(m1Task, "T2");
        Thread t3 = new Thread(m2Task, "T3");

        t1.start();
        t2.start();
        t3.start();

    }
}
