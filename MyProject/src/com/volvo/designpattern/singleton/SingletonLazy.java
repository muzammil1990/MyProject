package com.volvo.designpattern.singleton;

/*
Rules:
To create the singleton class, we must have 3 things
1. Static data member(Variable): It gets memory only once because of static, it contains the object of the Singleton class.
2. Private constructor: It will prevent the creation of object of the Singleton class from outside the class.
3. Static factory method: This gives the global access to the Singleton object and returns the instance to the caller.
*/

//Lazy instantiation
 class SingletonLazy1 {

    private static SingletonLazy1 obj;

    private SingletonLazy1() {

    }

    public static SingletonLazy1 getInstance() {
        if (obj == null) // no curly bracket required for if condition since only one statement is present under if
            obj = new SingletonLazy1();

        return obj;
    }
}

//note: It is still not achieved 100% singleton pattern bcoz it is not thread safe (Synchronization).

/*Thread Safe: when multiple threads are runnning and if two threads are accessing the same method 
             then one thread has to wait until the first thread uses the method completely.*/

//in above code, we have declared getInstance() to static so that we can call it without creating the object of a class.
//The first time getInstance() is called it creates a new singleton object and after that it just returns the same object
//Note that Singleton obj is not created until we need it and call getInstance() method. This is called lazy instantiation.
 
 
 //correct code= Thread safe, Lazy instantiation
 public class SingletonLazy {

     private static SingletonLazy obj;

     private SingletonLazy() {

     }

     public static synchronized SingletonLazy getInstance() {
         if (obj == null) // no curly bracket required for if condition since only one statement is present under if
             obj = new SingletonLazy();

         return obj;
     }
 } 
 
// Note: Here using synchronized makes sure that only one thread at a time can execute getInstance(). 