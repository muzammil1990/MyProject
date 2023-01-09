/**
 * 
 */
package com.volvo.java.oopsConcept;

/**
 * to show normal calucation using static method
 */
public class StaticMethod2 {

    // by taking user input
    static double cubeOFNumber(double d) {

        return d * d * d;
    }

    public static void main(String[] args) {

        double result = StaticMethod2.cubeOFNumber(19);
        System.out.println(result);

    }

}
