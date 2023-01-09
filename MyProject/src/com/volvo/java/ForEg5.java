package com.volvo.java;

public class ForEg5 {

    public static void main(String[] args) {
        int j,i;
        for (j = 1; j <= 3; ++j) {
            
            for ( i = 1; i <= 5; ++i) {
               
                    System.out.print(i); 
                    
            } 
            //System.out.println(i);
            i-=3; //i=i-3;
            System.out.print(" "+j*i+" ");
            
        }

    }

}
