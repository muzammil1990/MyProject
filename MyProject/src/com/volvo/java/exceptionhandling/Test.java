package com.volvo.java.exceptionhandling;

public class Test {

    public static void main(String[] args) {

        try {
            int a = 100 / 0;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }

        System.out.println("Rest of code");
        int a = 10;
        if (a % 10 == 0) {
            System.out.println("Even no:" + a);
        }
    }

}
