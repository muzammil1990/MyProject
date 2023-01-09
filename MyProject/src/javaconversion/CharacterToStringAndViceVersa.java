package javaconversion;

public class CharacterToStringAndViceVersa {

	public static void main(String[] args) {

		// CHARACTER TO STRING
		char ch = 'o';

		String str = Character.toString(ch);
		System.out.println(str);

		// STRING TO CHARACTER

		String st = "hello";

		char[] chars = st.toCharArray();
		for (char c : chars) {
			System.out.print(c + " ");
		}
		
	/*	char[] dest = null;
		
		st.getChars(0, st.length()-1, dest, 0);
		
		for(char c: dest) {
			System.out.println(c);
		}*/
	}
}
