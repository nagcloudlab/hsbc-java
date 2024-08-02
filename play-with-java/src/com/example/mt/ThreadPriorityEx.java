package com.example.mt;


class JobTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriorityEx {
    public static void main(String[] args) {


        Thread t1 = new Thread(new JobTask(), "Thread-1");
        Thread t2 = new Thread(new JobTask(), "Thread-2");
        Thread t3 = new Thread(new JobTask(), "Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


    }
}
