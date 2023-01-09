package com.volvo.java.Constructor;

public class ConstructorOverload_Student {

    int id;
    String name;
    int age;

    // two argument constructor
    /*instance variable will get initialize to its default value first unless replaced
    by parameterized value*/
    ConstructorOverload_Student(int r, String n) {
        id = r;  //local variable name and instance variable name is different so no ambiguity
        name = n;
    }

    // three arugment consrtuctor
    ConstructorOverload_Student(int r, int a, String n) {
        id = r;
        name = n;
        age = a;

    }

    void display() {
        System.out.println("id is: " + id + "\n" + "Name is: " + name + "\n" + "age is: " + age);
    }
    
    public static void main(String[] args) {
        ConstructorOverload_Student s1= new ConstructorOverload_Student(12, "Muzammil");
        ConstructorOverload_Student s2= new ConstructorOverload_Student(15, 17, "Swati");
        s2.display();
        s1.display();
        
    }

}
