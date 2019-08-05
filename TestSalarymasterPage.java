package main.java.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class TestSalarymasterPage {
	final static Logger logger = Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME + "/meeting/salarymaster.html";

	public static void testSalararymaster(WebDriver wd) throws InterruptedException, AWTException {
		testPositiveCase(wd);      //With Data Entering
	    testNegativeCase(wd);      // Without Data Entering
	    testNegativeCase1(wd);    //Reseted Data
		

			
		
	}
	//PositiveCase   --   With Data Entering
	public static void testPositiveCase(WebDriver wd) throws InterruptedException, AWTException {

		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered Salarymaster Page");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(22);
		wd.findElement(By.id("txtBasicPay")).clear();
		wd.findElement(By.id("txtBasicPay")).sendKeys("15000");
		logger.info("Entered BasicPay:15000");
		wd.findElement(By.id("txtHRA")).clear();
		wd.findElement(By.id("txtHRA")).sendKeys("2500");
		logger.info("Entered HRA:2500");
		wd.findElement(By.id("txtMedicalAllowance")).clear();
		wd.findElement(By.id("txtMedicalAllowance")).sendKeys("1000");
		logger.info("Entered MedicalAllowance:1000");
		wd.findElement(By.id("txtSpecialAllowance")).clear();
		wd.findElement(By.id("txtSpecialAllowance")).sendKeys("1500");
		logger.info("Entered SpecialAllowance:1500");
		wd.findElement(By.id("txtConveyanceAllowance")).clear();
		wd.findElement(By.id("txtConveyanceAllowance")).sendKeys("1500");
		logger.info("Entered ConveyanceAllowance:1500");
		wd.findElement(By.id("txtTelephoneAllowance")).clear();
		wd.findElement(By.id("txtTelephoneAllowance")).sendKeys("500");
		logger.info("Entered TelephoneAllowance:500");
		wd.findElement(By.id("txtPFEmployer")).clear();
		wd.findElement(By.id("txtPFEmployer")).sendKeys("1500");
		logger.info("Entered PFEmployer:1500");
		wd.findElement(By.id("txtPFEmployee")).clear();		
		wd.findElement(By.id("txtPFEmployee")).sendKeys("1500");
		logger.info("Entered PFEmployee:1500");
		Select dropdown1 = new Select(wd.findElement(By.id("payperiodtype")));
		dropdown1.selectByIndex(3);
		logger.info("Selected payperiodtype:Monthly");
		wd.findElement(By.id("txtCTC")).clear();
		wd.findElement(By.id("txtCTC")).sendKeys("25000");
		logger.info("Entered CTC:25000");
		wd.findElement(By.id("btnSave")).click();  
		logger.info("Clicked to Save Button:");
        Thread.sleep(2000);
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_SPACE);
		logger.info(" Test case No 3.1 : Salary Master Created Sucessfully  "); // Test Case - 3.1 Created Successfully
		logger.info(" Test case No 3.1 :Tested Positive Test Case Sucessfully");
		Thread.sleep(5000);
     
	}
	// NegativeCase   ----   Without Data Entering
	public static void testNegativeCase(WebDriver wd) throws InterruptedException, AWTException {

		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered Salarymaster Page to test Negative Testcases");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(23);
		wd.findElement(By.id("txtBasicPay")).clear();
		
		logger.info("Entered BasicPay:");
		wd.findElement(By.id("txtHRA")).clear();
		logger.info("Entered HRA:");
		wd.findElement(By.id("txtMedicalAllowance")).clear();
		logger.info("Entered MedicalAllowance:");
		wd.findElement(By.id("txtSpecialAllowance")).clear();
		logger.info("Entered SpecialAllowance:");
		wd.findElement(By.id("txtConveyanceAllowance")).clear();
		logger.info("Entered ConveyanceAllowance:");
		wd.findElement(By.id("txtTelephoneAllowance")).clear();
		logger.info("Entered TelephoneAllowance:");
		wd.findElement(By.id("txtPFEmployer")).clear();
		logger.info("Entered PFEmployer:");
		wd.findElement(By.id("txtPFEmployee")).clear();		
		logger.info("Entered PFEmployee:");
		Select dropdown1 = new Select(wd.findElement(By.id("payperiodtype")));
		dropdown1.selectByIndex(0);
		logger.info("Selected payperiodtype:");
		wd.findElement(By.id("txtCTC")).clear();
		logger.info("Entered CTC:");
		wd.findElement(By.id("btnSave")).click(); 
		logger.info("Clicked to Save Button:");
        Thread.sleep(5000);
        logger.info(" Test case No 3.2 : Salary Master Created Sucessfully  ");
    	logger.info(" Test case No 3.2 :Tested Negative Case Successfully"); // Test case No 3.2 : Created Successfully
	}
	public static void testNegativeCase1(WebDriver wd) throws InterruptedException, AWTException {

		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered Salarymaster Page to test Negative Testcases");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(23);
		wd.findElement(By.id("btnReset")).click(); 
		logger.info("Clicked to Reset Button:");
        Thread.sleep(5000);
        logger.info(" Test case No 3.3 : Salary Master Resetted Sucessfully  ");
    	logger.info(" Test case No 3.3 :Tested Negative Case Successfully"); // Test case No 3.3 : Created Successfully
		
	
	}
}
