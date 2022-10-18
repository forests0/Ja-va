package stream.ch00;

import java.io.IOException;
/*
    입력받아서 한번에 출력함
 */
public class Inputstream1 {

    public static void main(String[] args) {
        byte[] input = new byte[10];
        int a = 0;

        for (int i = 0; i < input.length; i++) {
            try {
                a = System.in.read();
                System.in.read(); // 엔터값 빼기
            } catch (IOException e) {
                System.out.println("IOException");
            }
            input[i] = (byte)a;
        }
        for (byte b : input) {
            System.out.print(b + " ");
        }
    }
}
