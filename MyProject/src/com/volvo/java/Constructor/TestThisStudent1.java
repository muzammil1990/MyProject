package com.volvo.java.Constructor;

public class TestThisStudent1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ThisStudent1 s1= new ThisStudent1(007, "Bond", 5000f);
        s1.display(); 
        
        //local variable and instance variable are same, hence ambiguity issue
    }

}

//note: Ambiguity issue is resolved by creating TestThisStudent1_Correct class