package com.volvo.java.Collections;

import java.util.HashSet;
import java.util.Iterator;
// HashSet= Random Order
// pg to notice element iterates in unordered Collection or insertion order is not preserved in HashSet Class.
class HashSetClassEx1 {

    public static void main(String[] args) {

        

        HashSet h = new HashSet<>();
        h.add("one");
        h.add("two");
        h.add("three");
        h.add(null);  
        h.add("four");
        h.add("five");
        
        

//        System.out.println(h);
        
        Iterator itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        /*for(Object s: h){
            System.out.println(s);  //insertion order is not preserved in HashSet Class. (Random order)
        }*/

    }
}
