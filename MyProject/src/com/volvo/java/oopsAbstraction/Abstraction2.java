package com.volvo.java.oopsAbstraction;

// in abstract class we can not create object so to use non static variables we must use super() 

abstract class A {

    int x;

    A(int x) {
        this.x = x;
        System.out.println(x);
    }

}

public class Abstraction2 extends A {

    public Abstraction2() { // calling a constr from another constr is called constr chaining
        super(10); // first statement; super class contr; concept: construtor chaining
        System.out.println("inside sub class");

    }

    public static void main(String[] args) {
        Abstraction2 abs = new Abstraction2();
        System.out.println(abs.x);  // bcoz sub class can access super class
    }
}
