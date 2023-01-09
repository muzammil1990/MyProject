package com.volvo.java.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*priorityqueue class declaration: public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable */
class PriorityQueueEx1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * priority queue must have homogenous data i.e same type of data. eg: only string data, or only integer data but not both.
         */

        /* Throws ClassCastException if different type of data(datatypes) are added. */

        Queue q = new PriorityQueue<>(); // upcasting, inheritance is must, but queue extends collection
        
         
        q.add(34); 
//        q.add("hero"); //ClassCastException
        q.add(34); 
        q.add(94);
        q.add(78); 
        q.add(12);
        q.add(34);  //duplicates allowed
       // q.add(null);  // can add null value, no CTE, but throws null pointer exception during runtime
   

        // retrieve data/ print data
//        System.out.println(q);

       
        // second way to retrieve/print the data in queue
       /* for (Object temp : q) {
            System.out.println(temp);  //output: will not be in sorted order
        }*/

        
        // third way to retrieve/print the data in queue
        Iterator itr = q.iterator();      
        while (itr.hasNext()) {
            System.out.println(itr.next());      //output: will not be in sorted order
        }
        
        System.out.println("\n");

        while(q.peek()!=null) {
            System.out.print( q.poll()+ " ");
        }
    }

}
