package com.example.ex11;

public class Ex1 {

    public static void main(String[] args) {
        m1();
    }

    private static void m1() {

        try {
            // regular code..
            System.out.println("A");
            System.out.println("B");
            // exception generating code..
            boolean foo = true;
            if (!foo)
                throw new IllegalStateException("foo is false");

            System.out.println("C");

            int[] arr = new int[5];
            int ele = arr[0]; // ArrayIndexOutOfBoundsException

            int c = 10 / 0; // ArithmeticException

        } catch (IllegalStateException | ArrayIndexOutOfBoundsException  e) {
            System.out.println("D");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("F");
            System.out.println(e.getMessage());
        }

    }

}
