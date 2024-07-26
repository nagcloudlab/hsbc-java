package com.example.ex5;

// 100% abstract class
interface II{
    void m1();
    void m2();
}

// 50% abstract class
abstract class CC implements II{
    public void m1(){
        System.out.println("m1");
    }
}


public class Ex6 {
}
