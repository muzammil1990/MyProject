/**
 * 
 */
package com.volvo.java.oopsAbstraction;

/**
 * Rules: 1. if any class is inheriting the abstract class, sub class must implement all the incomplete method; must give implementation in sub class.
 * 
 * or
 * 
 * 2. declare sub class as abstract
 */

abstract class Test {

    abstract void display();

    abstract void put();

    public void show() {
        System.out.println("hi");
    }

}

// public abstract Abstraction3 extends Test: rule 2

public class Abstraction3 extends Test {

    @Override
    void display() {
        // TODO Auto-generated method stub
        System.out.println("overriden sub class method");
    }

}
