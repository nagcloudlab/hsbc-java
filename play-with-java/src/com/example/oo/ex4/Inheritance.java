package com.example.oo.ex4;

abstract class V {
}

class B extends V {
}

class C extends V {
}

public class Inheritance {
    public static void main(String[] args) {

        //V v=new V();// error: V is abstract; cannot be instantiated

        B b = new B();
        C c = new C();

        V v = new B(); // upcasting (implicit)
        v = new C(); // upcasting (implicit)

        //B b1 = new C(); // error: incompatible types: C cannot be converted to B
        if (v instanceof B) {
            B b1 = (B) v; // downcasting (explicit)
        }
        if (v instanceof C) {
            C c1 = (C) v; // downcasting (explicit)
        }

    }
}
