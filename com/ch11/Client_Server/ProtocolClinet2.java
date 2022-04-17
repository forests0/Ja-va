package com.company.example.ch11.Client_Server;

import java.io.*;
import java.net.Socket;

public class ProtocolClinet2 {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        //소켓 연결
        try {
            socket = new Socket("127.0.0.1",9500);
            System.out.println("연결성공");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //클라이언트 -> 소켓
        String msg = "안녕하세요";
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.println(msg);
        writer.flush();
        writer.println("데이터 전송 완료");
        //소켓 -> 클라이언트
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = reader.readLine();
        System.out.println("데이터 받기 성공 : " + line);

        writer.close();
        reader.close();

    }
}
