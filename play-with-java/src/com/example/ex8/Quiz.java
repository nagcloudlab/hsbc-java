package com.example.ex8;

public class Quiz {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("a");
        StringBuffer sb2 = sb1;
        sb1.append("b");
        StringBuffer sb3 = sb2;
        sb2.append("c");
        sb3.append("d");

        System.out.println(sb1 == sb2);
        System.out.println(sb2 == sb3);
        System.out.println(sb1 == sb3);

        System.out.println(sb1.equals(sb2));
        System.out.println(sb2.equals(sb3));
        System.out.println(sb1.equals(sb3));

    }

}
