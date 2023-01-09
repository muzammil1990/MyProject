package com.volvo.java.oopsObject;

//print default values using object and more.

public class Car {

    /*Instance variable in Java
    A variable which is created inside the class but outside the method is known as an instance variable. 
    Instance variable doesn't get memory at compile time. It gets memory at runtime when
    an object or instance is created. That is why it is known as an instance variable.*/
    
    
    int model;
    int wheel;
    boolean val1;
    long val3;
    String val4;
    double val5;
    float val6;
    char val7;
    byte val8;
    short val9;

    public static void main(String[] args) {

        Car a = new Car(); // when obj is created in ram a memory is allocated. At the same moment
        Car b = new Car(); // the non static or instance variable are initialised due to
        Car c = new Car(); // implicit constructor. And all instance variables are copied to objects.

        System.out.println("object of a " + a.model + "  " + a.wheel);
        System.out.println("object of b " + b.model + "  " + b.wheel);
        System.out.println("object of c " + c.model + "  " + c.wheel);
        System.out.println("String " + b.val4);
        System.out.println("double" + c.val5);
        System.out.println("float" + a.val6);
        System.out.println("char" + a.val7);
        System.out.println("byte" + a.val8);
        System.out.println("short" + a.val9);
        System.out.println("boolean " + a.val1);
        
        a.model=2015;
        a.wheel=4;
        
        b.model=2017;
        b.wheel=6;
        
        c.model=2018;
        c.wheel=8;
        
        System.out.println("object of a " + a.model + "  " + a.wheel);
        System.out.println("object of b " + b.model + "  " + b.wheel);
        System.out.println("object of c " + c.model + "  " + c.wheel);
        
        
    }

}
