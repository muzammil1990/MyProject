/**
 * 
 */
package com.volvo.jave.Construtorchaining;

/**
 * Contr: special type of method which gets executed each and evry time when an object/instance is created. 
 * it is neither static nor non static 
 * it is used for initialising instance/non static varibale
 * 
 * 1. calling one constr from another constr is called constr chaining 
 * 2. can be achieved by two ways
 * 
 * 2a. call to this= this()= within a class 
 * 2b. call to super= super()= within super and sub class; inheritance is must
 * 
 * 3. Call to this() or Call to Super() should always be the first statement in the constructor
 * 4. Only one constructor can be called from another constructor
 */

public class ConstructorChainingEx1 {
//    int a;
    
    public ConstructorChainingEx1() {
        System.out.println("In Default Constr");
        
    }
    
   public ConstructorChainingEx1(int a){
       this();
       System.out.println("In int constr ");
       
       
   }
   
   public ConstructorChainingEx1(double d){
       this(8);
       System.out.println("In double constr");
    
   }
   
   public static void main(String[] args) {
    ConstructorChainingEx1 c1 = new ConstructorChainingEx1(8.5);
}

}
