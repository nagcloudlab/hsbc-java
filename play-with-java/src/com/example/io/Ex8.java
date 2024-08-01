package com.example.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {
    public static void main(String[] args) throws IOException {

        // Create a BufferedReader to read from the standard input (keyboard)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Enter a character: ");
            // Read the first character
            int charInt = reader.read(); // Reads a single character as an integer
            if (charInt == -1) {
                break; // End of stream or error
            }
            char firstChar = (char) charInt;
            System.out.println("You entered: " + firstChar);
            // Discard the rest of the line
            reader.readLine(); // This will read and discard the remaining characters
            // If you want to stop after one input
            // break;
        }

        // Close the reader
        reader.close();
    }
}

