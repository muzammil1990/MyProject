package com.volvo.java.ArrayPrograms;

import java.util.Arrays;

public class FindSecondHighestElement {

    public static void main(String[] args) {
        int a[] = { 100, 14 , 46 , 47, 94 ,94 ,52 ,86 ,36 ,94 , 89 };

        // using built in methods
        
       /*  Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
         
//         or
 *       secondHighest= a[a.length-2];
         System.out.println(secondHighest);
         */
//----------------------------------------------------------------------------------
        
        
        // without using built in
            int temp = 0;

            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {

                    if (a[j] < a[i]) {   // swaping logic ; if second element is smaller than first element than swap
                        temp = a[i];     
                        a[i] = a[j];    
                        a[j] = temp;     

                    }
                }
            }
            System.out.println(Arrays.toString(a));
            System.out.println(a[a.length-3]); //second highest element
        }
}
