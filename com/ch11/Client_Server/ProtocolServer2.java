package com.company.example.ch11.Client_Server;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class ProtocolServer2 {
    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(9500);
            while(true) {
                System.out.println("연결을 기다리는중...");
                Socket socket = serversocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("연결 수락" + isa.getHostName());
                BufferedReader render = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line = render.readLine();
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                writer.println(line);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
