package com.volvo.java.StringPrograms;

public class CountOfWords_SecondWay {

    public static void main(String[] args) {

        String s1 = "   muzammil is a good boy when he was young  ";
               s1 = s1.trim();
               
        String s2[] = s1.split(" ");

        System.out.println("Number of words " + s2.length);
    }
}
