package main.java.selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseTesting {

	 // Connection object
    static Connection con = null;
    // Statement object
    private static  java.sql.Statement stmt;
    // Constant for Database URL
    public static String DB_URL = "jdbc:mysql://localhost:3306/employee";   
    // Constant for Database UserName
    public static String DB_USER = "root";
    // Constant for Database Password
    public static String DB_PASSWORD = "";

    @Before
    public void setUp() throws Exception {
           try{
                  // Make the database connection
                  String dbClass = "com.mysql.jdbc.Driver";
                  Class.forName(dbClass).newInstance();
                  
                  // Get connection to DB
                  Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                  // Statement object to send the SQL statement to the Database
                  stmt = con.createStatement();
                  }
                  catch (Exception e)
                  {
                        e.printStackTrace();
                  }
    }

    @Test
    public void test() {
           try{
           String query = "select freezeValue()";
           // Get the contents of UserInfo table from DB
           ResultSet res = stmt.executeQuery(query);
           // Print the result until all the records are printed
           // res.next() returns true if there is any next record else returns false
           	
           }
           catch(Exception e)
           {
                  e.printStackTrace();
           }     
    }

    @After
    public void tearDown() throws Exception {
           // Close DB connection
           if (con != null) {
           con.close();
           }
    }
}
