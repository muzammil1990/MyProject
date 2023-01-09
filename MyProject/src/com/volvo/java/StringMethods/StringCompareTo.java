package com.volvo.java.StringMethods;

public class StringCompareTo {

	public static void main(String[] args) {
		
		String s1="hello";  //Each character   // 96+25= 122
		String s2= new String("Hello");    //Each character  // 65+25=90
		
		System.out.println(s1.compareTo(s2));   // compareToIgnoreCase(str)= compares two strings ignoring the case differences
		
		//Each character of both the strings is converted into a Unicode value for comparison.
		
//		ASCII has its equivalent in Unicode. The difference between ASCII and Unicode 
//		is that ASCII represents lowercase letters (a-z), uppercase letters (A-Z),
//		digits (0-9) and symbols such as punctuation marks 
//		while Unicode represents letters of English, Arabic, Greek etc
		
		// int compareTo(String str) :
		
		
//		If the first string is lexicographically greater than the second string, it returns a positive number (difference of character value).
//							alphabetical order, dictionary order
		
//		if s1 > s2, it returns positive number  
//		if s1 < s2, it returns negative number  
//		if s1 == s2, it returns 0
	}
}
