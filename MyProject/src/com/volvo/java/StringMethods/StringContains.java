package com.volvo.java.StringMethods;

public class StringContains {

    public static void main(String[] args) {
        
        String name="what do you know about me";
        
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("About"));
        System.out.println(name.contains("why"));
    }
}
