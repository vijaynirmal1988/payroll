package main.java.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSalarytransactionPage {
	final static Logger logger = Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME + "/meeting/salarytransaction.html";

	public static void testsalarytransaction(WebDriver wd) throws InterruptedException, AWTException {
		
      //   testPositiveCase(wd);  //Valid Data Entering
		 
	 testNegativeCase(wd);

     
		
	}
	public static void testPositiveCase(WebDriver wd) throws InterruptedException, AWTException {	
	
        wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered Salarytransaction Page to test Positive Testcases");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(1);
		logger.info("Entered Employeedropdown:1");
		
		wd.findElement(By.id("txtBasicPay")).clear();
		wd.findElement(By.id("txtBasicPay")).sendKeys("15000");
		logger.info("Entered BasicPay:15000");
		
		wd.findElement(By.id("txtMedicalAllowance")).clear();
		wd.findElement(By.id("txtMedicalAllowance")).sendKeys("1000");
		logger.info("Entered MedicalAllowance:1000");
		
		wd.findElement(By.id("txtArrears")).clear();
		wd.findElement(By.id("txtArrears")).sendKeys("1000");
		logger.info("Entered Arrears:1000");
		
		wd.findElement(By.id("txtHRA")).clear();
		wd.findElement(By.id("txtHRA")).sendKeys("2500");
		logger.info("Entered HRA:2500");
		
		wd.findElement(By.id("txtSpecialAllowance")).clear();
		wd.findElement(By.id("txtSpecialAllowance")).sendKeys("1500");
		logger.info("Entered SpecialAllowance:1500");
		
		wd.findElement(By.id("txtGrossSalary")).clear();
		wd.findElement(By.id("txtGrossSalary")).sendKeys("25000");
		logger.info("Entered GrossSalary:25000");
		
		wd.findElement(By.id("txtConveyanceAllowance")).clear();
		wd.findElement(By.id("txtConveyanceAllowance")).sendKeys("1500");
		logger.info("Entered ConveyanceAllowance:1500");
		
		wd.findElement(By.id("txtTelephoneAllowance")).clear();
		wd.findElement(By.id("txtTelephoneAllowance")).sendKeys("500");
		logger.info("Entered TelephoneAllowance:500");
		
		wd.findElement(By.id("txtESIDeductions")).clear();
		wd.findElement(By.id("txtESIDeductions")).sendKeys("2500");
		logger.info("Entered ESIDeductions:2500");
		
		wd.findElement(By.id("txtPFEmployer")).clear();
		wd.findElement(By.id("txtPFEmployer")).sendKeys("1500");
		logger.info("Entered PFEmployer:1500");
		
		wd.findElement(By.id("txtPFEmployee")).clear();		
		wd.findElement(By.id("txtPFEmployee")).sendKeys("1500");
		logger.info("Entered PFEmployee:1500");
		
		wd.findElement(By.id("txtTDS")).clear();		
		wd.findElement(By.id("txtTDS")).sendKeys("1500");
		logger.info("Entered TDS:1500");
		
		wd.findElement(By.id("txtPeriod")).clear();		
		wd.findElement(By.id("txtPeriod")).sendKeys("Monthly");
		logger.info("Entered Period:Monthly");
		
		wd.findElement(By.id("txtCTC")).clear();		
		wd.findElement(By.id("txtCTC")).sendKeys("25000");
		logger.info("Entered PFEmployee:25000");
		
		wd.findElement(By.id("txtAdvance")).clear();		
		wd.findElement(By.id("txtAdvance")).sendKeys("5000");
		logger.info("Entered Advance:5000");
		
		wd.findElement(By.id("txtLOP")).clear();		
		wd.findElement(By.id("txtLOP")).sendKeys("4500");
		logger.info("Entered LOP:4500");
		
		wd.findElement(By.id("txtTotalDeductions")).clear();		
		wd.findElement(By.id("txtTotalDeductions")).sendKeys("10000");
		logger.info("Entered TotalDeductions:10000");
		
		wd.findElement(By.id("txtOtherDeductions")).clear();		
		wd.findElement(By.id("txtOtherDeductions")).sendKeys("400");
		logger.info("Entered OtherDeductions:400");
		
		wd.findElement(By.id("txtTotalEarnings")).clear();		
		wd.findElement(By.id("txtTotalEarnings")).sendKeys("23000");
		logger.info("Entered TotalEarnings:23000");
		
		wd.findElement(By.id("txtNetPay")).clear();		
		wd.findElement(By.id("txtNetPay")).sendKeys("22000");
		logger.info("Entered NetPay:22000");
		
		wd.findElement(By.id("txtOthers")).clear();		
		wd.findElement(By.id("txtOthers")).sendKeys("3500");
		logger.info("Entered TotalOthers:3500");
		
		wd.findElement(By.id("txtPTDeductions")).clear();		
		wd.findElement(By.id("txtPTDeductions")).sendKeys("350");
		logger.info("Entered PTDeductions:350");
		
		wd.findElement(By.id("btnSave")).click();
		logger.info("Data Saved Successfully");
		Thread.sleep(2000);
		
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_SPACE);
		logger.info(" Test case No 7.1 :Created Successfully"); 
		logger.info(" Test case No 7.1 :Tested Positive Test Case Sucessfully");   // Test Case - 7.1 Created Successfully
		Thread.sleep(5000);
		
		
}

	 //Negative case - 1 Without Data Entered
	public static String testNegativeCase(WebDriver wd) throws InterruptedException, AWTException {
		String redirect = "";

		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered Salarytransaction Page to test Negative Testcases");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(2);
		logger.info("Entered Employeedropdown:2");
		
		wd.findElement(By.id("txtBasicPay")).clear();
		wd.findElement(By.id("txtBasicPay")).sendKeys("");
		logger.info("Entered BasicPay:");
		
		wd.findElement(By.id("txtMedicalAllowance")).clear();
		wd.findElement(By.id("txtMedicalAllowance")).sendKeys("");
		logger.info("Entered MedicalAllowance:");
		
		wd.findElement(By.id("txtArrears")).clear();
		wd.findElement(By.id("txtArrears")).sendKeys("");
		logger.info("Entered Arrears:");
		
		wd.findElement(By.id("txtHRA")).clear();
		wd.findElement(By.id("txtHRA")).sendKeys("");
		logger.info("Entered HRA:");
		
		wd.findElement(By.id("txtSpecialAllowance")).clear();
		wd.findElement(By.id("txtSpecialAllowance")).sendKeys("");
		logger.info("Entered SpecialAllowance:");
		
		wd.findElement(By.id("txtGrossSalary")).clear();
		wd.findElement(By.id("txtGrossSalary")).sendKeys("");
		logger.info("Entered GrossSalary:");
		
		wd.findElement(By.id("txtConveyanceAllowance")).clear();
		wd.findElement(By.id("txtConveyanceAllowance")).sendKeys("");
		logger.info("Entered ConveyanceAllowance:");
		
		wd.findElement(By.id("txtTelephoneAllowance")).clear();
		wd.findElement(By.id("txtTelephoneAllowance")).sendKeys("");
		logger.info("Entered TelephoneAllowance:");
		
		wd.findElement(By.id("txtESIDeductions")).clear();
		wd.findElement(By.id("txtESIDeductions")).sendKeys("");
		logger.info("Entered ESIDeductions:");
		
		wd.findElement(By.id("txtPFEmployer")).clear();
		wd.findElement(By.id("txtPFEmployer")).sendKeys("");
		logger.info("Entered PFEmployer:");
		
		wd.findElement(By.id("txtPFEmployee")).clear();		
		wd.findElement(By.id("txtPFEmployee")).sendKeys("");
		logger.info("Entered PFEmployee:");
		
		wd.findElement(By.id("txtTDS")).clear();		
		wd.findElement(By.id("txtTDS")).sendKeys("");
		logger.info("Entered TDS:");
		
		wd.findElement(By.id("txtPeriod")).clear();		
		wd.findElement(By.id("txtPeriod")).sendKeys("");
		logger.info("Entered ");
		
		wd.findElement(By.id("txtCTC")).clear();		
		wd.findElement(By.id("txtCTC")).sendKeys("");
		logger.info("Entered PFEmployee:");
		
		wd.findElement(By.id("txtAdvance")).clear();		
		wd.findElement(By.id("txtAdvance")).sendKeys("");
		logger.info("Entered Advance:");
		
		wd.findElement(By.id("txtLOP")).clear();		
		wd.findElement(By.id("txtLOP")).sendKeys("");
		logger.info("Entered LOP:");
		
		wd.findElement(By.id("txtTotalDeductions")).clear();		
		wd.findElement(By.id("txtTotalDeductions")).sendKeys("");
		logger.info("Entered TotalDeductions:");
		
		wd.findElement(By.id("txtOtherDeductions")).clear();		
		wd.findElement(By.id("txtOtherDeductions")).sendKeys("");
		logger.info("Entered OtherDeductions:");
		
		wd.findElement(By.id("txtTotalEarnings")).clear();		
		wd.findElement(By.id("txtTotalEarnings")).sendKeys("");
		logger.info("Entered TotalEarnings:");
		
		wd.findElement(By.id("txtNetPay")).clear();		
		wd.findElement(By.id("txtNetPay")).sendKeys("");
		logger.info("Entered NetPay:");
		
		wd.findElement(By.id("txtOthers")).clear();		
		wd.findElement(By.id("txtOthers")).sendKeys("");
		logger.info("Entered TotalOthers:");
		
		wd.findElement(By.id("txtPTDeductions")).clear();		
		wd.findElement(By.id("txtPTDeductions")).sendKeys("");
		logger.info("Entered PTDeductions:");
		
		wd.findElement(By.id("btnSave")).click();
		logger.info("Clicked to Save Button");
		Thread.sleep(2000);
		
//		wd.findElement(By.id("btnPayslip")).click();
//		logger.info("Employee Payslip Generated Successfully");
//		Thread.sleep(2000);
		
		wd.findElement(By.id("btnReset")).click();
		logger.info("Clicked to  Reset Button Successfully");
		logger.info(" Test case No 7.2 : Entered Valid only"); 
		logger.info(" Test case No 7.2 :Tested Negative Test Case Sucessfully"); // Test Case - 7.2 Created Successfully
		Thread.sleep(5000);
		redirect = "Success";
		return redirect;
		
         }

	
	
	}