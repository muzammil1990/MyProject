package com.volvo.java.StringPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
    HashMap Vs. ConcurrentHashMap Vs. SynchronizedMap – How a HashMap can be Synchronized in Java
    Last Updated on August 3rd, 2018 by   App Shah   40 comments


    Crunchify ConcurrentHashMap Vs. SynchronizedMap ExampleHashMap is a very powerful data structure in Java. We use it everyday and almost in all applications. There are quite a few examples which I have written before on How to Implement Threadsafe cache, How to convert Hashmap to Arraylist?

    We used Hashmap in both above examples but those are pretty simple use cases of Hashmap. HashMap is a non-synchronized collection class.

    - Do you have any of below questions?
    - What’s the difference between ConcurrentHashMap and Collections.synchronizedMap(Map)?
    - What’s the difference between ConcurrentHashMap and Collections.synchronizedMap(Map) in term of performance?
    - ConcurrentHashMap vs Collections.synchronizedMap()
    - Popular HashMap and ConcurrentHashMap interview questions
    
    In this tutorial we will go over all above queries and reason why and how we could Synchronize Hashmap?

    Why?
    
    The Map object is an associative containers that store elements, formed by a combination of a uniquely identify key and a mapped value. If you have very highly concurrent application in which you may want to modify or read key value in different threads then it’s ideal to use Concurrent Hashmap. Best example is Producer Consumer which handles concurrent read/write.
    So what does the thread-safe Map means? If multiple threads access a hash map concurrently, and at least one of the threads modifies the map structurally, it must be synchronized externally to avoid an inconsistent view of the contents.

    How?
    
    There are two ways we could synchronized HashMap
    1.Java Collections synchronizedMap() method
    2. Use ConcurrentHashMap
    //Hashtable
    Map<String, String> normalMap = new Hashtable<String, String>();
     
    //synchronizedMap
    synchronizedHashMap = Collections.synchronizedMap(new HashMap<String, String>());
     
    //ConcurrentHashMap
    concurrentHashMap = new ConcurrentHashMap<String, String>();
    
 
    ConcurrentHashMap
    =================
   - You should use ConcurrentHashMap when you need very high concurrency in your project.
   - It is thread safe without synchronizing the whole map.
   - Reads can happen very fast while write is done with a lock.
   - There is no locking at the object level.
   - The locking is at a much finer granularity at a hashmap bucket level.
   - ConcurrentHashMap doesn’t throw a ConcurrentModificationException if one thread tries to modify it while another is iterating over it.
                                       ===============================                                        
   - ConcurrentHashMap uses multitude of locks.
   
    SynchronizedHashMap
    ====================
   - Synchronization at Object level.
   - Every read/write operation needs to acquire lock.
   - Locking the entire collection is a performance overhead.
   - This essentially gives access to only one thread to the entire map & blocks all the other threads.
   - It may cause contention.
   - SynchronizedHashMap returns Iterator, which fails-fast on concurrent modification.
   
    */



public class CrunchifyConcurrentHashMapVsSynchronizedMap {

    public final static int THREAD_POOL_SIZE = 5;

    public static Map<String, Integer> crunchifyHashTableObject = null;
    public static Map<String, Integer> crunchifySynchronizedMapObject = null;
    public static Map<String, Integer> crunchifyConcurrentHashMapObject = null;

    public static void main(String[] args) throws InterruptedException {

        // Test with Hashtable Object
        crunchifyHashTableObject = new Hashtable<String, Integer>();

        // Test with synchronizedMap Object
        crunchifySynchronizedMapObject = Collections.synchronizedMap(new HashMap<String, Integer>());

        // Test with ConcurrentHashMap Object
        crunchifyConcurrentHashMapObject = new ConcurrentHashMap<String, Integer>();

    }

    
}