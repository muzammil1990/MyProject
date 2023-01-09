package javaconversion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetToListAndViceVersa {

	public static void main(String[] args) {
			//SET TO LIST
											//collection
//	1. Create a list by passing the set as parameter to the constructor.	
		
		Set<Object> set= new HashSet<Object>();
		
		set.add("str");
		set.add(22.2f);
		set.add(33.11);
		
		System.out.println(set);
		
	    	// this Arraylist constructor accepts collection as parameter. Hence even QUEUE can be passed to convert to LIST
		List<Object> lst= new ArrayList<Object>(set);
		
		System.out.println(lst);
		
		
/* 2. Brute Force or Naive method
 * 
	Get the Set to be converted.
	Create an empty list
	Push each element in the set into the list
*/
Set<Object> set1= new HashSet<Object>();
		
		set1.add("str");
		set1.add(22.2f);
		set1.add(33.11);
		
		List<Object> list= new LinkedList<Object>();
		
		for(Object i : set1) {
			list.add(i);
		}
		
		System.out.println(list);
		
		
//		LIST TO SET
		
		
		
	}
}
