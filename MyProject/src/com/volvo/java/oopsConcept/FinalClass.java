package com.volvo.java.oopsConcept;

/**
 * 1.final class can not be inherited
 * 2. but object can be created for final class.
 */

public class FinalClass extends Test {

}

class TestingObjectConcept {
    
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
    }

}

 final class Test {

    void display() {
        System.out.println("hi_test");
    }
}