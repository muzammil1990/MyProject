package com.volvo.java.ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsUsingSet {

    public static void main(String[] args) {

        int[] givenArray = { 10, 20, 22, 25, 24, 20, 100, 24, 110, 100, 125 };

        Set<Integer> set1 = new HashSet<Integer>(); // set does not allow to add duplicate elements. so whichever element can not be
        // added in set- will be duplicate elements
        
        for (int i : givenArray) {
        	
            if (!set1.add(i)) { // element = i ; which can not be added in the set; called duplicate element;
                System.out.println("Duplicate element is: " + i);
            }
        }

    }

}
