/**
 * 
 */
package com.volvo.java.oopsInheritance;

/**
 * This pg is to show hierarchial level inheritance
 */

class A1 {

    void a() {
        System.out.println("method a");
    }
}

class B1 extends A1 {

    void b() {
        System.out.println("method b");
    }
}

class C1 extends A1 {
    void c() {
        System.out.println("method c");
    }
}

public class HierarchialInheritance {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        B1 b1 = new B1();

        C1 c1 = new C1();

        c1.a();
        c1.c();
        b1.a();
        b1.b();

    }

}
