package com.volvo.java.oopsConcept;

/**
 * This is also the PROGRAM to count the no. of objects in a class.
 * Java Program to illustrate the use of static variable which is shared with all objects.
 * 
 * The static variable gets memory only once in the class area at the time of class loading.
 * 
 * THE REAL DIFF BETWEEN STATIC AND NOT STATIC. CHECK Count_StaticVar VS Count_NonStaticVariable PG BOTH
 */
public class Count_StaticVar {

    static int i;   //this field will get the memory only once; is shared with all objects.

 // explict constr.
    Count_StaticVar() {
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Count_StaticVar c1 = new Count_StaticVar();
        Count_StaticVar c2 = new Count_StaticVar();
        Count_StaticVar c3 = new Count_StaticVar();
//        System.out.println(c1);

    }

}
