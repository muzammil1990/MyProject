/**
 * 
 */
package com.volvo.java.oopsConcept;

/**
 * Program to demonstrate the use of a static method.
 */
public class StaticMethod {

    int rollno;
    String name;
    static String collName = "BMS";

    // static method to change the value of static variable.

    static void change() {
        collName = "IIT Bombay"; // re-initialisation concept; using method to change variable value
    }

    // constructor to initialize the instance variable
    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + collName);
    }

}
