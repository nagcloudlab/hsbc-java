package com.example.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAppln {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server started at port 8080");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected: " + socket.getInetAddress());
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(
                        new OutputStreamWriter(socket.getOutputStream()));
                String line = "";
                while (!"/quit".equals(line)) {
                    line = reader.readLine();
                    System.out.println("~ " + line);
                    writer.write(line + "\n");
                    writer.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
