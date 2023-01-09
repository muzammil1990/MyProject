package com.volvo.java.NumberProgram;

public class PalindromeNo {

    public boolean isPalindrome(int x) {
    	
//    edge case= 0334330	
    	
        int temp = x;
        boolean val = true;
        boolean tval = false;
        int remainder = 0, reverse = 0;

        x = Math.abs(x);

        while (x != 0) {
            remainder = x % 10;
            x = x / 10;
            reverse = reverse * 10 + remainder;
        }

        if (reverse == temp) {
            tval = val;
        }

        return tval;
    }

    public static void main(String[] args) {

        PalindromeNo p = new PalindromeNo();
        boolean val = p.isPalindrome(121);
        System.out.println(val);
    }

}
