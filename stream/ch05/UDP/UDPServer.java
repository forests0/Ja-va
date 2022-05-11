package stream.ch05.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] data = new byte[65535];

        DatagramPacket dp = new DatagramPacket(data, data.length);
        System.out.println("UDP 서버 대기중....");

        ds.receive(dp);
        String msg = new String(dp.getData()).trim();
        System.out.println(dp.getAddress()+" : "+ msg);
        /*휘끠휘끼 */
    }
}
