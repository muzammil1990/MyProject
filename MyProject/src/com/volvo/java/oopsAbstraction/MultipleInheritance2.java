package com.volvo.java.oopsAbstraction;


interface A3{
     void run();  // public abstract void run();
}

interface B3{
    
    int wish();
}


class C{
    
    void fly(){
        System.out.println("flying");
    }
}


class D1 extends C implements A3,B3{

    @Override
    public int wish() {
        
        return 3;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("running");
    }
    
}



public class MultipleInheritance2 {
    
    
    public static void main(String[] args) {
      
        D1 d1= new D1();
        
        d1.fly();

        d1.run();
        
        int result= d1.wish();
        System.out.println(result);
        
//      System.out.println(d1.wish());
        
    }
    
    
}
