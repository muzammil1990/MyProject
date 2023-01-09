package com.volvo.java.Constructor;

/* 
 * Contr: special type of method which gets executed each and evry time when an object/instance is created. 
* it is neither static nor non static 
* it is used for initialising instance/non static varibale
*/

// java pg to show default constructor gets called everytime.
public class DefaultConstructor {

//  writing construtor explicity
    DefaultConstructor()
    {
        System.out.println("Default Construtor is being called");
    }
    
    public static void main(String[] args) {
        
//        whenever we create the object with new keyword, default constructor is called.
        DefaultConstructor d= new DefaultConstructor();
        
    }
}
