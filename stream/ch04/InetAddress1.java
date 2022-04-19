package stream.ch04;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
www.google.com 으로 접속하는 과정을 코딩
 */
public class InetAddress1 {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("-----local-----");
            System.out.println(local);
            System.out.println(local.getHostName());
            System.out.println(local.getHostAddress());

            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("-----google-----");
            System.out.println(google);
            System.out.println(google.getHostName());
            System.out.println(google.getHostAddress());

            InetAddress[] navers = InetAddress.getAllByName("www.naver.com");
            System.out.println("-----naver-----");
            for(InetAddress a : navers) {
                System.out.println(a);
                System.out.println(a.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
