package com.volvo.java.Collections;

import java.util.HashSet;

public class HashSetClassEx3 {

    public static void main(String[] args) {

        HashSet hs = new HashSet(); // initial capacity=2 then automatically increases the capacity as elements are added.
        hs.add("Ravi");
        hs.add("Vijay");
        hs.add("Arun");
        hs.add("Sumit");

        System.out.println("Initials list of elements in hs: " + hs);

        // Removing specific element from HashSet
        hs.remove("Ravi");
        System.out.println("After removing from hs:  " + hs);

        System.out.println();

        HashSet<String> hs1 = new HashSet<>(2); // initial capacity=2 then automatically increases the capacity as elements are added.
        hs1.add("Ajay");
        hs1.add("Gaurav");
        hs1.add("Pandit");

        System.out.println("second hashset object hs1 values are: " + hs1);

        hs.addAll(hs1);

        System.out.println("new hs values are: " + hs);

        // Removing all the new elements from HashSet

        hs.removeAll(hs1);
        System.out.println("After removing all the new elements i.e. second hashset from the list " + hs);

        // Removing elements on the basis of specified condition
        
        if (hs.contains("Arun")) {
            hs.remove("Arun");
        }
        
        System.out.println(hs);
        
       

    }
    
    public static boolean getValue() {
        return true;
    }

}
