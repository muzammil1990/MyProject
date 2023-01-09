package com.volvo.jave.Construtorchaining;

//in continuation of example1.java

class Exam2 {

    String color;

    {
        System.out.println(1);
    }
}

class Exam3 extends Exam2 {

}

public class ConstructorExample2 {

    public static void main(String[] args) {
        Exam3 e3 = new Exam3();

    }

}
