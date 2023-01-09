package com.volvo.java.StringMethods;

public class StringSubstring_Ex1 {

    public static void main(String[] args) {
        
        String s="SachinTendulkar";
        System.out.println(s.substring(10)); // startindex is inclusive
        System.out.println(s.substring(5, 14)); //endindex is exclusive
    }
}
