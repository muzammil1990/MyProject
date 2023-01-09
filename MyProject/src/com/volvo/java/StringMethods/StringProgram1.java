package com.volvo.java.StringMethods;

// pg to find out first char, middle char, last char of a string.
public class StringProgram1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "Muzammil is a good person";
        System.out.println("First char of string: " + s.charAt(0));

        int middleChar = s.length() / 2;
        System.out.println("Middle char of string is: " + s.charAt(middleChar));
        
        int lastChar=s.length()-1;
        System.out.println("last Char of string is: "+ s.charAt(lastChar));
    }

}
