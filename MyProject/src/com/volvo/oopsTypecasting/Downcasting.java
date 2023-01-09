package com.volvo.oopsTypecasting;


//rules:
//type casting: Object type casting= downcasting

// 1. upcasting is must = for upcasting, inheritance is must
// 2. Once downcasting is done= inheritance concept 

class Bike1 {

    int a=10;
    int x=30;
    
    public static void test(){
        System.out.println("In Super class test method");
        
    }
     
    void read() {
        System.out.println("read= Bike class");
    }

    void run() {
        System.out.println("inside Bike class");
    }
}

 class Honda1 extends Bike1 {

     int a=100;
    
     
    void write(){
        System.out.println("write= Honda class");
    }
    
    void run() {
        System.out.println("inside Honda class..");
    }
    
    public static void test(){
        System.out.println("In Sub class test method");
        
    }

}

public class Downcasting {
    
    public static void main(String args[]) {
        
        Bike1 b = new Honda1(); // upcasting
        b.read();
//        b.write();  // can not use child / sub class data members
        b.run();
        System.out.println(b.a);
        b.test();
     
        
        
        Honda1 h1 = (Honda1) b;
        h1.test(); //Downcasting= inheritance concept follows
        h1.write();
        h1.run();
        h1.read();
        System.out.println(h1.x);
        System.out.println(h1.a);
         
     }

}
