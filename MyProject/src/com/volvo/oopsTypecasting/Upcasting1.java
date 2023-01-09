package com.volvo.oopsTypecasting;
class A5{
    public static void run(){
        System.out.println("In Super class Run method");
    }
    
}

class A6 extends A5{
    public  static void run(){
        System.out.println("In Sub class Run method");
    }
}

public class Upcasting1 {
    
    
    
    public static void main(String[] args) {
        A5 a = null;
        A6 a1= null;
        a.run();  
        a1.run();
    }

}
