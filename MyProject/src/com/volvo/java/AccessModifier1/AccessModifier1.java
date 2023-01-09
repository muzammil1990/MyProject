/**
 * 
 */
package com.volvo.java.AccessModifier1;

/**
 * def: Access modifiers controls the visibility of java components(data members, methods, class, constr)
 * Rules:
 * 1. Outer class has to be public; cannot be protected or private
 * 2. inner class can protected and private 
 * 3. access modifer can not be used with local vaiables.
 */

public class AccessModifier1 {
    
    public static int a = 10;
    
    public String s1;
    
    public AccessModifier1(String s1) {
        this.s1 = s1;
        System.out.println(s1);
        
    }
    
    public static void run(){
        System.out.println("In run method");
    }
    
    public static void main(String[] args) {
        AccessModifier1 a1= new AccessModifier1("Java");
        System.out.println(a);
        run();
    }
    
}