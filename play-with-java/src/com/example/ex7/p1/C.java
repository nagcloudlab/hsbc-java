package com.example.ex7.p1;

/**
 * author: team-C
 */

public class C {

    A a = new A();

    public void cInstanceMethod() {
        System.out.println("C's instance method");
        //System.out.println("pri = " + a.pri);
        System.out.println("def = " + a.def);
        System.out.println("pro = " + a.pro);
        System.out.println("pub = " + a.pub);
    }

}
