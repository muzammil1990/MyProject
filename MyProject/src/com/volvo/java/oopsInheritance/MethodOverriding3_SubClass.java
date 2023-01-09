package com.volvo.java.oopsInheritance;

/*
 * Q: can we override static methods
Ans: No
Reason: Overloading is the mechanism of binding the method call with the method body dynamically based on the parameters
we provide while calling the overloaded methods

Therefore,

Static methods are bonded at compile time using static binding. 
Therefore, we cannot override static methods in Java.
*/



class SuperClass {

    public static void staticMethod() {

        System.out.println("SuperClass: inside staticMethod");

    }

}

public class MethodOverriding3_SubClass extends SuperClass {

    // overriding the static method

    public static void staticMethod() {

        System.out.println("SubClass: inside staticMethod");

    }

    public static void main(String[] args) {

        SuperClass superClass = new SuperClass();

        SuperClass superClass2 = new MethodOverriding3_SubClass();

        MethodOverriding3_SubClass subClass = new MethodOverriding3_SubClass();

//        superClass.staticMethod();

        superClass2.staticMethod();

//        subClass.staticMethod();

    }

}