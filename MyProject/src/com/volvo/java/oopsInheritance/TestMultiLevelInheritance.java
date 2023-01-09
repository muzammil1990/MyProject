package com.volvo.java.oopsInheritance;

class A {

    void a() {
        System.out.println("method a");
    }
}

class B extends A {

    void b() {
        System.out.println("method b");
    }
}

class C extends B {

    void c() {
        System.out.println("method c");
    }
}

public class TestMultiLevelInheritance {

    public static void main(String[] args) {
        C obj = new C();

        obj.c();

        obj.b();

        obj.a();

        B b= new B();
        
        b.b();
        b.a();
        
     //   b.c(); obj of b class can not access c class property
    }
}
