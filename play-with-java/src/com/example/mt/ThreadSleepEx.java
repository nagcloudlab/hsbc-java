package com.example.mt;


import java.time.LocalTime;

class TimeTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            String timeNow = LocalTime.now().toString();
            System.out.println("Time now: " + timeNow);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
//                if (Thread.currentThread().isInterrupted()) {
//                    System.out.println("Thread is interrupted. Exiting...");
//                    break;
//                }
            }

        }
    }
}

public class ThreadSleepEx {
    public static void main(String[] args) throws InterruptedException {

        Thread timeThread = new Thread(new TimeTask());
        timeThread.start();

        Thread.sleep(5000);
        timeThread.interrupt();

    }
}
