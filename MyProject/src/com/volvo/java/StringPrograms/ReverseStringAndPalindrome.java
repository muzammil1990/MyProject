package com.volvo.java.StringPrograms;

public class ReverseStringAndPalindrome {
    public static void main(String[] args) {
    	
        String s1 = "nono";
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        

        if (s1.equals(s2)) {
            System.out.println("Given string is a Palindrome -->  "+ s2);
        } else {
            System.out.println("Given string is not a Palindrome-->  "  + s2);
        }
    }

}
