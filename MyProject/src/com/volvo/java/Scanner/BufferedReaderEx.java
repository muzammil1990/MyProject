package com.volvo.java.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Methods in BufferedReader class
1. readLine() throws IOException: readLine() reads a line of text. A line is considered to be terminated by any one of a line feed (‘\n’), a carriage return (‘\r’), a carriage return followed immediately by a line feed, r by reaching the end-of-file(EOF).
2. read() throws IOException: read() returns the character read as an integer in the range 0 to 65535, or -1 if the end of the stream has been reached.
*/
public class BufferedReaderEx {

    public static void main(String[] args) throws IOException {

        // scenario 1:
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you string here:");
        String str = bf.readLine();
        System.out.println(str);

        
        // sceanrio 2:
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your integer data here:");
        int x = Integer.parseInt(br.readLine());

        System.out.println("Enter your float data here:");
        float y = Float.parseFloat(br.readLine());

        System.out.println("Enter your string here:");
        String s = br.readLine();

        System.out.println("Cast from string to Integer: " + x);
        System.out.println("Cast from String to Float: " + y);
        System.out.println(s);

    }
}
