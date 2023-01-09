/**
 * 
 */
package com.volvo.java.oopsConcept;

/**
 * pg to test the staticmethod class
 */
public class TestStaticMethod {

    public static void main(String[] args) {
        
        StaticMethod s1= new StaticMethod(111, "Raj");
        StaticMethod s2= new StaticMethod(111, "jitender");
        
        s1.display();
        s2.display();
        
        StaticMethod.change();
     
        s1.display();
        s2.display();
    }
}
