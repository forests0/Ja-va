package stream.ch05.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerExam {
    public static void main(String[] args) throws IOException {
        ServerSocket soc = new ServerSocket(5000);
        System.out.println("TCP 서버 대기중");

        Socket so = soc.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
        String msg = br.readLine();

        System.out.println(so.getInetAddress());
        System.out.println(msg);
        soc.close();
        so.close();
    }
}
