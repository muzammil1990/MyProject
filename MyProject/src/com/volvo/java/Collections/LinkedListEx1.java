package com.volvo.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedList l1 = new LinkedList<>();

        l1.add("ravi");
        l1.add("hero");
        l1.add("ravi");
        l1.add(10);
        l1.add(12.4f);
        
        List l2 = new ArrayList();
        l2.addAll(l1);
        l2.addAll(4,l1);
        //System.out.println(l2);
        
        for(Object o:l2){
            System.out.println(o);
        }

        // getting iterator to traverse through the elements

//        Iterator itr = l1.iterator();
//
//        while (itr.hasNext()) {
//
//            System.out.println(itr.next());
//        }
    }
}
/* 1. It can store duplicate items.
2. Insertion order remains same in list
3. Not synchronised
4. In LinkedList, the manipulation is fast because no shifting is required.
          or 
   Insertion or removal are faster in linkedlist in between.
*/