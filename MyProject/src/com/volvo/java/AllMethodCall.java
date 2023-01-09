package com.volvo.java;

public class AllMethodCall {

    // reserve friend
    static void add() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    // selfish friend
    static void add1(int a, int b) {
        System.out.println(a + b);
    }

    // good friend
    static String add3(int a, int b) {
        return "inside method add3 " + a + b;
    }

    // non static method
    void testNonStaticMethod() {
        System.out.println("Am non static method");
    }

    public static void main(String[] args) {
        // two ways of calling static method
        AllMethodCall.add(); // calling static members inside another static method.
        add();

        AllMethodCall.add1(100, 200);
        add1(1000, 10);

        int result = AllMethodCall.add2(); // classname.methodname
        System.out.println(result);
        int result2 = add2();
        System.out.println(result2);

        String res = AllMethodCall.add3(20, 20);
        System.out.println(res);
        String res2 = add3(30, 30);
        System.out.println(res2);

        AllMethodCall p = new AllMethodCall(); // calling non static method inside static method, create the object
        p.getevenOdd();

        p.evenOdd2(55); // calling non static method inside static method

    }

    // kind friend
    static int add2() {
        int a = 300;
        int b = 300;
        return a + b;
    }

    // non static method (reserve)
    void getevenOdd() {

        int a = 30;
        int b = 2;
        if (a % b == 0)
            System.out.println("no is even ");

        else
            System.out.println("odd no ");

        testNonStaticMethod(); // callin non static inside another non static method

        AllMethodCall.add(); // calling static method inside non static
        add(); // calling static inside non static
    }

    // selfish
    public void evenOdd2(int num) {
        if (num % 2 == 0) {
            System.out.println("even no" + num);
        } else {
            System.out.println("odd no" + num);
        }
    }

}
