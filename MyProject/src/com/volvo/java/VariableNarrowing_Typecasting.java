package com.volvo.java;

//how to remember
/*
b  boolean= 1 bit = false
b  byte = 1 byte  = 0 ;

c  char= 2 byte = '\u0000'= null character not as in string literal null  
s  short=2 byte= 0  ;

i  int =4 byte = 0  
f  float = 4 byte = 0.0f ;

l  long= 8 byte= 0L
d  double= 8 byte= 0.0d

//String=  default value= null
*/

class VariableNarrowing_Typecasting {

    public static void main(String[] args) {

        float b = 10.5f;
        int a = (int) b; // typecasting
        System.out.println("b is:" + b);
        System.out.println("a is:" + a);

    }

}
