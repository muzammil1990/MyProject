/**
 * 
 */
package com.volvo.java.readwritepropertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

/**
 * this pg is to read data from property file
 */
public class ReadPropertyFile {

    String data;

    public String readPropertyFileData(String filepath, String key) throws IOException {

        File f = new File(filepath); //to access file from its location
        FileInputStream fis = new FileInputStream(f); //converts the file into image format, can read audio , video ,text files
        Properties p = new Properties(); // read the file from img src in key n value format
        p.load(fis);
        data = p.get(key).toString();
        return data;

    }

    @Test
    public void runMethod() throws IOException {
        ReadPropertyFile rpg = new ReadPropertyFile();
        String storedata = rpg.readPropertyFileData("C:\\MyWorkspace\\MyProject\\src\\com\\volvo\\java\\readwritepropertyfile\\config.properties", "url");
        System.out.println(storedata);
    }

}
