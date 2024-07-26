package com.example.ex8;


// we can create string object with/without new keyword
// if we create string object with new keyword then it will create new object in heap memory
// if we create string object without new keyword then it will create object in string pool

public class Ex1 {
    public static void main(String[] args) {

//        String s1 = new String("hsbc");
//        String s2 = new String("hsbc");

//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

        String s3 = "hsbc";
        String s4 = "hsbc";

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}
