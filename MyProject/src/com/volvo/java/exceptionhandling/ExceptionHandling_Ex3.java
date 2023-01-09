package com.volvo.java.exceptionhandling;

public class ExceptionHandling_Ex3 {

    public static void main(String[] args) {

        try {
            String s = "Muzammil";
//            int i = Integer.parseInt(s);
            Integer i= Integer.valueOf(s);

        } catch (NumberFormatException e)
        {
            System.out.println(e);
        }

        // even though an exception occurs execution will not stop

        int a = 9;
        if (a % 2 == 0) {
            System.out.println("even: " + a);
        } else {
            System.out.println("odd no: " + a);
        }

    }
}
