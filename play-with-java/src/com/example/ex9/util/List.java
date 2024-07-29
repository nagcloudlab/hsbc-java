package com.example.ex9.util;

public interface List extends Collection {

    // constansts
    int MAX_SIZE = 100; // public static final int MAX_SIZE = 100;

    // no constructor allowed in interface

    void add(int index, String obj);
    void remove(int index);
    String get(int index);
    int indexOf(String obj);

    // java 8 feature ( default method )
    // - default method is a method that has a body
    // - default method is used to add new methods to interfaces without breaking the classes that already use that interface
    default void foo(){
        pvt();
        System.out.println("foo");
    }

    // java 8 feature ( static method )
    // - static method is a method that has a body
    // - static method is used to add new methods to interfaces without breaking the classes that already use that interface

    static void bar(){
        System.out.println("bar");
    }


    private void pvt(){
        System.out.println("pvt");
    }

}
