package com.volvo.java;

public class Method1 {

    //only static methods
    
    // reserve
    static void add() {
        int i = 30;
        int j = 40;
        System.out.println(i + j);
    }

    // selfish
    static void add1(int a, int b) {
        System.out.println(a + b);
    }

    // kind
    static int add2() {
        int a = 20;
        int b = 30;
        int result = a + b;
        return result;
    }

    // good
    static String add3(int a, int b) {
        int result = a + b;
        return "inside add3 " + result;
    }

    // Calling all methods
    public static void main(String[] args) {

        Method1.add();
        Method1.add1(19, 20);
        int s = Method1.add2();
        System.out.println(s);
        String s1 = Method1.add3(30, 50);
        System.out.println(s1);

    }

}
