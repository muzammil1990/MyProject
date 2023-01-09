package com.volvo.java;

public class WaysToInitializeInstanceVariable {

    static int i;
    
    static {
        i = 45;
    }
// non static
    int j; 
    
    {
        j=100;
    }
    
    

    public static void main(String[] args) {
        System.out.println(WaysToInitializeInstanceVariable.i);
        WaysToInitializeInstanceVariable w= new WaysToInitializeInstanceVariable();
        System.out.println(w.j);

    }
}
