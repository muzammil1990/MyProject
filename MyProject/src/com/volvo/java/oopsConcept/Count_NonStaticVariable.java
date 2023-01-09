package com.volvo.java.oopsConcept;

/* Java Program to demonstrate the use of an instance variable  
   which get memory each time when we create an object of the class.
*/
public class Count_NonStaticVariable {

    int i; // instance variable ; default value of int=0

    // explict constr.
    Count_NonStaticVariable() {
        i++;
        System.out.println(i);

    }

    public static void main(String[] args) {

        Count_NonStaticVariable c1 = new Count_NonStaticVariable(); // memory is allocated when a object is created
        Count_NonStaticVariable c2 = new Count_NonStaticVariable(); // again a memory is allocated when object is created
        Count_NonStaticVariable c3 = new Count_NonStaticVariable(); // again a memory is allocated when object is created
    }

}
