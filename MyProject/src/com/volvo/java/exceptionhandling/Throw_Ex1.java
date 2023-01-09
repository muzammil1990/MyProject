package com.volvo.java.exceptionhandling;

//example of custom exception
public class Throw_Ex1 {

    public static void validate(int age) {
        
        if (age < 18) {
            // throw Arithmetic exception if not eligible to vote ; runtime exception
            throw new ArithmeticException("Person is not eligible to vote");
        } 
        else 
        {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String[] args) {
        Throw_Ex1.validate(13);
        System.out.println("we can print rest of the code from here ");
    }
}
