package com.volvo.jave.Construtorchaining;

//super class related to constructor chaining4

class B {
    
    public B() {
        System.out.println("super class constr");
    }

}

public class A extends B {

    public static void main(String[] args) {

        A a = new A();
    }
}
