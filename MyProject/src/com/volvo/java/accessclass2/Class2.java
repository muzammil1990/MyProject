package com.volvo.java.accessclass2;

import com.volvo.java.accessclass1.Class3;

class Class2 {

    public static void main(String[] args) {
        Class3 c3= new Class3();
        c3.add();
        System.out.println(c3.i);
        System.out.println(Class3.j);
        Class3.sub();
        
    }
 }
