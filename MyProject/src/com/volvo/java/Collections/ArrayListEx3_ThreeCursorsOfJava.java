package com.volvo.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//pg to show ways of iterating in collection
public class ArrayListEx3_ThreeCursorsOfJava {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List l = new ArrayList();  //upcasting, inheritance must, List interface extends Collection interface

        l.add("Ravi");
        l.add(12);
        l.add(23.4f);
        l.add('c');
        l.add(null);
        l.add(1, null);
        System.out.println("size of the arraylist class " + l.size());

        System.out.println(l);

        // iterating through for each loop (advance loop)
        for (Object o : l) { // object class belongs to java.lang package which need not be imported
            System.out.println(o);
        }

        // iterating through for loop(use of dedicated method - get())
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        // iterating using iterator method 
        // element here is traversed in forward direction only // first cursor of java out of 3 cursors
        Iterator itr = l.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//      element here iterates in reverse order  //second cursor of java out of 3 cursors
        ListIterator lt = l.listIterator(l.size());
        
        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
        
        
        
//      list iterator also works using hasNext() and next()
        ListIterator ll= l.listIterator();
        
        while(ll.hasNext()){
            System.out.println(ll.next());
        }
        
      //third cursor is Enumerator
        
    }

}
