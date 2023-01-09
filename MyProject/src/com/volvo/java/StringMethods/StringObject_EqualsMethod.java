package com.volvo.java.StringMethods;

/*
The String equals() method compares the original content of the string. It compares values 
of string for equality.*/

/*String class provides two methods:

public boolean equals(Object another) compares this string to the specified object.
public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.
*/

//program to check equals method in String Class

public class StringObject_EqualsMethod {

    public static void main(String[] args) {

        String s1 = "Muzammil"; // creates string object in SCP
        String s2= "Muzammil";  // creates string object in SCP
        String s3= new String("Muzammil");  // creates string object in Normal Heap Memory and SCP
                                            //s3 points to Normal Heap Memory
        String s4= "Sachin";  // creates string object in SCP
        
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s1.equals(s4));
      

    }

}


