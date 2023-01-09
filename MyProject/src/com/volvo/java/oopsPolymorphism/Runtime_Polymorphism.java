/**
 * 
 */
package com.volvo.java.oopsPolymorphism;

/**
 * Runtime polymorhism: call to overriden methods is resolved during runtime based on the objects we create is 
 *                      called runtime polymorphism
 * 
 * 
 * Rules: 1. ALL Method should be non static 
 * 2. overriding is must 
 * 3. upcasting is must
 */

interface Bank {

    double rateOfInterest();  //abstract method
}

class ICICI implements Bank {

    @Override
    public double rateOfInterest() {
        // TODO Auto-generated method stub
        return 3.4;
    }

}

class SBI implements Bank{

    @Override
    public double rateOfInterest() {
        // TODO Auto-generated method stub
        return 4.5;
    }
    
}

public class Runtime_Polymorphism  {

    public static void main(String[] args) {
        Bank b1= new ICICI();
        Bank b2= new SBI();
        SBI s = new SBI();  // here no upcasting; this can be achieved by normal/single level inheritance also. this is not runtime poly
        
       double result= b1.rateOfInterest();
       System.out.println(result);
       
       double result2= b2.rateOfInterest();
       System.out.println(result2);
       
       System.out.println(s.rateOfInterest());
    }
   
}
