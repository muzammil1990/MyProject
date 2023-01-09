package com.volvo.java.StringMethods;

public class StringLength {
    
    public static void main(String[] args) {
        String s="MuzammiL";
        System.out.println(s.length());
        System.out.println(s.length()-1);
        System.out.println(s.charAt(s.length()-1));
        
        System.out.println(s.indexOf("i"));
    }
}