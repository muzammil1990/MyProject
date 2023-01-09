package com.volvo.oopsTypecasting;

class Car {

   
    void run() {
        System.out.println("running-super class");
    }

}

class suzuki extends Car {
    

    void run() {
        System.out.println("inside sub class- run method");
    }
}

public class Practice {

    public static void main(String[] args) {

        Car c = new suzuki();
        c.run();
           
    }
}