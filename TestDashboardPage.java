package main.java.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestDashboardPage {
	final static Logger logger = Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME + "/meeting/Dashboard.html";

	public static void testDashboard(WebDriver wd) throws InterruptedException, AWTException {
		
       testPositiveCase(wd);
		
	}
	public static void testPositiveCase(WebDriver wd) throws InterruptedException, AWTException {
			
	      	wd.manage().window().maximize();
	      	wd.get(UserURL);
	      	logger.info("Entered Dashboard Page to current Month WorkedUnits process");
	      	wd.findElement(By.id("btnEnter")).click();
	      	Thread.sleep(2000);
        
	      	Robot robot = new Robot();
	      	robot.keyPress(KeyEvent.VK_SPACE);
	      	robot.keyRelease(KeyEvent.VK_SPACE);
	      	logger.info(" Test case No 4 : WorkedUnits for current Month is Processed Successfully");// Test Case - 4 Created Successfully
	      	Thread.sleep(2000);
	      	
	}
     public static void testSalaryTransation(WebDriver wd) throws InterruptedException, AWTException {
    	
    		wd.manage().window().maximize();
            wd.get(UserURL);
            logger.info("Entered Dashboard Page to current Month Salary Transaction");
            wd.findElement(By.id("btnSalaryTransaction")).click();
            Thread.sleep(2000);
            
    		Robot robot = new Robot();
    	    robot.keyPress(KeyEvent.VK_SPACE);
    	    robot.keyRelease(KeyEvent.VK_SPACE);
            logger.info(" Test case No 6 : Successfully Created Salary Transaction  For All Employees ");
            Thread.sleep(2000);
          
    		
           

}
	
}