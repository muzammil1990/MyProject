package com.volvo.jave.Construtorchaining;

public class ConstructorChainingRectangle {

    int l;
    int b;
    String colour;  //default value of string = null, boolean = false

    public ConstructorChainingRectangle(int l, int b) {
        this.l = l;
        this.b = b;

    }

    public ConstructorChainingRectangle(int l, int b, String colour) {

        this(l, b);
        this.colour = colour;
    }

    void display() {
        System.out.print(l);
        System.out.print("  " + b + "  ");  // added space for beautiful output display
        if (colour != null) {
            System.out.print("  " + colour + "\n");
        }

        else {
            System.out.println("not a valid color");
        }

    }

    public static void main(String[] args) {
        ConstructorChainingRectangle cr = new ConstructorChainingRectangle(100, 30, null); // one object
        ConstructorChainingRectangle cr1 = new ConstructorChainingRectangle(10, 20, "Yellow");// second object
        cr.display();
        cr1.display();
    }

}
