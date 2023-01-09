package com.volvo.connectToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // UCHP- DB2 (IBM's db)

        /*
         * dependency to be downloaded= db2jcc
         * 
         * static final String JDBC_DRIVER = "com.ibm.db2.jcc.DB2Driver"; 
         * Class.forName(JDBC_DRIVER);
         * 
         */
        
       /* DriverManager = The basic service for managing a set of JDBC drivers. 
        *                 The DriverManager class methods (getConnection) and (getDrivers) have been enhanced to support the Java Standard Edition - (Service Provider) mechanism 
                
                getConnection() = Attempts to establish a connection to the given database URL.
                
                */
        
        
        // MySQL db   //"com.ibm.db2.jcc.DB2Driver"
        Class.forName("com.mysql.jdbc.Driver"); // statement=1   // Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        
        // statement=2               //uchp= DB2,  DB_URL = "jdbc:db2://sd01.it.volvo.com:446/SEVOL0D2D20H00"
        Connection con = DriverManager.getConnection("jdbc:mysql//hostname:port/dbname", "username", "password");
        System.out.println("connect to MySQL DB");

        
        // statement=3
        Statement st = con.createStatement();

        // statement=4
        ResultSet rs = st.executeQuery("select * from tableName");

        while (rs.next()) {
            String firstName = rs.getString("firstnameColumnInDatabase");
            System.out.println("database record is "+ firstName);
            
            String emailAddress = rs.getString("emailColumnInDatabase");
            System.out.println("database record is "+ emailAddress);
        }
    }
}
