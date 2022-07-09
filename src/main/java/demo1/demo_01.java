package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo_01 {
    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("d:/a.txt");
        int read = fileInputStream.read();
        System.out.println(read);
    }
}
