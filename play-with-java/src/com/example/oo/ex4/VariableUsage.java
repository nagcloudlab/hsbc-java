package com.example.oo.ex4;


class Abc {
    static int staVar = 1;
    int insVar = 2;

    static void staMethod() {
        System.out.println(staVar);
//        System.out.println(insVar); // Error
    }

    void insMethod() {
        System.out.println(staVar);
        System.out.println(insVar);
    }

}

public class VariableUsage {
    public static void main(String[] args) {
        Abc.staMethod();

        Abc abc = new Abc();
        abc.insMethod();

        abc.staMethod(); // Warning but works
    }
}
