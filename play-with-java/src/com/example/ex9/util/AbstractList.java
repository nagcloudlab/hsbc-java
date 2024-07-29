package com.example.ex9.util;

public abstract class AbstractList {
    //..
    // any common implemented methods + abstract methods

    int mutableField = 0;

    public AbstractList() {
        System.out.println("AbstractList");
    }

    public abstract void add(String s);

    public void bar(){
        System.out.println("bar");
    }

    static void xyz(){
        System.out.println("foo");
    }

}
