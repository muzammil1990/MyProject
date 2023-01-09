/**
 * 
 */
package com.volvo.java.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Rule: If we throw a checked exception using throw keyword, it is must to handle the exception using catch block (Generally throw is used only with runtime exception)
 * the method must declare it using throws keyword.
 */
public class Throw_Ex2 {

    /**
     * @param args
     * @throws FileNotFouthrowsndException
     */

//    public static void readFile() {
//        
//        try {
//            File file = new File("C:test.txt");
//            FileInputStream fis = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
       
    
    // or
    
    public static void readFile2() throws FileNotFoundException{
        File file = new File("C:test.txt");
        FileInputStream fis = new FileInputStream(file);
    
        throw new FileNotFoundException();
        
    }  
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try  
        {  
            Throw_Ex2.readFile2();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  

    }

}
