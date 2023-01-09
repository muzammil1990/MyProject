package com.volvo.java;

public class TestMethodOverloadingType2 {

    public static void main(String[] args) {
        
        MethodOverloadingType2 m2= new MethodOverloadingType2();
        
// method overloading by changing the datatype and return type of the method.
        
//       calling method add with datatype double
        double result1= m2.add(10.2, 20.1);
        System.out.println(result1);
        
//        calling method add with datatype int
        int result2= m2.add(10, 20);
        System.out.println(result2);
    }
}
