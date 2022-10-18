package stream.ch05;

import java.net.MalformedURLException;
import java.net.URL;

/*
    가상머신이 지원하는 프로토콜
 */
public class ProtocolTester {
    public static void main(String[] args) {
        Testprotocol("https://www.naver.com");
        Testprotocol("http://www.naver.com");
        Testprotocol("ftp://ibiblio.org");
        Testprotocol("ftp://C:");
        Testprotocol("jdbc://oracle:thin:@localhost:1521:xe");
        /*
        jdbc는 url로 접속할 때는 안됨.
         */
    }


    public static void Testprotocol(String url) {
        try {
            URL u = new URL(url);
            System.out.println(u.getProtocol() + " is supported");
        } catch (MalformedURLException e) {
            System.out.println("Not supported");
        }
    }
}
