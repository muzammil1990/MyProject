package com.volvo.java.NumberProgram;

//interview question: 

/*
 * Create a simple class, with at least one attribute and one method.
E.g - Car class, attribute: color, method: make_noise - that just displays some noise, like 'brrrr' / 'vrrr-um' or other, at your choice.
Create an object of the above class and configure the attribute when the object is instantiated.
Display the attribute.
Call the object method.
Create a derived class: e.g. DaciaCar.
Change the make noise in the derived class to display: 'DaciaCar' noise (whatever the noise sound was chosen for the base class."

*/


 class Car {

    String color;

    Car(String color) {
        this.color = color;
        System.out.println(color);
    }

    public void make_noise() {
        System.out.println("brrrr");
    }

}

 public class DaciaCar extends Car {

    DaciaCar(String color) {
        super(color);
        // TODO Auto-generated constructor stub
    }

    public void make_noise() {
        System.out.println("vrrr-um");
    }

    public static void main(String args[]) {

        DaciaCar dc = new DaciaCar("Green");

        dc.make_noise();
    }

}