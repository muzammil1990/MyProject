package com.volvo.java.exceptionhandling;

//who is throwing error when no exception handling is done
//Ans: DefaultExceptionHandler
public class DefaultExceptionHandlerEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a[] = new int[5];
        a[4] = 23;
        String s = null;
        System.out.println(s.length());

    }

}
