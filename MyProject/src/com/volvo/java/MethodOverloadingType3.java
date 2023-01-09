package com.volvo.java;

public class MethodOverloadingType3 {

//    complie time error since ambiguity; which method to call
//    hence method overloading is not possible by changing only the return type of method.
    static int add(int a, int b) {
        return a + b;
    }

    static double add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        
        MethodOverloadingType3.add(10,20);
    }

}
