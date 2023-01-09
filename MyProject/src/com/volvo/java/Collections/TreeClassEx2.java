package com.volvo.java.Collections;

import java.util.Iterator;
import java.util.TreeSet;

//pg to traverse element through iterator in decending order
public class TreeClassEx2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TreeSet<String> ts= new TreeSet<String>();
        ts.add("a");
        ts.add("z");
        ts.add("b");
        ts.add("x");
       
        
//        Iterator<String> itr= ts.iterator();
        Iterator<String> itr= ts.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }    
    }

}
