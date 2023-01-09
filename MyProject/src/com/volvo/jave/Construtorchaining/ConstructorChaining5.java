package com.volvo.jave.Construtorchaining;

class Easy1 {

    int a; 
    public Easy1() {
        System.out.println("In super class-  defalut constr");
    }
    
    public Easy1(int a){
        this();
        System.out.println("In Super class - int const");
    }
}

public class ConstructorChaining5 extends Easy1{
    
    public ConstructorChaining5() {
        this(1.5);
        System.out.println("In sub class- default contr");
    }
    
    public ConstructorChaining5(double d){
        super(8);
        System.out.println("In Sub class- Double constr");
    }
    
    public static void main(String[] args) {
        ConstructorChaining5 c5 = new ConstructorChaining5();
        
    }
            
}
