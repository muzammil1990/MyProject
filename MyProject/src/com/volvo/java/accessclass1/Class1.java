package com.volvo.java.accessclass1;

class Class1 {

    int i = 200;
    static int j = 90;

    void add() {
        int a = 20;
        int b = 30;
        System.out.println(a + b);
    }

    static void sub() {
        int a = 50;
        int b = 10;
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Class1 c = new Class1();
        System.out.println(c.i);
        c.add();

        Class1.sub();
        sub();
        System.out.println(Class1.j);
        System.out.println(j);
    }
 }
