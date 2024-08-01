package com.example.mt;


class R1 {
    public synchronized void m1(R2 r2) {
        System.out.println("T1 using R1");
        System.out.println("T1 trying to get R2");
        r2.m2();
    }

    public  void m2() {
        System.out.println("T2 also using R1");
    }
}

class R2 {
    public synchronized void m1(R1 r1) {
        System.out.println("T2 using R2");
        System.out.println("T2 trying to get R1");
        r1.m2();
    }

    public synchronized void m2() {
        System.out.println("T1 also using R2");
    }
}


public class DeadLock {
    public static void main(String[] args) {

        R1 r1 = new R1();
        R2 r2 = new R2();

        Runnable task1 = () -> {
            r1.m1(r2);
        };

        Runnable task2 = () -> {
            r2.m1(r1);
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();


        StringBuffer sb = new StringBuffer();
        sb.append("Hello");

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello");

    }
}
