package com.volvo.java.oopsInheritance;

public class Programmer extends Employee {

    int bonus = 20000;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Programmer p = new Programmer();
        
        System.out.println("employee salary:" + p.salary);  // super class property
        System.out.println("Bonus is " + p.bonus);   // sub class
    }

}
