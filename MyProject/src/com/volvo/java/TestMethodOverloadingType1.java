package com.volvo.java;

public class TestMethodOverloadingType1 {

    public static void main(String[] args) {
        
        MethodOverloadingType1 m= new MethodOverloadingType1();
        
     // method add calling
        int save= m.add(10, 20); 
        System.out.println(save);
        
     // method add calling
        int saveResult= m.add(11, 21, 31); 
        System.out.println(saveResult);
        
     //calling the same add method again and again hence method overloading using number of arguments
    }
}
