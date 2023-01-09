/**
 * 
 */
package com.volvo.java.oopsAbstraction;

abstract class Tokyo {

    int a;

    public Tokyo(int a) {
        this.a = a;
        System.out.println(a);
    }

}

class India extends Tokyo {

    public India() {
        super(1001);
        System.out.println("inside sub class");
    }

}

public class Practice {

    public static void main(String[] args) {
        India i = new India();
    }
}