package com.volvo.java.exceptionhandling;

//read little theory from javatpoint the first page. common scenarios from javatpoint 
//dont read since those scenarios examples are converted into programs subsequently 
//in this package

public class ExceptionHandling_Ex1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // int data = 100 / 0;
        // System.out.println(data);
        try {
            int data = 100 / 0;

        } catch (ArithmeticException ae) {
            System.out.println(ae); // exception occured but caught by catch block that's why execution flow of the pg is not broken
        } // and it continues execution

        System.out.println("Rest of the code");

        int a = 10;
        if (a % 2 == 0) {
            System.out.println("Even no.  " + a);
        }
    }
}
