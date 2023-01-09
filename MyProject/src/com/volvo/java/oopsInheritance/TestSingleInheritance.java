package com.volvo.java.oopsInheritance;

//pg to show single inheritance
class Animal {

    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("barking");
    }
}

public class TestSingleInheritance  {
    
    void test(){
        System.out.println("hi");
    }
    
    public static void main(String[] args) {
//        TestSingleInheritance t= new TestSingleInheritance();
        
        Dog d = new Dog();
        d.bark(); // child class method
        d.eat(); // parent/ super class method
       
    }

}
