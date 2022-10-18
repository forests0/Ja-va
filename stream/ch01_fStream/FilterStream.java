package stream.ch01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilterStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            System.out.println(bin);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
