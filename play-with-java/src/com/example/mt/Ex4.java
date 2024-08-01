package com.example.mt;


class Building {

    private static Object lock1 = new Object();

    public void room1() {
        synchronized (lock1) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is in room1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " is leaving room1");
        }
    }

    public void room2() {
        synchronized (lock1) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is in room2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " is leaving room2");
        }
    }
}


public class Ex4 {
    public static void main(String[] args) {

        Building building1 = new Building();
        Building building2 = new Building();

        // T1 -> b1 -> room-1
        // T2 -> b1 -> room-2
        // T3 -> b2 -> room-1

        Runnable b1Room1 = () -> {
            building1.room1();
        };
        Runnable b1Room2 = () -> {
            building1.room2();
        };
        Runnable b2Room1 = () -> {
            building2.room1();
        };

        Thread t1 = new Thread(b1Room1, "T1");
        Thread t2 = new Thread(b1Room2, "T2");
        Thread t3 = new Thread(b2Room1, "T3");

        t1.start();
        t2.start();
        t3.start();

    }
}

