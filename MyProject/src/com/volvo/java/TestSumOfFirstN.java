package com.volvo.java;

class TestSumOfFirstN {

    public static void main(String[] args) {
        SumOfFirstN ob= new SumOfFirstN();
        int result=ob.getSumofFirstTenNumbers(20);
        System.out.println("sum of first x Numbers: "+result);
        
       int nextten= ob.getSumofNext10(10);
       System.out.println("Sum of next 10 Numbers: "+nextten);
        
    }
}
