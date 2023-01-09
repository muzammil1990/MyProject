package com.volvo.java.oopsAbstraction;

// It can have static methods and non static methods both
abstract class Concepts {

    abstract void display();

    abstract void put();

    public void show() { // non static methods
        System.out.println("hi");
    }

    static int add() { // static methods
        return 3;
    }

}

public class Abstraction4 extends Concepts {

    @Override
    void display() {
        // TODO Auto-generated method stub
        System.out.println("in sub class- display method");
    }

    @Override
    void put() {
        // TODO Auto-generated method stub
        System.out.println("in sub class- put method");
    }

    public static void main(String[] args) {
        Abstraction4 ab = new Abstraction4();
        ab.display();
        ab.put();
        ab.show(); // calling non static member in static, so obj required.

        int res1 = add();
        System.out.println("Called static method directly: " + res1);

        int res2 = Abstraction4.add();
        System.out.println("Called static method using classname.static: " + res2);
    }

}
