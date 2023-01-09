package com.volvo.java;

public class LocalVarRule5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int a=40;
        {
            int b=23;
            a=56;
            System.out.println(b);
//            System.out.println(a);
        }
        a=78;
        System.out.println(a);
    }

   
}
