
/**
 * 
 */
package com.volvo.jave.Construtorchaining;

/**
 * pg to show for call to super(), inheritance is must
 */

class Test {

    public Test() {
        System.out.println("super class constr");
    }
}

//public class ConstructorChaining6 extends Test{

public class ConstructorChaining6{    // no inheritance guess output??

    public ConstructorChaining6() {
        super();
        System.out.println("sub class constr");
    }

    public static void main(String[] args) {
        
        ConstructorChaining6 c6= new ConstructorChaining6();
    }
}
