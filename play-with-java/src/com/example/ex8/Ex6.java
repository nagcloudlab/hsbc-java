package com.example.ex8;

// String vs StringBuffer vs StringBuilder
// String is immutable (unchangeable) and final (cannot be inherited)
// StringBuffer is mutable (changeable) and synchronized (thread-safe)
// StringBuilder is mutable (changeable) and not synchronized (not thread-safe)

public class Ex6 {

    public static void main(String[] args) {

        // String
        String str = "Hello";
        str = str + " World";
        System.out.println(str);


        // StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        // StringBuilder
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2);

    }

}
