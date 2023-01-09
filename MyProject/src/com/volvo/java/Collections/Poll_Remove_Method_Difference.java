package com.volvo.java.Collections;

import java.util.PriorityQueue;

import java.util.Queue;

import com.volvo.java.SysoExample1;

//Pg to see the difference between poll and remove method of Queues
class Poll_Remove_Method_Difference {

    public static void main(String[] args) {

        Queue q = new PriorityQueue<>();

        q.add(10);

        
//        System.out.println(q.poll());
//        System.out.println(q.poll()); //when poll printed 2 times returns null
       
        System.out.println(q.remove());
        System.out.println(q.remove()); // when remove printed 2 times returns nosuchelement exception
        

    }
}
