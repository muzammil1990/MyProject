package com.volvo.java;

class Variable {

    int data = 50; // instance variable since declared inside class and outside method.

    static int m = 30; // static variable since with static keyword.

    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        int c;

        c = a + b;
        System.out.println(c);
    }
}
