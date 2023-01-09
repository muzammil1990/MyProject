package com.volvo.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

    	int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
    	
    	
    	LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for (int i : arr) {
			lhs.add(i);
		}
		
		System.out.println(lhs);
		
		List<Object> lst= new ArrayList<Object>(lhs);
//		Object[] numList=  lst.toArray();
		
		String[] numList = new String[lst.size()];
		
		int temp = 0;
    	for (int i = 0; i < numList.length; i++) {
			for (int j = i + 1; j < numList.length; j++) {
				if (numList[j] < numList[i]) {
					temp = numList[i];
					numList[i] = numList[j];
					numList[j] = temp;
				}
			}
		}
//
//		System.out.println(brr[brr.length - 3]);
    }
}
