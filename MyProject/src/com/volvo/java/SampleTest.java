package com.volvo.java;

public class SampleTest {

   

    public static void main(String[] args) {
        int a;
        int b;
        
       static {
            a = 20;
            b = 30;
            int c = a + b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        System.out.println(a);
        System.out.println(b);
        

    }

}
