package com.volvo.oopsTypecasting;

// pg to show upcasting concept

//  type casting: Two types = 1. Object type casting = upcasting and downcasting
//                            2. Variable = Widening and Narrowing

/*Rules: 
    1. For upcasting = Inheritance is must
    2. Can only use super class members
    3. exception: if same method is present in super and subclass, during runtime, subclass method will be executed(method overriding)
    
    adv of upcasting: ??
    when to use upcasting ?? = during abstraction; to achieve abstraction
    
*/


class Bike {

    int a=10;
    
    public static void test(){
        System.out.println("Super class- test method");
        
    }
     
    void read() {
        System.out.println("Super class= read method");
    }

    void run() {
        System.out.println("Super class= run method ");
    }
}

 class Honda extends Bike {

     int a=100;
    
     
    void write(){
        System.out.println("write= Honda class");
    }
    
    void run() {
        System.out.println("sub class- run method");
    }
    
    public static void test(){
        System.out.println("Sub class- test method");
        
    }

}

public class Upcasting {

    public static void main(String args[]) {
       
       Bike b = new Honda(); // upcasting
       
       b.read();
       
//      b.write();  // can not use child /sub class  members
       
       b.run();
       
       System.out.println(b.a);
       
       b.test();
       
        
    }

}
