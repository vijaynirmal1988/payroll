package main.java.selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


public class TestLoginPage {

	final static Logger logger = Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME + "/meeting/login.html";

	public static void testLogin(WebDriver wd) throws InterruptedException {
		testPositiveCase(wd);
		//testWrongUserName(wd);
	   // testWrongPassword(wd);
		//testWrongUserName1(wd);
	  //  testEmptylogin(wd);
		

	}

	// test case no:1.1--
	public static void testPositiveCase(WebDriver wd) throws InterruptedException {
		// Dimension n = new Dimension(500,900);  
		// wd.manage().window().setSize(n);
		 wd.manage().window().maximize();
		 Thread.sleep(5000);	
		 wd.manage().window().maximize();
         wd.get(UserURL);
         logger.info("Entered Login Page");
		 wd.findElement(By.id("inputEmail")).sendKeys("mahesh@gmail.com");
		 logger.info("Email entered:mahesh@gmail.com");
		 wd.findElement(By.id("inputPassword")).sendKeys("mahesh123");
		 logger.info("Password entered:mahesh123");
		 wd.findElement(By.id("butlogin")).click();
		 logger.info("loginPage Test case No :1 Login Sucessfully");// Login Successfully
		 logger.info("Test case No 1.1 :Tested Positive Case Successfully"); // Test case No 1.1 : Created Successfully
		 Thread.sleep(5000);	
	}
	// test case no:1.2--
	public static void testWrongUserName(WebDriver wd) throws InterruptedException {
		
		wd.manage().window().maximize();
        wd.get(UserURL);
	    wd.findElement(By.id("inputEmail")).sendKeys("mahe@gmail.com");
		logger.info("Email entered:mahe@gmail.com");
		wd.findElement(By.id("inputPassword")).sendKeys("mahesh123");
		logger.info("Password entered:mahesh123");
		wd.findElement(By.id("butlogin")).click();
		logger.info("Login Failed:Wrong Username or Wrong Password");
		logger.info("Test case No 1.2 :Tested WrongUserName Successfully"); // Test case No 1.2 : Created Successfully
		Thread.sleep(5000);
	
	}

	
	// test case no:1.3--
	public static void testWrongPassword(WebDriver wd) throws InterruptedException {
		wd.manage().window().maximize();
        wd.get(UserURL);
		wd.findElement(By.id("inputEmail")).sendKeys("mahesh@gmail.com");
		logger.info("Email entered:mahesh@gmail.com");
		wd.findElement(By.id("inputPassword")).sendKeys("mahesh1234");
		logger.info("Password entered:mahesh1234");
		wd.findElement(By.id("butlogin")).click();
		logger.info("login Failed:Wrong Username or Wrong Password");
		logger.info("Test case No 1.3 :Tested WrongPassword Successfully"); // Test case No 1.3 : Created Successfully
		Thread.sleep(5000);
		
	}
	// test case no:1.4--
	public static void testWrongUserName1(WebDriver wd) throws InterruptedException {
		wd.manage().window().maximize();
        wd.get(UserURL);
		wd.findElement(By.id("inputEmail")).sendKeys("mahe@gmail.com");
		logger.info("Email entered:mahe@gmail.com");
		wd.findElement(By.id("inputPassword")).sendKeys("mahesh1234");
		logger.info("Email entered:mahesh1234");
		wd.findElement(By.id("butlogin")).click();
		logger.info("login Failed:Wrong Username or Wrong Password");  // Test case No 1.4 : Created Successfully
		logger.info("Test case No 1.3 :Tested WrongUserName1 Successfully");
		Thread.sleep(5000);
		
	}
	// test case no:1.5--
	public static void testEmptylogin(WebDriver wd) throws InterruptedException {
		wd.manage().window().maximize();
        wd.get(UserURL);
		wd.findElement(By.id("inputEmail")).sendKeys("");
		logger.info("Email entered:blank space");
		wd.findElement(By.id("inputPassword")).sendKeys("");
		logger.info("Email entered:blank space");
		wd.findElement(By.id("butlogin")).click();
		logger.info("login Failed:Username,Password blank text field"); // Test case No 1.5 : Created Successfully
		logger.info("Test case No 1.4 :Tested Emptylogin Successfully");
		Thread.sleep(5000);
	}

	

}
