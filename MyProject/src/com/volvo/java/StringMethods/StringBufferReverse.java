package com.volvo.java.StringMethods;

public class StringBufferReverse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringBuffer sb = new StringBuffer("Momi");
        System.out.println(sb);
        System.out.println("String length " + sb.length());
        StringBuffer s = sb.reverse();
        System.out.println(s);
        System.out.println("Reversed string length " + s.length());

    }

}
