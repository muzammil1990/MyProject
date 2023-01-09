package com.volvo.java.Java8_Features;

interface Sayable {
    
    // Default method
    default void say() {
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void sayMore(String msg);
}

public class Java8_DefaultMethod {

}
