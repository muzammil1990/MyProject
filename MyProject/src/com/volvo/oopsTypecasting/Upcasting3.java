package com.volvo.oopsTypecasting;

class A {

    public static void test() {
        System.out.println("inside super class");
    }

    public void test1() {
        System.out.println("test1- inside super class");
    }

}

class B extends A {

    public static void test() {
        System.out.println("inside sub class");
    }

    public void test1() {
        System.out.println("test1- inside sub class");
    }

}

public class Upcasting3 {

    public static void main(String[] args) {
        B b = new B(); // single level inheritance
        b.test();
        b.test1();
    }
}
