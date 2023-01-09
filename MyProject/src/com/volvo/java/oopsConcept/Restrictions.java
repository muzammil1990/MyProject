/**
 * 
 */
package com.volvo.java.oopsConcept;

/**
 * 1. The static method can not use non static data member or call non-static context directly.
 * 2. this and super cannot be used in static context
 */
public class Restrictions {

    int a=8; // non static or instance variable
    
    public static void main(String[] args) {
        
        System.out.println(a);
        
// to access/call non static context in static context we have to create the object of a class and then use.
    }
}
