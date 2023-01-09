package com.volvo.java.oopsInheritance;

//Def:
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

/*method overriding to happen rules
1. inheritance must be there
2. method name in super class and sub class must be same
3. method signature(i.e. no of parameters, sequence of method parameters)
in super class and sub class must be same
*/

class Super1 {

    void display() {
        System.out.println("hi, super class");
    }

    void display1(int a, float b) {
        System.out.println("Hi, Super class");
    }

}

public class MethodOverriding extends Super1 {

    void display() {
        System.out.println("bye- Sub class");
    }

    // sequencing of method para is diff
    void display1(float b, int a) {
        System.out.println("Bye- Sub class");
    }

    public static void main(String[] args) {

        MethodOverriding mo = new MethodOverriding();
        mo.display();
        mo.display1(10, 1.4f); //method overriding is not happening

    }
}
