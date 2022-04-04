package stream.ch03.Return_Thread3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class InstanceCallBackDigest implements Runnable{
    private String pwd;
    InstanceCallBackDigestInterface instance;

    public InstanceCallBackDigest(String pwd, InstanceCallBackDigestInterface instance) {
        this.pwd = pwd;
        this.instance = instance;
    }

    @Override
    public void run() {
        MessageDigest md= null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(pwd.getBytes());
            instance.receiveDigest(md.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
