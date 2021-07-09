package com.shui.headfirstdesignpatterns.chapter3.javaIO;

import java.io.*;

/**
 * @author shui.
 * @date 2021/7/9.
 * @time 11:05.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
