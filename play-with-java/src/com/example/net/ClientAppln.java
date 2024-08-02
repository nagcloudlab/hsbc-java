package com.example.net;


// TCP client

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientAppln {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream()));


            Scanner scanner = new Scanner(System.in);
            String line = "";
            while (!"/quit".equals(line)) {
                line = scanner.nextLine();
                writer.write(line + "\n");
                writer.flush();
                System.out.println(reader.readLine());
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
