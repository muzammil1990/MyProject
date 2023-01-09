package com.volvo.java.oopsAbstraction;

/**
 * Rules:
 * 1. if any class is implementing interface, sub class must implement all the incomplete methods; must give implementation
 * in sub class.
 * 
 * or
 * 
 * 2. declare sub class as abstract
 */

interface Car{
    
    void rolling();
    
    void breaking();
}

public class Nexon implements Car {  //Since we have given implementation to only rolling() and not to breaking() so CTE
    
    @Override
    public void rolling(){
        System.out.println("Car is rolling");
    }

}
