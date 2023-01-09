package javaconversion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {
		
		
		//CONVERT SET TO ARRAY
		
Set<Object> set= new HashSet<Object>();
		
		set.add("str");
		set.add(22.2f);
		set.add(33.11);
		
		System.out.println(set);
		System.out.println();
		
		Object narr[]= new Object[set.size()];
        
        narr= set.toArray(); //toArray return type is Object[]
        
        System.out.println(Arrays.toString(narr));
	}
}
