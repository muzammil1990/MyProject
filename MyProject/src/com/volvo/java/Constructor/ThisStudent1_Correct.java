package com.volvo.java.Constructor;

public class ThisStudent1_Correct {

    int rollno;  //instance variable, non static variable
    String name;
    float fee;

 /* The this keyword used to refer current class instance variable. 
 If there is ambiguity between the instance variables and parameters(local variables), 
 this keyword resolves the problem of ambiguity.
 */
  public ThisStudent1_Correct(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;  //local variable and instance variable are same, hence ambiguity issue. so used 'this' 
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + "\n" + name + "\n" + fee);
    }
}
