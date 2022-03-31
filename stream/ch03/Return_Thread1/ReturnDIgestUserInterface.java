package stream.ch03.Return_Thread1;

public class ReturnDIgestUserInterface {
    public static void main(String[] args) {
        ReturnDigest[] digests = new ReturnDigest[10];

        for(int i = 0; i < 10; i++) {
            digests[i] = new ReturnDigest("password");
            digests[i].start();
        }
        for(int j = 0; j < 10; j++) {
            StringBuffer sb= new StringBuffer();
            byte[] digest = digests[j].getDigest();
            for(int i = 0; i < digest.length; i++) {
                sb.append(Integer.toHexString(0xff & digest[i]));
            }
            System.out.println(j + "번째 : " + sb);
        }
    }
}
