package com.example.mt;


class Counter {
    private long count = 0;

    public synchronized void increment() {
        // read count from memory
        // increment count
        // write count back to memory
        count++;
    }

    public long getCount() {
        return count;
    }
}

public class RaceConditionEx {
    public static void main(String[] args) {

        Counter counter = new Counter(); // shared object

        class CounterTask implements Runnable {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        }
        CounterTask task = new CounterTask();

        Thread[] threads = new Thread[1000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join(); // wait for thread[i] to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final count: " + counter.getCount()); // 1000 * 1000 = 1000000

    }
}
