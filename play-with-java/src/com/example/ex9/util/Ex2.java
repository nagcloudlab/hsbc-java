package com.example.ex9.util;

interface I3 {
    void m1();
    default void m2() {
        System.out.println("I3.m2()");
    }
}

abstract class AC {
    public void m2() {
        System.out.println("C1.m1()");
    }
}

class C2 extends AC implements I3 {
    public void m1() {
        System.out.println("C2.m1()");
    }
}

public class Ex2 {
    public static void main(String[] args) {

        I3 i3 = new C2();
        i3.m1();
    }
}
