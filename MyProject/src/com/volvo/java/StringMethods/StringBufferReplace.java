package com.volvo.java.StringMethods;

//The replace() method replaces the given string from the specified beginIndex and endIndex.
//endIndex is exclusive
public class StringBufferReplace {

    public static void main(String[] args) {

        StringBuffer sb =new StringBuffer("Muzammil");
        sb.replace(2, 6, "SachinTendulkar"); //endIndex is exclusive just like substring() of String class
        System.out.println(sb);
        
    }
}
