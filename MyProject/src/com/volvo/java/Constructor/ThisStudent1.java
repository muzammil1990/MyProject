package com.volvo.java.Constructor;

public class ThisStudent1 {

    int rollno;    //instance variable, non static variable
    String name;
    float fee;

    ThisStudent1(int rollno, String name, float fee) {
        rollno = rollno;
        name = name;  //local variable and instance variable are same, hence ambiguity issue
        fee = fee;
    }

    void display() {
        System.out.println(rollno + "\n" + name + "\n" + fee);
    }
}
