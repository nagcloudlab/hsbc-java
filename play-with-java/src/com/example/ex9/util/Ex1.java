package com.example.ex9.util;

interface  I1{
    void m1();
    default void m2(){
        System.out.println("I1.m2()");
    }
}

interface I2{
    void m1();
    default void m2(){
        System.out.println("I2.m2()");
    }
}

class C1 implements I1,I2{
    public void m1(){
        System.out.println("C1.m1()");
    }
    public void m2(){
        I1.super.m2();
        I2.super.m2();
        System.out.println("C1.m2()");
    }
}

public class Ex1 {
    public static void main(String[] args) {

        I1 i1=new C1();
        i1.m1();
        i1.m2();

    }
}
