package com.example.io;

import java.io.FileWriter;
import java.io.IOException;

public class Ex7 {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("/Users/nag/hsbc-java/play-with-java/dir1/file2.txt",true);
            fileWriter.write("chicken\n");
            fileWriter.write("mutton\n");
            fileWriter.write("fish\n");
            fileWriter.flush();
            fileWriter.write("prawns\n");
            fileWriter.write("crab\n");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
