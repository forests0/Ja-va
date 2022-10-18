package stream.ch05.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientExam {
    public static void main(String[] args) throws IOException {
        InetAddress is = InetAddress.getByName("10.150.150.101");
        Socket so = new Socket(is, 5000);
        System.out.println("보낼 메시지 입력");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String msg = in.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));

        bw.write(msg + "\n");
        bw.flush();
        bw.close();
    }
}
