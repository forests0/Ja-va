package com.company.example.ch11.Client_Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port=8080;
        ServerSocket ssk = new ServerSocket(port);
        System.out.println("대기중");
        while(true) {
            Socket sock = ssk.accept();
            System.out.println("새로운 사용자가 접속하였습니다");
            System.out.println("client IP : " + sock.getInetAddress());
        }
    }
}
