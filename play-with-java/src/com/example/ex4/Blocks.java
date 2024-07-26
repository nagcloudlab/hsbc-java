package com.example.ex4;

class Xyz {

    static String filePointer ;

    static {
        System.out.println("Static block");
        // conditional
        // invocation
        //......
        filePointer = "C:\\Users\\user\\Desktop\\file.txt";
    }

    // wh we use static block?
    // 1. To initialize static variables of a class
    // 2. To perform some action only once for a class

    static void staticMethod() {
        System.out.println("Static method");
        System.out.println("File pointer: " + filePointer);
    }


}

public class Blocks {
    public static void main(String[] args) {

        Xyz.staticMethod();
        Xyz.staticMethod();

    }
}
