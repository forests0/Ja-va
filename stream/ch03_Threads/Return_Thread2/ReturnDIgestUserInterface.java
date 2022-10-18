package stream.ch03.Return_Thread2;

public class ReturnDIgestUserInterface {
    public static void main(String[] args) {
        ReturnDigest[] digests = new ReturnDigest[10];

        for(int i = 0; i < 10; i++) {
            digests[i] = new ReturnDigest("password");
            digests[i].start();
        }
        for(int j = 0; j < 10; j++) {
            while(true) {
                System.out.print((j + "번째 스레드 : "));
                byte[] digest = digests[j].getDigest();
                if(digest != null) {
                    StringBuffer sb= new StringBuffer();
                    for(int i = 0; i < digest.length; i++) {
                        sb.append(Integer.toHexString(0xff & digest[i]));
                    }
                    System.out.println(sb);
                    break;
                }
            }

        }
    }
}
