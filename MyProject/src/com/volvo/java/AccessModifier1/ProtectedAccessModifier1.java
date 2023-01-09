package com.volvo.java.AccessModifier1;

public class ProtectedAccessModifier1 {

    protected static int a = 10;

    protected String s1;

    protected ProtectedAccessModifier1(String s1) {
        this.s1 = s1;
        System.out.println(s1);

    }

    protected static void run() {
        System.out.println("In run method");
    }
    
    public static void main(String[] args) {
        
        ProtectedAccessModifier1 p1= new ProtectedAccessModifier1("Java");
        System.out.println(a);
        run();
    }

}
