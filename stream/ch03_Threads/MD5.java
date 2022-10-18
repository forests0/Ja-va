package stream.ch03;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
    Message Digest algorithm 5
    임의의 길이를 입력받아 128bit 고정 길이의 값 출력
    입력에 대한 제한 x
    단방향(암호화 O, 복호화 X)
 */

public class MD5 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            //알고리즘 적용
            md.update("password".getBytes());
            //128bit 고정 값 들고 옴
            byte[] bytedata = md.digest();
            //출력하기 위함
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < bytedata.length; i++) {
                sb.append(Integer.toHexString(0xff & bytedata[i]));
            }
            System.out.println(sb.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
