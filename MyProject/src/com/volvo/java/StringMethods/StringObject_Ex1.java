package com.volvo.java.StringMethods;

public class StringObject_Ex1 {

    static String s1= new String("java");
    static String s2="java";
    
    public static void main(String[] args) {

        
     System.out.println(s1); // s1 is pointing to Normal heap memory(non-pool area)
     System.out.println(s2); // s2 is pointing to String constant pool in Heap 
     
    }
}
