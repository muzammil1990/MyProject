package com.volvo.java.Java8_Features;
/*
Points:
1. The Lambda expression is used to provide the implementation of an interface which has functional interface.

    FUNCTIONAL INTERFACE- An interface which has only one abstract method is called functional interface.
    
2. It saves a lot of code.
3. In case of lambda expression, we don't need to define the method again for providing the implementation.
    we can just write the implementation code.

Why use Lambda Expression
1. To provide the implementation of Functional interface.
2. Less coding.
*/


@FunctionalInterface
interface Drawable {

  void draw();
}

public class LambdaExpresion_ex1 {

    public static void main(String[] args) {

        int width = 10;

        Drawable d = () -> {
            // Body of no parameter lambda
            System.out.println(width);
        };
        
        d.draw();
    }

}
