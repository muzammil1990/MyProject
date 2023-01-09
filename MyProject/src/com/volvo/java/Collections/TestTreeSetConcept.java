package com.volvo.java.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class TestTreeSetConcept {

    public static void main(String[] args) {

        TreeSet t = new TreeSet<>();

        t.add(50);
        t.add(40);
        t.add(100);
        t.add(70);
//        t.add("Hero");  //class cast exception
//        t.add(null);  //null pointer exception

        // System.out.println(h);

        /*
         * for (Object o : t) { output: By default print the value in ascending order 
         * System.out.println(o); }
         */

        Iterator i = t.iterator();

        while (i.hasNext()) {
            System.out.print(i.next()+ "  ");
        }

        System.out.println();
        
        Iterator i1 = t.descendingIterator();
        
        while(i1.hasNext()){
            System.out.print(i1.next()+ "  ");
        }

    }

}
