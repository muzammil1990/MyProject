package com.volvo.oopsTypecasting;

//boolean= 1 bit = false ;  
//byte= 1 byte  = 0 ;                                                           
//
//Char= 2 byte = '\u0000'= null character not as in string literal null  ;
//short= 2 byte= 0  ;
//
//int = 4 byte = 0  ;          
//float= 4 byte = 0.0f ;   
//
//long= 8 byte= 0L
//double= 8 byte= 0.0d
//
//String=  default value= null

class VariableNarrowing_Typecasting {

    public static void main(String[] args) {

        float b = 10.5f;
        int a = (int) b; // typecasting
        System.out.println("b is:" + b);
        System.out.println("a is:" + a);

    }

}
