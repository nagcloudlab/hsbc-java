package com.example.io;


// source : std-input
// sink : std-output


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line ");
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);

        scanner.close();

    }
}
