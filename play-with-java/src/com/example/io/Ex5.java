package com.example.io;


// read file and write to another file

import java.io.*;

public class Ex5 {

    public static void main(String[] args) {

        File file = new File("/Users/nag/Desktop/BC & WFS Day wise agenda for CH24.pdf");

        try {

            // Read..
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            FileOutputStream fos = new FileOutputStream("/Users/nag/Desktop/BC & WFS Day wise agenda for CH24_copy.pdf");
            fos.write(data);
            fos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
