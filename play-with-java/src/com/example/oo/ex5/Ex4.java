package com.example.oo.ex5;

class P {
    int v = 10;

    void m1() {
        System.out.println("P m1");
    }
}

class Q extends P {
    int v = 20;

    void m1() {
        System.out.println("Q m1");
        super.m1();
    }

    void display() {
        System.out.println(v);
        System.out.println(super.v);
    }
}

public class Ex4 {
}
