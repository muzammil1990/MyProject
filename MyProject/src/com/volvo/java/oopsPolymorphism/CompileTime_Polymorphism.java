package com.volvo.java.oopsPolymorphism;

/**
 * 
 * def: poly= many;  phism = forms
 * one entity showing mulitple behaviour
 * 
 * Two types: 1. compile time, 2. Run time
 * 
 * Compile time Polymorphism: call to overloaded methods is resolved during compile time, based
 *                            on the parameters we provide while calling the overloaded methods
 *  
 *  Rules:
 *  1. All overloaded methods should be static
 *  2. overloading is must
 */



public class CompileTime_Polymorphism {

   public static void add(int a, int b){
        
        System.out.println(a+b);
        
    }
    
  public static void add(int a, double b){   // overloading thru datatype
        System.out.println(a+b);
    }
  
  public static void main(String[] args) {
      CompileTime_Polymorphism.add(10, 100);   //or call the method directly
      CompileTime_Polymorphism.add(20, 20.55);
      CompileTime_Polymorphism.add(20.3, 30.4);
}
}
