package javaIo_demo;

import java.io.FileInputStream;

public class demo_01 {
    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("d:/a.txt");
        int read = fileInputStream.read();
        System.out.println(read);
    }
}
