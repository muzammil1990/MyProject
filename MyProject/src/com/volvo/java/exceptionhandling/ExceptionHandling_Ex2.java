package com.volvo.java.exceptionhandling;


// example of runtime exception which is checked only in runtime but not during compile time
public class ExceptionHandling_Ex2 {

    public static void main(String[] args) {
        
        String s=null;
        
        System.out.println(s.length());
    }
}

