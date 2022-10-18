package stream.ch05.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] data = new byte[65535];

        DatagramPacket dp = new DatagramPacket(data, data.length);
        System.out.println("UDP 서버 대기중....");

        while(true) {
            ds.receive(dp);
            String msg = new String(dp.getData()).trim();
            System.out.println(dp.getAddress()+" : "+ msg);
        }
        /*휘끠휘끼 */
    }
}
