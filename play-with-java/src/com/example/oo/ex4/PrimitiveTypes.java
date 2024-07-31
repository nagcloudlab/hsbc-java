package com.example.oo.ex4;


public class PrimitiveTypes {
    public static void main(String[] args) {


        // primitive data types

        byte b = 12; // Min: -128, Max: 127
        short s = 123; // Min: -32,768, Max: 32,767
        int i = 1234; // Min: -2,147,483,648, Max: 2,147,483,647
        long l = 12345; // Min: -9,223,372,036,854,775,808, Max: 9,223,372,036,854,775,807
        long l2 = 2147483648L; // L is used to specify the long data type
        float f = 123.45f; // f is used to specify the float data type
        double d = 123.456; // double is the default data type for decimal values
        char c = 'A'; // char is used to store a single character
        char c2 = 65; // 65 is the ASCII value of 'A'
        char c3 = '\u0041'; // 0041 is the Unicode value of 'A'
        boolean bool = true; // boolean is used to store true or false values

        //int a=10;
        //int a = 010; // octal number
        //int a = 0x10; // hexadecimal number
        //int a = 0b10; // binary number
        //System.out.println(a);

        //double mySalary = 100_000_000.0;


//        int n1=6;
//        int n2=4;
//        float result = (float)n1/n2;
//        System.out.println(result);


        byte byteVar = 10;
        int intVar = byteVar; // implicit casting

        int intVar2 = 10;
        byte byteVar2 = (byte) intVar2; // explicit casting

        int intVar3 = 456;
        byte byteVar3 = (byte) intVar3;
        System.out.println(byteVar3);


        boolean isHoliday = false;
        if (isHoliday) {
            System.out.println("Today is holiday");
        } else {
            System.out.println("Today is not holiday");
        }

    }
}
