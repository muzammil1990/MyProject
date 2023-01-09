package com.volvo.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

    public static void main(String[] args) {

      //public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        ArrayList al = new ArrayList<>();

        al.add("Ravi");
        al.add(12);
        al.add(23.4f);
        al.add('c');
        al.add(null);

        // print the size of arraylist class(no of elements present)
        System.out.println("size of the array list class " + al.size());
        System.out.println(al);

        al.add(5, 12);
        // inserting at last(specific) position.

        System.out.println("size of the array list class " + al.size());

        // printing the list
        for (Object o : al) {
            System.out.print(o + "  ");
        }

        System.out.println();

        al.set(1, 100); // Replaces the element at the specified position in this list with the specified element.

        for (Object o : al) {
            System.out.println(o);
        }

        // traversing through elements in arraylist using iterator method
        /*
         * Iterator itr = al.iterator();
         * 
         * while (itr.hasNext()) { System.out.println(itr.next()); }
         */

    } // end main()
}
// LIST PROPERTIES:(ArrayList class implements List interface so all properties of list can be accessed by arraylist class)
/*
 * 1. It is index based.
 *  2. It can store duplicate items. 
 *  3. Null is also allowed 
 *  4. Insertion order remains same in list
 *  5. To retrieve the data from the list:- get().
 * 6. Not synchronised
 * 7.In Java ArrayList class, manipulation in between the memory block is slow because a lot of shifting needs to occur if
 * any element is removed or added from the array list.
 * 
 */
