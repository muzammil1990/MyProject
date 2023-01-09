package com.volvo.java.StringMethods;

import com.volvo.java.SysoExample1;

/*The java string valueOf() method converts different types of values into string. 
By the help of string valueOf() method, you can convert int to string, long to string,
boolean to string, character to string, float to string, double to string, object to string and char array to string.
*/
public class StringValueOf {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a + 10);
        String s = String.valueOf(a); // int value converted into string
        System.out.println(s + 10);

        float b = 20.3f;
        String s1 = String.valueOf(b); // float value converted into string
        System.out.println(s1 + 10);

        long c = 30;
        String s2 = String.valueOf(c); // long value converted into string
        System.out.println(s2 + 10);

        double d = 40.2;
        String s3 = String.valueOf(d);
        System.out.println(s3 + 10);

        boolean e = false;
        String s4 = String.valueOf(e);
        System.out.println(s4 + 10);

        boolean f = true;
        String s5 = String.valueOf(f);
        System.out.println(s5 + 10);

        char g = 'h';
        String s6 = String.valueOf(g);
        System.out.println(s6 + 10);

        char[] i = { 'a', 'b', 'c' };
        String s7 = String.valueOf(i);
        System.out.println(s7 + 10);

        Object ob = 45;
        String s8 = String.valueOf(ob);
        System.out.println(s8 + 10);
    }
}
