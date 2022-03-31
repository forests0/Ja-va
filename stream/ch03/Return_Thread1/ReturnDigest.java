package stream.ch03.Return_Thread1;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ReturnDigest extends Thread{
    private String pwd;
    private byte[] digest;
    public ReturnDigest(String pwd) {
        this.pwd = pwd;
    }

    public byte[] getDigest() {
        return digest;
    }

    @Override
    public void run() {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(pwd.getBytes());
            digest = md.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
