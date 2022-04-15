package stream.ch05.TCP;

import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerExam2 {
    public static void main(String[] args) throws IOException {
        ServerSocket soc = new ServerSocket(5000);
        System.out.println("TCP 서버 대기중");

        Socket so = soc.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));

        while (true) {
            System.out.println("대기중....");
            String getMsg = br.readLine();

            System.out.println(so.getInetAddress()+" : "+getMsg);
            System.out.print("보낼 메세지 : ");
            String sendMsg = in.readLine();
            bw.flush();
        }
    }
}
