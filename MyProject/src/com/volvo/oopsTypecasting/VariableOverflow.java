package com.volvo.oopsTypecasting;

public class VariableOverflow {
//
//  boolean= 1 bit = false ;  
//  byte= 1 byte  = 0 ;                                                           
//  
//  Char= 2 byte = '\u0000'= null character not as in string literal null  ;
//  short= 2 byte= 0  ;
//  
//  int = 4 byte = 0  ;          
//  float= 4 byte = 0.0f ;   
//    
//  long= 8 byte= 0L
//  double= 8 byte= 0.0d
//  
//  String=  default value= null
    
    //overflow
    public static void main(String[] args) {
        int a=200;
        byte b=(byte)a;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        
    }
}
