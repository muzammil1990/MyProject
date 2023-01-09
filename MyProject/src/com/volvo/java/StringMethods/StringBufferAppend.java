package com.volvo.java.StringMethods;

/* Append(): is used to append the specified string with the existing string. The append() method is overloaded like
append(char), append(boolean), append(int), append(float), append(double) etc.*/

public class StringBufferAppend {

    // The append() method concatenates the given argument with the existing string.

    public static void main(String[] args) {

        // sb points to Normal heap memory (non pool area)
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1 == sb2);
        
        System.out.println(sb1);
        sb1.append(" Muzammil");  //now original string is changed 
        System.out.println(sb1);

    }
}
