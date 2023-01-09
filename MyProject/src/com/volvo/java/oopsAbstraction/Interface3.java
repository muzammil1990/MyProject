package com.volvo.java.oopsAbstraction;

// to use variables in interface
interface Concept {

    int a=10; // by default all variables in interface are public, static, final
}

public class Interface3 implements Concept {

    public static void main(String[] args) {
       System.out.println(Concept.a);  // to access static= classname.member
    }

}
