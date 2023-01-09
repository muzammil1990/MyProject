package com.volvo.java.exceptionhandling;

public class ExceptionHandling_Ex5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            int a[] = new int[5];
            a[4] = 23;
            
            String s= null;
//            System.out.println(s.length());
            System.out.println(a[4] / 0);
            System.out.println(a[4]);
            System.out.println(a[2]);
            a[5] = 100;

        }

        /*
        catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e.getMessage());
        }

        catch (ArithmeticException e) {

           System.out.println(e);
        }
        */

        catch (Exception e) {
//            System.out.println(e);  //o/p: java.lang.NullPointerException // tells exception name and message both
//            System.out.println(e.getMessage()); //  prints only the exception value
//            System.out.println(e.toString()); //name of the exception
            e.printStackTrace();  //prints exception name and exception value; tells package name.classname.methodname.lineNumber
        }

        finally {        //Java finally block is always executed whether an exception is handled or not.
            System.out.println("hello");
        }
    }

}
