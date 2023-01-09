/**
 * 
 */
package com.volvo.java.oopsConcept;

/**
 * final method (static/non static) can not be overridden
 */

class Test1 {

    final void get() {
        System.out.println("Machine Learning");
    }
    final void get(int a){
        System.out.println();
    }

    final static void run() {
        System.out.println("running");
    }
    
    
}

public class FinalMethod extends Test1 {

    void get(){
        System.out.println("java");
    }

    static void run() {
        System.out.println("walking");
    }

    public static void main(String[] args) {
        FinalMethod fm = new FinalMethod();
        fm.get();
    }

}
