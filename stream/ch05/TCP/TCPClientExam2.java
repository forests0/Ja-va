package stream.ch05.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClientExam2 {
    public static void main(String[] args) throws IOException {
        InetAddress is = InetAddress.getByName("127.0.0.1");
        Socket so = new Socket(is, 5000);
        System.out.println("보낼 메시지 입력");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));

        while(true) {
            System.out.print("보낼 메세지 : ");
            String sendMsg = in.readLine();
            bw.write(sendMsg + "\n");
            bw.flush();

            System.out.println("서버 메세지 기다림.....");
            String getMsg = br.readLine();
            System.out.println(so.getInetAddress() + " : " + getMsg);

        }
    }
}
