package com.volvo.java.StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

class Test {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };
		int[] brr = { 40, 50, 60 };

		int[] crr = new int[arr.length + brr.length];
		int k = 0;

		for (int i : arr) {
			crr[k++] = i;

		}

		for (int i : brr) {
			crr[k++] = i;
		}

		System.out.println(Arrays.toString(crr));
	}

}
