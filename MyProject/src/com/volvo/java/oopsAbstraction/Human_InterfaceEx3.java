/**
 * 
 */
package com.volvo.java.oopsAbstraction;

interface A1 {

    void run();

}

interface B extends A1 {
    void wish();
}

public class Human_InterfaceEx3 implements B {

    @Override
    public void wish() {
        // TODO Auto-generated method stub

        System.out.println("wishing -  class Human_InterfaceEx3 ");
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub

        System.out.println("running inside -  class Human_InterfaceEx3 ");
    }

    public static void main(String[] args) {
        Human_InterfaceEx3 h = new Human_InterfaceEx3();

        h.run();
        h.wish();
    }

}
