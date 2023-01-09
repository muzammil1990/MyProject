package com.volvo.java.exceptionhandling;

public class ExceptionHandling_Unreachable {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[4] = 23;

            String s = null;
            System.out.println(s.length());
            System.out.println(a[4] / 0);
            System.out.println(a[4]);
            System.out.println(a[2]);
            a[5] = 100;

        } catch (Exception e) {
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        catch (ArithmeticException e) {

            System.out.println(e);
        }

        finally {  //Java finally block is always executed whether an exception is handled or not.
            System.out.println("hello");
        }
    }
}
