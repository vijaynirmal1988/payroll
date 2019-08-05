package main.java.selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestWorkedUnitsPage {
	
		final static Logger logger = Logger.getLogger(TestLoginPage.class);
		final static String UserURL = TestMain.HOSTNAME + "/meeting/workedunits.html";

		public static void testWorkedUnits(WebDriver wd) throws InterruptedException {
			
	        testPositiveCase(wd);
	    
	        testPositiveCase1(wd);
			
			
		}
		public static void testPositiveCase(WebDriver wd) throws InterruptedException {
		   
			wd.manage().window().maximize();
	        wd.get(UserURL);
	        logger.info("Entered  WorkedUnitsPage Page to test Positive Testcases");
	        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
			dropdown.selectByIndex(22);
			logger.info("Entered Employeedropdown:22");
			Thread.sleep(1000);
			Select dropdown1 = new Select(wd.findElement(By.id("selMonth")));
			dropdown1.selectByIndex(1);
			logger.info("Entered Month:1");
			Thread.sleep(1000);
			wd.findElement(By.id("txtLeaveUnits")).clear();
			wd.findElement(By.id("txtLeaveUnits")).sendKeys("2");
			logger.info("Entered LeaveUnits:2");
			Thread.sleep(1000);
			wd.findElement(By.id("btnSave")).click();
			logger.info(" Test case No 5 :Employee WorkedUnits Save Successfully");
			Thread.sleep(1000);
		}
			public static void testPositiveCase1(WebDriver wd) throws InterruptedException {
			   
				wd.manage().window().maximize();
		        wd.get(UserURL);
		        logger.info("Entered  WorkedUnitsPage Page to test Positive Testcases");
		        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
				dropdown.selectByIndex(0);
				logger.info("Entered Employeedropdown:0");
				
				Select dropdown1 = new Select(wd.findElement(By.id("selMonth")));
				dropdown1.selectByIndex(0);
				logger.info("Entered Month:0");
				
				wd.findElement(By.id("txtLeaveUnits")).clear();
				wd.findElement(By.id("txtLeaveUnits")).sendKeys("");
				logger.info("Entered LeaveUnits:");
				
				wd.findElement(By.id("btnSave")).click();
				logger.info(" Test case No 5 :Employee WorkedUnits Save Successfully");
				
       
		}
		
		
	}
	

	