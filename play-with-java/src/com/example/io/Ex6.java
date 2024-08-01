package com.example.io;

// read text files

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex6 {
    public static void main(String[] args) {

        //
        try {
            FileReader fr = new FileReader("/Users/nag/hsbc-java/play-with-java/dir1/file1.txt");
//            int ucValue = -1;
//            while ((ucValue = fr.read()) != -1) {
//                System.out.print((char)ucValue);
//            }
//            fr.close();
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
