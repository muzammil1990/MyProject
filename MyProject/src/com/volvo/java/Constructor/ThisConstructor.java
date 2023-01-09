package com.volvo.java.Constructor;

//note: Calling default constructor from parameterized constructor:
//pg to show call to this. this()

public class ThisConstructor {

    /*
     * The this() constructor can be used to invoke/summon the current class constructor.
     *  It is used to reuse the constructor. In other words, it is used for constructor chaining.
     */

    // 2nd def: Calling a constr from another constr of the same class = call to this [ this() ]

    public ThisConstructor() { // no argument constr = default constr

        System.out.println("hello inside default this constructor");
    }

    ThisConstructor(int num) { // parameterised constr

        this(); // call to this should be the first statement or else compile time error.
        System.out.println(num);

    }
}

// note: Calling default constructor from parameterized constructor: