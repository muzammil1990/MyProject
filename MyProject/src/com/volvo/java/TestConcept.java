package com.volvo.java;

public class TestConcept {
    // reserve

    public static void main(String[] args) {
        int num = 5;
        int a = 0, b = 1;
        int c = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(a);
            c=a+b;
            a = b;
            b = c;
        }

    }
}
