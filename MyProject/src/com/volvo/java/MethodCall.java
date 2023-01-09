
package com.volvo.java;

public class MethodCall {

    // reserve friend
    static void add() {
        int i = 30;
        int j = 40;
        System.out.println(i + j);
    }

    // selfish friend
    static void add1(int i, int j) {
        System.out.println(i + j);
    }

    // kind friend
    static int add2() {
        int a = 30;
        int b = 20;
        return a + b;
    }

    // good friend
    static int add3(int a, int b) {
        return a + b;
    }

    // Calling all methods
    public static void main(String[] args) {
        add();
        add1(10, 45);
        int result = add2();
        System.out.println(result);
        int result1 = add3(12, 34);
        System.out.println(result1);

        Method2_EvenOdd m2 = new Method2_EvenOdd();

        m2.getEvenOdd(102);

    }

}
