package com.company.example.ch11.Client_Server;

import java.io.IOException;
import java.net.Socket;

public class ProtocolClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("129.0.0.1", 9500);
            System.out.println("연결성공");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
