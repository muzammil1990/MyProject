/**
 * 
 */
package com.volvo.jave.Construtorchaining;

abstract class Easy {
    public Easy() {
        System.out.println("default constr - inside super class ");
    }
}

public class ConstructorChaining3 extends Easy{

    public ConstructorChaining3() {
        
        //super();    // jvm will call the default constr implicitly
        System.out.println("default constr - inside sub class ");
    }
    
    public static void main(String[] args) {
 
        ConstructorChaining3 c1 = new ConstructorChaining3();
        
    }
}
