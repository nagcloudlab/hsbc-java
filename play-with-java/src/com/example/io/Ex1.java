package com.example.io;


// source : std-input
// sink : std-output


import java.io.InputStreamReader;

public class Ex1 {
    public static void main(String[] args) {


        InputStreamReader reader = new InputStreamReader(System.in);
        System.out.println("Enter a character: ");
        try {
            char c = (char) reader.read();
            System.out.println("You entered: " + c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
