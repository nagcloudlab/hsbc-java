package com.example.colln;

public class Ex {
    public static void main(String[] args) {

        String filePath1="/home/dir1/dir2/file1.txt";
        String filePath2="/home/dir2/file2.txt";

        // get file name
        String fileName1 = filePath1.substring(filePath1.lastIndexOf("/")+1);
        String fileName2 = filePath2.substring(filePath2.lastIndexOf("/")+1);

        System.out.println("File Name 1: "+fileName1);
        System.out.println("File Name 2: "+fileName2);

    }
}
