package com.example.mt;


/*
    3 rest-rooms
    10 people
    3 people can use the rest-room at a time

 */


import java.util.concurrent.Semaphore;

class RestRoom implements Runnable {

    private Semaphore semaphore = new Semaphore(3);

    @Override
    public void run() {
        useRestRoom();
    }

    private void useRestRoom() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " using the rest-room");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " done using the rest-room");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

public class SemaphoreEx {
    public static void main(String[] args) {

        RestRoom restRoom = new RestRoom();

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(restRoom, "Person-" + i);
            t.start();
        }

    }
}
