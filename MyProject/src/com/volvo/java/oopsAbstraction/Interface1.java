package com.volvo.java.oopsAbstraction;

/* Rules:
 1. Interface is type definition block whose naming convention is same as class
 2. Interfaces are by default abstract (difference abstract class)
 3. It can have only abstract methods  (difference abstract class) dont memorize. this fails from java 8
 4. Interface can not have objects.
 5. All methods in the interface are by default public and abstract
 6. All variables in the interface are by default public, static and final 
 7. Constructors can not be created in interface as all the variables are static and final.  (difference abstract class)
 8. interface can have static methods (from java 8 features)
 9. interface can have default method (from java 8- features)
 10. interface can not have final method      (difference abstract class)
*/
 interface Interface1{
     
    int a = 10;  // public static final int a = 10;
      
    int b;  //Since all the variables in the interface is by default Final so it must be initialized or else we get compile time error.
    
    public void display(){  //rule 3
        
    }
    
    void show(); // public abstract void show();
    
    public final void read(){ //rule 10
        
    }
    
    public static  void write(){ //rule 8
        
    }

}
