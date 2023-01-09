package com.volvo.jave.Construtorchaining;

//Read ConstructorChaining3 first then come to this pg

class Example2{
    {
        System.out.println(1);
    }
}


 class Example3 extends Example2{
    
     {                               
        System.out.println(2);
    }

}
 
 public class Example1{
     public static void main(String[] args) {
         Example3 e = new Example3();
         
    }
     
 }


