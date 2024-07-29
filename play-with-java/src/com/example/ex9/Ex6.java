package com.example.ex9;


class A {
    final static int STATIC_VAR = 10;
    final int instanceVar1 = 20;
    final int instanceVar2;

    public A(int instanceVar2) {
        this.instanceVar2 = instanceVar2;
    }

    final void method1() {
        final int localVar1 = 30;
    }
}

final class B extends A {
    public B() {
        super(40);
    }
//    void method1(){
//        //
//    }
}
//
//class  C extends B{
//    //void method1(){}
//}


sealed class D permits E, F {
    void method1() {
    }
}

non-sealed class E extends D {
    void method1() {
    }
}

final class F extends D {
    void method1() {
    }
}


public class Ex6 {
}
