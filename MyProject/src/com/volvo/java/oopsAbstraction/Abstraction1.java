package com.volvo.java.oopsAbstraction;

//// abstract class= no object ; why?
// because in abstract class, the abstract methods  has nothing, no body. So creating 
// an object of the abstract class and calling the method having no body makes no sense.
// also it will give an error.

public abstract class Abstraction1 {

    int a; // it can have static or non static variable

    static String n = "Raj";

    abstract void get(); // it can have abstract method( method declaration with abstract keyword)

    void show() {
        System.out.println("java"); // can have method definition- full body of method ; non abstract method
    }

    public static void main(String[] args) {

        Abstraction1 a = new Abstraction1();

    }

}
