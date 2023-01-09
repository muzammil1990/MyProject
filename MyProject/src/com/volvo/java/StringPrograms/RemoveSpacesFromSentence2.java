package com.volvo.java.StringPrograms;

public class RemoveSpacesFromSentence2 {
	public static void main(String[] args) {
		String s1 = "Java is essential for learning Selenium";

		String[] s2 = s1.split(" ");    //  s1.split("\\s");
		String s3 = "";

		for (int i = 0; i < s2.length; i++) {
			s3 = s3 + s2[i];
		}
		System.out.println(s3);

		
		
		// another way to remove space
		String s4 = "My name is Khan. My name is Bob. My name is Sonoo.";
		s4 = s4.replaceAll("\\s", "");
		System.out.println(s4);
	}
}
