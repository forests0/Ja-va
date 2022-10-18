package stream.ch03;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAThread implements Runnable{

    private String pwd;
    public SHAThread(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public void run() {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(pwd.getBytes());
            byte[] byteData = md.digest();

            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toHexString(0xff & byteData[i]));
            }
            System.out.println(this + ":" + sb.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Thread t = new Thread(new SHAThread("password"));
            t.start();
        }

    }
}
