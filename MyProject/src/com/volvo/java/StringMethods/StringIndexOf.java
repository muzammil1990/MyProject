package com.volvo.java.StringMethods;

public class StringIndexOf {

    public static void main(String[] args) {

        // printing ascey value for smaller case characters
        for (int i = 'a'; i <= 'z'; i++) {  //in i= numerical value will be saved bcoz datatype is int

            System.out.print(" " + i);
        }

        System.out.println("\n");

        // printing ascey value for upper case char
        for (int i = 'A'; i <= 'Z'; i++) {  //in i= numerical value will be saved

            System.out.print(" " + i);
        }

        System.out.println("\n");

        // java String indexOf(String substring) Method Example
        // This method takes substring as an argument and returns index of first character of the substring.

        String s1 = "This is indexOf method";
        int i = s1.indexOf("in"); // return index where interpreter first finds the letter "i" with 'n'
        System.out.println(i);

        // java String indexOf(String substring, int fromIndex) Method Example
        // This method takes substring and index as arguments and returns index of first character occured after the given fromIndex

        String s2 = "Google offered in:";
        int j = s2.indexOf("off", 8);
        System.out.println(j); // returns -1 if string is not found.

        int k = s2.indexOf("off", 5);
        System.out.println(k); // returns the index of this string

        /*
         * Java String indexOf(int char, int fromIndex) Method Example This method takes char and index as arguments and returns index of first character
         * occured after the given fromIndex.
         */

        String s3 = "Google offered in:";
        int l = s3.indexOf('g', 2);
        System.out.println("l value: "+l);
        
        int m = s3.indexOf('g', 4);
        System.out.println("m value: "+m);
    }
}
