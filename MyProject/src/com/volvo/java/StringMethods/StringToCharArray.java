package com.volvo.java.StringMethods;

public class StringToCharArray {

    /*
     * java string toCharArray() method converts the string into character array. It returns a newly created character array,
     *  its length is similar to this string and its contents are initialized with the characters of this string.
     */

    public static void main(String[] args) {

        String s = "hello";

        char[] c = s.toCharArray();

        /*
         * for (int i=0; i<c.length; i++) 
         * { 
         *  System.out.println(c[i]);
         *  }
         */

        for (char c1 : c) {
            System.out.println(c1);
        }
        
        

    }
}