package com.volvo.java.Collections;

public class ConversionInJava {

	public static void main(String[] args) {
		
//		STRING TO INT
		
	/*convert String to an int in java using Integer.parseInt() method. 
	 
	To convert String into Integer, we can use Integer.valueOf() method which returns instance of Integer class.
	*/
	
		String str= "400";
		
		System.out.println(str+100);
		int i=Integer.parseInt(str);
		System.out.println(i+100);
		
		
		System.out.println();
		
		Integer b=Integer.valueOf(str);
		System.out.println(b);
		
		System.out.println();
		
// INT TO STRING
		
		//String.valueOf()
		
		int a=200;
		String s1=String.valueOf(a);
		System.out.println(s1+100); 
		
	}
}
