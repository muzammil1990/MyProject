package com.volvo.java.Collections;

import java.util.HashSet;
import java.util.Iterator;

// pg to see HashSet does not allow duplicate elements
class HashSetClassEx2 {

    public static void main(String[] args) {

        HashSet h = new HashSet<>();
        h.add("Sagar");
        h.add("Ravi");
        h.add(null);
        h.add("Sagar"); // duplicate
        h.add("Muzammil");
        h.add(null); // one null value is allowed and duplicate is also not allowed
        /*
         * for(Object s: h)
         * { 
         *   System.out.println(s); 
         * }
         */
        
        System.out.println("size of the HashSet Class " + h.size());
        
        Iterator i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
