package com.company.example.ch11.Client_Server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9500);
            while(true) {
                System.out.println("연결을 기다리는중");
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("연결 수락" + isa.getHostName());
            }
        } catch (IOException e) {
        }

    }
}
