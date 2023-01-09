package com.volvo.java.exceptionhandling;

public class ExceptionHandling_Ex4 {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 1;
            
        } catch (ArrayIndexOutOfBoundsException ai) 
        {
            System.out.println(ai);
        }
        
        // even though an exception occurs execution will not stop

        int a = 9;
        if (a % 2 == 0) {
            System.out.println("even: " + a);
        } else {
            System.out.println("odd not: " + a);
        }
    }
}
