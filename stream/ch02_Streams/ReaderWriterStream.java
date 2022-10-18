package stream.ch02;

import java.io.*;

/*
키보드로 입력받아서 저장
 */
public class ReaderWriterStream {
    public static void main(String[] args) {
        //System.in
        //InputStreamReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String data = reader.readLine();
            System.out.println(data);
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            writer.write(data);
            writer.close();

            BufferedReader readData = new BufferedReader(new FileReader("data.txt"));
            System.out.println(readData.readLine());
            readData.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
