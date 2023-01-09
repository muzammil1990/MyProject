package com.volvo.java;

public class MethodOverloadingType1 {
//    If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
 
    // method overloading by changing the number of arguments.
    int add(int i, int j) {
        
        return i + j;
    }

    int add(int i, int j, int k) {
        
        return i + j + k;
    }
}
