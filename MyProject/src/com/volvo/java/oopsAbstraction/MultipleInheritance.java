/**
 * 
 */
package com.volvo.java.oopsAbstraction;

/**
 * to show multiple inheritance is possible thru interface; but not thru java class
 */

interface A2 {

    void display();  // by default in interface all methods are public and abstract;

}


interface B2{
    
    void display();  // public abstract void display();
}

 class MultipleInheritance1 implements A2,B2{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        
        System.out.println("given implementation in sub class");
    }

    
}
 
 public class MultipleInheritance {
     
     public static void main(String[] args) {
         MultipleInheritance1 m1 = new MultipleInheritance1();
         m1.display();
    }
 }


