package com.example.ex3;


class A  extends Object {
    private int a;
    public A(int a) {
        super();
        this.a = a;
        System.out.println("im A");
    }
    public int getA() {
        return a;
    }
}

class B extends A {
    public B(int a) {
        super(a);
        System.out.println("im B");
    }
}

class C extends B {
    public C(int a) {
        super(a);
        System.out.println("im C");
    }
}

public class ConstructorExecutionFlow {
    public static void main(String[] args) {

        C c = new C(10);
        System.out.println(c.getA());

    }
}
