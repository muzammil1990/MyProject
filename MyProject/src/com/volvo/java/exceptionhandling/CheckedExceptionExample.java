package com.volvo.java.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
    
    //non static method
    public void readFile() throws FileNotFoundException{
        File file = new File("c:\\test.text");
        FileInputStream fis = new FileInputStream(file);
    }
    
    public static void main(String[] args)  {
        
        try{
            CheckedExceptionExample c = new CheckedExceptionExample();
            c.readFile();
        }
        catch(Exception e){
//            System.out.println(e);
            e.printStackTrace();
        }
        
    }

}
