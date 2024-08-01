package com.example.io;


// File

import java.io.File;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {

        File file = new File("/Users/nag/hsbc-java/play-with-java/dir1/file1.txt");
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getPath());
        System.out.println("File Absolute Path: " + file.getAbsolutePath());

        // file exists
        System.out.println("File Exists: " + file.exists());
        // file size
        System.out.println("File Size: " + file.length());
        // file is directory
        System.out.println("Is Directory: " + file.isDirectory());
        // file is file
        System.out.println("Is File: " + file.isFile());
        // file is hidden
        System.out.println("Is Hidden: " + file.isHidden());
        // file can read
        System.out.println("Can Read: " + file.canRead());
        // file can write
        System.out.println("Can Write: " + file.canWrite());
        // file can execute
        System.out.println("Can Execute: " + file.canExecute());


        File directory = new File("/Users/nag/hsbc-java/play-with-java");
        File[] files = directory.listFiles();

        for (File f : files) {
            System.out.println(f.getName());
        }


        File directoryWithFile = new File("/Users/nag/hsbc-java/play-with-java", "foo.txt");
        try {
            boolean b=directoryWithFile.createNewFile();
            System.out.println("File Created: "+b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
