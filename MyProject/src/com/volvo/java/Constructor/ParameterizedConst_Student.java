package com.volvo.java.Constructor;

// java pg for parameterized constructor
public class ParameterizedConst_Student {

    int id;
    String name;

    /* parameterized constructor taking two input from the user - explicit constructor */
    ParameterizedConst_Student(int i, String n) {
        id = i;  //local variable name and instance variable name is different so no ambiguity
        name = n;
    }

    void display() {
        System.out.println("id is: " + id + "\n" + "Student Name: " + name + "\n");
    }
    
    
    public static void main(String[] args) {
        													                   //it constructs the values at the time of object creation.
      //a memory is allocated in RAM for the object & constr is being called. Constr creates/initializes values for non static variable
        ParameterizedConst_Student s1= new ParameterizedConst_Student(220,"Basanti"); 


     //again a new memory is allocated for the object since non static variable.
        ParameterizedConst_Student s2= new ParameterizedConst_Student(22, "Bas");
        s1.display();
        s2.display();
    }
    
}
