package com.volvo.java.Constructor;

//Read basics of constr in javaTpoint
//java pg for printing default values using default constructor
public class DefaultConstructor_DefaultValues {

    int id;
    String name;
    char c;
    boolean b;
    /*
     * - if we do not write constructor explicitly , jit compiler by default writes/calls the default constructor - 
     * default construtor initializes the non static variables or contruct values of the non static variable when object is created
     */

    /* printing default values of non static variable */
    void display() {
        System.out.println(id + "\n" + name + "\n" + c + "\n" + b);
    }

    public static void main(String[] args) {
        DefaultConstructor_DefaultValues df = new DefaultConstructor_DefaultValues();  //implicitly calls the default constr.
        df.display();

    }
}
