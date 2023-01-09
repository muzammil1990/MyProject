package com.volvo.java.oopsPolymorphism;

public class CompileTime_Polymorphism2 {

    public static int add(int a, int b) {

        return a + b;
    }

    public static int add(double a, int b) {   // overloading thru datatype

        return  (int) (a + b);  //typecasting; conversion from double to int 
    }

    public static double add(int a, double b) {   // overloading thru datatype

        return a + b;
    }

    public static void main(String[] args) {
        CompileTime_Polymorphism2 p = new CompileTime_Polymorphism2();

        int result1 = CompileTime_Polymorphism2.add(10, 10);
        System.out.println(result1);

        int result2 = CompileTime_Polymorphism2.add(30.22, 10);
        System.out.println(result2);

        double result3 = CompileTime_Polymorphism2.add(10, 20.34);
        System.out.println(result3);

    }
}
