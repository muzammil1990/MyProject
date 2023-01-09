package com.volvo.java.AccessModifier2;

//import com.volvo.java.AccessModifier1.AccessModifier1;

// To access public components in different class of different package, we need to import the class

public class AccessModifier3 {
    
    public static void main(String[] args) {
        
        AccessModifier1 a1 = new AccessModifier1("Selenium");
        System.out.println(AccessModifier1.a);
        AccessModifier1.run();
    }

}
