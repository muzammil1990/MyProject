package com.volvo.java;

class Student {

    int i; 
    String name;
    boolean f;
    

    public static void main(String[] args) {
        
     // at the time of object creation, default values of i, name and f are initialised
        Student s = new Student(); // since no constructor, default constructor is being called.
        System.out.println(s.i);
        System.out.println(s.name);
        System.out.println(s.f);
    }
}
