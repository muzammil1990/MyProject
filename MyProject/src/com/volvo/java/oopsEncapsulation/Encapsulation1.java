package com.volvo.java.oopsEncapsulation;

/**
 * Def: 
 * 1.Hiding or protecting the data is called encapsulation
 * 2. Wraping up of data members(Global variables) and member functions(methods) into one unit is
 * called encapsulation 
 * 
 * Rules:
 * 1. Declare all data members as private
 * 2. Give access thru public methods such as setters and getters
 * 3. setters and getters are not in-built methods; user created
 * 4. setters: used to set the data
 * 5. getters: to fetch/retrieve the data= make public
 * 
 * Why use encapsulation:
 * Ans:Explain advanatage and above statement is one of the advantage. 
 *     1.It provides you the control over the data
 *     2.It is a way to achieve data hiding in Java because other class will not be able to access the data through private data members.
 *     3.The encapsulate class is easy to test. So, it is better for unit testing.
 */

class Test{
    
   private int i;
   private String s;
    
    public void setI(int i){
        this.i= i;
    }
    
    public void setS(String s){
        this.s= s;
    }
    
    public int getI(){
        
        return i;
    }
    
    public String getS(){
        return s;
    }
}


public class Encapsulation1 {

    public static void main(String[] args) {
        Test t= new Test();
        t.setI(10);
        System.out.println(t.getI());
        
        t.setS("car");
        System.out.println(t.getS());
    }
}
