package com.volvo.java.StringPrograms;

public class CharacterClassPG {

	public static void main(String[] args) {

		String s = "*1234ASDFAS#_%-#$";
		
		String result1 = "", result2 = "", result3 = "";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				result1 += ch;
			}

			else if (Character.isDigit(ch)) {
				result2 += ch;
			}

			else {
				result3 += ch;
			}
		}
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
}
