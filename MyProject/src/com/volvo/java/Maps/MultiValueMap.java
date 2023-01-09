package com.volvo.java.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class MultiValueMap {

	public static void main(String[] args) {

		HashMap<Integer, ArrayList<Object>> hm = new HashMap<Integer, ArrayList<Object>>();

		hm.put(15, new ArrayList<Object>());
		System.out.println(hm);
		hm.get(15).add("Muzammil");
		
		System.out.println(hm.get(15));
		
		hm.get(15).add(26.5);
		hm.get(15).add(30);

		System.out.println(hm);

	/*	LinkedHashMap<Integer, LinkedList<Object>> multiple = new LinkedHashMap<Integer, LinkedList<Object>>();

		multi.put(15, new LinkedList<Object>());

		System.out.println(multiple);
		multi.get(15).add("Muzammil_hero");
		System.out.println(multiple);*/

	}
}
