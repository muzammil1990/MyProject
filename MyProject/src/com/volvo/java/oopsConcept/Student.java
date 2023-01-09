/**
 * 
 */
package com.volvo.java.oopsConcept;

/**
 * java pg to demonstrate use of static variable
 */
 public class Student {

    int rollno; // instance or non static var
    String name;
    static String college= "MS_Coll";

    // explcit written parameterized constr.
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // method to display values
    void display() {
        System.out.println(rollno + "  " + name + "  " + college);
        
    }
}

 