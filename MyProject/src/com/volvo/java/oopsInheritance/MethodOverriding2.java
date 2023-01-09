package com.volvo.java.oopsInheritance;

/*rules: 
    1. If data members(variable, methods) are static or private or final will not be allowed to override
    2. mainly non static context/members are allowed to override.
    
    
*/


//Q: print output as anticlockwise and clockwise.

class Shape{
    
    void rotate(){
        System.out.println("clockwise");
    }
}

class Rectangle extends Shape{  //hierarchial inheritance
//   void rotate(){
//       System.out.println("clockwise");
//   }
}

class Sqr extends Shape{ //hierarchial inheritance
    void rotate(){
        System.out.println("anticlockwise");
    }
}


public class MethodOverriding2 {

    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.rotate();  //not creating any method in subclass still prints clockwise. How? 
                    //ANS: since rectangle extends Shape- single level inheritance and sub class can
                    //access parent class property and behaviour
        
        Sqr s= new Sqr();
        s.rotate();
        
        
    }
}
