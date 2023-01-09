/**
 * 
 */
package com.volvo.java.oopsConcept;

/**
 * This is the test class for Student.java
 */
public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Anand");
        Student s2 = new Student(202, "Babita");
        
        s1.display();
        s2.display();
        //we can change the college of all objects
        Student.college="BMS";
        s1.display();
        s2.display();
    }

}
