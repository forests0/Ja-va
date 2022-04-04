package stream.ch03.Return_Thread3;

public class InstanceCallBackDigestInterface {
    private String pwd;

    public InstanceCallBackDigestInterface(String pwd) {
        this.pwd = pwd;
    }
    public void calculateDigest() {
        InstanceCallBackDigest icb = new InstanceCallBackDigest(pwd, this);
        Thread t = new Thread(icb);
        t.start();
    }

    public void receiveDigest(byte[] digest) {
        StringBuffer sb= new StringBuffer();
        for(int i = 0; i < digest.length; i++) {
            sb.append(Integer.toHexString(0xff & digest[i]));
        }
        System.out.println(this + ": "+sb.toString());
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            InstanceCallBackDigestInterface cb = new InstanceCallBackDigestInterface("password");
            cb.calculateDigest();
        }
    }
}
