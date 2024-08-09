package com.example.annotation;


import java.util.ArrayList;
import java.util.Date;

class Super {
    void show() {
        System.out.println("Super class");
    }
}

class Sub extends Super {
    @Override
    void show() {
        System.out.println("Sub class");
    }
}

/**
 * Author: Pankaj
 */
class Lib {
    // 2020
    @Deprecated
    void m1() {
        System.out.println("Lib m1");
    }

    void m2() {
        System.out.println("Lib m2");
    }
}


public class Ex1 {
    public static void main(String[] args) {

        Sub sub = new Sub();
        sub.show();

        Lib lib = new Lib();
        lib.m1();

        @SuppressWarnings("raw")
        ArrayList list = new ArrayList();

    }
}
