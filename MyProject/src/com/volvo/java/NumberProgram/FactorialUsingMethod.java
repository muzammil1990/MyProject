package com.volvo.java.NumberProgram;

// factorial of a no. result to be printed in main method
public class FactorialUsingMethod {

    //good friend
    int getFactorial(int num) {
        int sum=1;
        for (int i = 1; i <= num; i++) {
            sum=sum*i;
        }
        return sum;
    }
}
