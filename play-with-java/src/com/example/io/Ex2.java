package com.example.io;


// source : std-input
// sink : std-output


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) {


        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("Enter a line ");

        try {
            String line = bufferedReader.readLine();
            System.out.println("You entered: " + line);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
