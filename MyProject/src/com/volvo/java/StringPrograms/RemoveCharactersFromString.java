package com.volvo.java.StringPrograms;

// pg to remove characters from the first String which are present in the second String

public class RemoveCharactersFromString {

	public static void main(String[] args) {

		String str = "India is great";
		String secondStr="in";  
		
//		o/p should be = da s great
		
		str = str.toLowerCase();
		
		String empStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'i' && str.charAt(i) != 'n') {  // str.charAt(i) == 'g'   ; comparing two characters
																// entry.getKey().equals('a')  //here getKey= Character
																// if ( ch >= 'A'  &&  ch <= 'Z'  )
				empStr += str.charAt(i);  //anything you add with string becomes string

			}
		}

		System.out.print(empStr);
	}

}
