package javaconversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysToListAndViceVersa {

	public static <T> void main(String[] args) {
		// array to  list

		// 1. Brute force or naive method

		int[] arr = { 1, 2, 3, 4 };

		// Create an empty List
		List<Integer> lst = new ArrayList<Integer>();

		for (int temp : arr) {
			lst.add(temp);
		}

		System.out.println(lst);

		// 2. Use asList() method
		String array[] = { "Geeks", "forGeeks", "A computer Portal" };
		
		List<String> lst2 = Arrays.asList(array);
		System.out.println(lst2);
		
		//CONVERT LIST TO ARRAY,  SET TO ARRAY,  COLLECTION TO ARRAY - ALL SAME WAY

		List<String> names = new LinkedList<String>();  
        // use add() method of the list to add elements in the linked list  
        names.add("Paul");  
        names.add("Donal");  
        names.add("James");  
        names.add("Robert");  
        names.add("Mery"); 
        
      Object[] nameList=  names.toArray();  //converts collection into array.
      for(Object i:nameList) {
    	  System.out.println(i);
      }
      
//      other way to convert List to array
      String[] myArray = new String[names.size()];
      names.toArray(myArray);
      
	}
}
