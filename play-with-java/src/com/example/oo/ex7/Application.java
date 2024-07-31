package com.example.oo.ex7;

import com.example.oo.ex7.p1.A;
import com.example.oo.ex7.p1.B;
import com.example.oo.ex7.p1.C;
import com.example.oo.ex7.p2.D;
import com.example.oo.ex7.p2.E;

public class Application {
    public static void main(String[] args) {

        A a = new A();
        a.aInstanceMethod();

        System.out.println();

        B b = new B();
        b.bInstanceMethod();

        System.out.println();

        C c = new C();
        c.cInstanceMethod();

        System.out.println();

        D d = new D();
        d.dInstanceMethod();

        System.out.println();

        E e = new E();
        e.eInstanceMethod();

    }
}
