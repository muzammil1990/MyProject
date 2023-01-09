package com.volvo.java.StringMethods;


//program to do string compare using ' == ' which checks references not values

 class StringObject_Equals_Ex2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s1="Muzammil";  //Created String obj in String constant pool
        String s2="Muzammil";  //Created String obj in String constant pool
        String s3= new String("Muzammil");//Created String obj in String const. pool and non pool area(NHM)
        System.out.println(s1==s2);
        System.out.println(s1==s3); //The = = operator compares references not values.
    }

}
