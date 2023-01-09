package com.volvo.java.AccessModifier2;

import com.volvo.java.AccessModifier1.ProtectedAccessModifier1;

public class ProtectedAccessModifier3 extends ProtectedAccessModifier1{
    
    public ProtectedAccessModifier3() {
        super("Selenium");
    }
    
    public static void main(String[] args) {
        ProtectedAccessModifier3 a3 = new ProtectedAccessModifier3();
        System.out.println(ProtectedAccessModifier1.a);
        ProtectedAccessModifier1.run();
    }

}
