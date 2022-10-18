package stream.ch05;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SourceViewer {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            URL url = new URL("https://www.google.com");
            in = url.openStream();
            Reader reader = new InputStreamReader(new BufferedInputStream(in));
            int c;
            while((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
