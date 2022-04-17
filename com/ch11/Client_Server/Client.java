package com.company.example.ch11.Client_Server;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1" , 5050);
        System.out.println("서버에 접속되었습니다");
    }
}
