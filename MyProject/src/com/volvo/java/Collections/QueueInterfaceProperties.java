package com.volvo.java.Collections;

import java.util.Collection;

public class QueueInterfaceProperties {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
   
        
        
        
     /*   Queue Interface declaration:-   public interface Queue extends Collection<E>
       
        Methods of Queue Interface
        
      boolean add(object): It is used to insert the specified element into this queue 
                        and return true upon success.
   
      Object remove(): It is used to retrieves/print the head element of the queue
                  and then removes the head element of this queue.

      Object poll(): It is used to retrieves/print the head element of the queue
                 and then removes the head element
                 or returns null if this queue is empty.
                 poll()= remove() 
                 
      Object element(): It is used to retrieves/print the head element of the queue,
                        but does not remove the head element  
      
      Object peek(): It is used to retrieves/print the head element of the queue,
                     but does not remove the head element,
                     or returns null if this queue is empty. 
                     peek()= element()
                 */
         
        
    /*1. Not index based
      2. Duplicates allowed
      3. Null value is not allowed in the queue; can add null value but no compile time error; runtime error- null pointer exception
      
      4. Insertion order depends on implementing class(if priority queue class= sorted, if linkedList= order remains same or order is preserve)
                   exception: only using poll n peek  gives sorted result. Advance for loop ; iterator will not give sorted result;
                   
      5. To retrieve the data or print the data in queue: we have poll and peek
        */
    }

}
