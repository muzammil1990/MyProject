package com.volvo.java.exceptionhandling;
// Def: Creating our own Exception is known as custom exception or user-defined exception.

//Also read theory from javaTpoint to understand more

/*
Rules:
1. constructor of user-defined exception takes a string as an argument.
2. The string is passed to constructor of parent/super class Exception using the super() method.
3. Any class which uses custom exception must create method to do some logical action.
*/

//class representing custom exception or user-defined exception
class WrongAge extends Exception {

    public WrongAge(String str) {
        super(str);
    }
}

// class that uses custom exception= WrongAge
public class CustomExceptionEx1 {

    static void validateAge(int age) throws WrongAge {
        if (age < 18) {
            throw new WrongAge("wrong age to vote, not eligible");
        }

        else {
            System.out.println("correct age to vote, eligible");
        }
    }

    public static void main(String[] args) {
        try {
            CustomExceptionEx1.validateAge(12);

        }

        catch (WrongAge e) {
            System.out.println("Exception occured " + e);
        }
    }
}
