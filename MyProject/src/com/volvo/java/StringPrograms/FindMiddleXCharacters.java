package com.volvo.java.StringPrograms;

public class FindMiddleXCharacters {

   /* public static void findMiddleCharacters(String s, int x) {

        // x = number of middle characters
        // mid = from where the middle characters starts..

        int mid = (s.length() - x) / 2;  //7-2=5; 5/2= 2
        for (int i = mid; i < mid + x; i++) {
            System.out.print(s.charAt(i));
        }
    }*/

    public static void main(String[] args) {
    	String str = "abcdefg";
    	
		int x = 2;   // no of middle char needs to be found.
		int mid = (str.length() - x) / 2;   //7-2=5; 5/2= 2    // mid = from where the middle characters starts..

		for (int i = mid; i < mid + x; i++) {
			System.out.print(str.charAt(i));
		}
    }

}
