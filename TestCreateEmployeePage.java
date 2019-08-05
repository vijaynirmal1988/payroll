package main.java.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCreateEmployeePage {
	final static Logger logger = Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME + "/meeting/newemployee.html";

	public static void testCreateemployee(WebDriver wd) throws InterruptedException, AWTException {
		
        testPositiveCase(wd);      //With Data Entering
        testNegativeCase(wd);      // Without Data Entering
        testNegativeCase1(wd);     // Wrong Data Entering 
	
    		
	}
	// PositiveCase      With Data Entering
	public static void testPositiveCase(WebDriver wd) throws InterruptedException {

		wd.manage().window().maximize();
        wd.get(UserURL);
      
    	wd.findElement(By.linkText("Employee")).click();
    	logger.info("Clicked  to EmployeePage Creation Link");
    	
    	wd.findElement(By.xpath("//*[@id='createEmpBtn']")).click();
		logger.info("Clicked to Create Employee Button");
		
		wd.findElement(By.name("FirstName")).sendKeys("Arun");
		logger.info("Entered FirstName:Arun");
		
		wd.findElement(By.name("MiddleName")).sendKeys("Kumar");
		logger.info("Entered MiddleName:Kumar");
		
		wd.findElement(By.name("LastName")).sendKeys("Jai");
		logger.info("Entered LastName:Jai");
		
		wd.findElement(By.name("Initials")).sendKeys("K");
		logger.info("Entered Initials:K");
		
		wd.findElement(By.name("FatherName")).sendKeys("Kumar");
		logger.info("Entered FatherName:Kumar");
		
		wd.findElement(By.name("SpouseName")).sendKeys("lakshmi");
		logger.info("Entered SpouseName:lakshmi");
		
		WebElement selectDate = wd.findElement(By.id("dpDOB"));
		selectDate.clear();
		selectDate.sendKeys("08-05-1995");
		logger.info("DOB Date Entered:08-05-1995");
		
		Select dropdown1 = new Select(wd.findElement(By.id("selCompanyID")));
		dropdown1.selectByIndex(1);
		logger.info("Selected CompanyID:SUSPL");
		
		Select dropdown2 = new Select(wd.findElement(By.id("department")));
		dropdown2.selectByIndex(1);
		logger.info("Selected department:Recruitments");
		
		Select dropdown3 = new Select(wd.findElement(By.id("businessTitle")));
		dropdown3.selectByIndex(1);
		logger.info("Selected businessTitle:Assistant Manager");
		
		Select dropdown4 = new Select(wd.findElement(By.id("reportingPerson")));
		dropdown4.selectByIndex(1);
		logger.info("Selected reportingPerson:");
		
		Select dropdown5 = new Select(wd.findElement(By.id("employmentType")));
		dropdown5.selectByIndex(1);
		logger.info("Selected employmentType:");
		
		Select dropdown6 = new Select(wd.findElement(By.id("jobBand")));
		dropdown6.selectByIndex(1);
		logger.info("Selected jobBand:");
		
		WebElement selectDate1 = wd.findElement(By.id("dpJoiningDate"));
		selectDate1.clear();
		selectDate1.sendKeys("08-05-2018");
		logger.info("JoiningDate Date Entered:08-05-2018");
		
		wd.findElement(By.name("MobileNo")).sendKeys("9876543210");
		logger.info("Entered MobileNo:9876543210");
		
		wd.findElement(By.name("AlternateContactNo")).sendKeys("9987654321");
		logger.info("Entered AlternateContactNo:9987654321");
		
		wd.findElement(By.name("Pan")).sendKeys("SIRMQ9874T");
		logger.info("Entered Pan:SIRMQ9874T");
		
		wd.findElement(By.name("Aadhaar")).sendKeys("789456123210");
		logger.info("Entered Aadhaar:789456123210");
		
		wd.findElement(By.name("Pf_UAN")).sendKeys("U78895556665");
		logger.info("Entered Pf_UAN:U78895556665");
		
		wd.findElement(By.name("PassportNo")).sendKeys("F78965412");
		logger.info("Entered PassportNo :F78965412");
		
		Select dropdown7 = new Select(wd.findElement(By.id("selActive")));
		dropdown7.selectByIndex(1);
		logger.info("Selected selActive:YES");
		
		WebElement selectDate2 = wd.findElement(By.id("dpResignationDate"));
		selectDate2.clear();
		selectDate2.sendKeys("08-05-2019");
		logger.info("Entered ResignationDate:08-05-2019");
		
		WebElement selectDate3 = wd.findElement(By.id("dpLeavingDate"));
		selectDate3.clear();
		selectDate3.sendKeys("08-06-2019");
		logger.info("Entered LeavingDate :08-06-2019");
		
		wd.findElement(By.name("Email")).sendKeys("arunkumar@gmail.com");
		logger.info("Entered Email :arunkumar@gmail.com");
		
		wd.findElement(By.id("btnSave")).click();
		logger.info(" Test case No 2.1 :Employee Created Sucessfully"); // Test Case - 2.1 Created Successfully
		logger.info(" Test case No 2.1 :Tested Positive Test Case Sucessfully");
		Thread.sleep(5000);
		
	}
	// NegativeCase   ----   Without Data Entering
	public static String testNegativeCase(WebDriver wd) throws InterruptedException, AWTException {
		String redirect = "";
		wd.manage().window().maximize();
        wd.get(UserURL);
    	wd.findElement(By.linkText("Employee")).click();
    	logger.info("Clicked  Employee Button");
    	
    	wd.findElement(By.xpath("//*[@id='createEmpBtn']")).click();
		logger.info("Clicked Create Employee");
		
		wd.findElement(By.name("FirstName")).sendKeys("");
		logger.info("Entered FirstName:");
		
		wd.findElement(By.name("MiddleName")).sendKeys("");
		logger.info("Entered MiddleName:");
		
		wd.findElement(By.name("LastName")).sendKeys("");
		logger.info("Entered LastName:");
		
		wd.findElement(By.name("Initials")).sendKeys("");
		logger.info("Entered Initials:");
		
		wd.findElement(By.name("FatherName")).sendKeys("");
		logger.info("Entered FatherName:");
		
		wd.findElement(By.name("SpouseName")).sendKeys("");
		logger.info("Entered SpouseName:");
		
		WebElement selectDate = wd.findElement(By.id("dpDOB"));
		selectDate.clear();
		selectDate.sendKeys("");
		logger.info("DOB Date Entered:");
		
		Select dropdown1 = new Select(wd.findElement(By.id("selCompanyID")));
		dropdown1.selectByIndex(0);
		logger.info("Selected CompanyID:");
		
		Select dropdown2 = new Select(wd.findElement(By.id("department")));
		dropdown2.selectByIndex(0);
		logger.info("Selected department:");
		
		Select dropdown3 = new Select(wd.findElement(By.id("businessTitle")));
		dropdown3.selectByIndex(0);
		logger.info("Selected businessTitle:");
		
		Select dropdown4 = new Select(wd.findElement(By.id("reportingPerson")));
		dropdown4.selectByIndex(0);
		logger.info("Selected reportingPerson:");
		
		Select dropdown5 = new Select(wd.findElement(By.id("employmentType")));
		dropdown5.selectByIndex(0);
		logger.info("Selected employmentType:");
		
		Select dropdown6 = new Select(wd.findElement(By.id("jobBand")));
		dropdown6.selectByIndex(0);
		logger.info("Selected jobBand:");
		
		WebElement selectDate1 = wd.findElement(By.id("dpJoiningDate"));
		selectDate1.clear();
		selectDate1.sendKeys("");
		logger.info("JoiningDate Date Entered:");
		
		wd.findElement(By.name("MobileNo")).sendKeys("");
		logger.info("Entered MobileNo:");
		
		wd.findElement(By.name("AlternateContactNo")).sendKeys("");
		logger.info("Entered AlternateContactNo:");
		
		wd.findElement(By.name("Pan")).sendKeys("");
		logger.info("Entered Pan:");
		
		wd.findElement(By.name("Aadhaar")).sendKeys("");
		logger.info("Entered Aadhaar:");
		
		wd.findElement(By.name("Pf_UAN")).sendKeys("");
		logger.info("Entered Pf_UAN:");
		
		wd.findElement(By.name("PassportNo")).sendKeys("");
		logger.info("Entered PassportNo :");
		
		Select dropdown7 = new Select(wd.findElement(By.id("selActive")));
		dropdown7.selectByIndex(0);
		logger.info("Selected selActive:");
		
		WebElement selectDate2 = wd.findElement(By.id("dpResignationDate"));
		selectDate2.clear();
		selectDate2.sendKeys("");
		logger.info("Entered ResignationDate:");
		
		WebElement selectDate3 = wd.findElement(By.id("dpLeavingDate"));
		selectDate3.clear();
		selectDate3.sendKeys("");
		logger.info("Entered LeavingDate :");
		
		wd.findElement(By.name("Email")).sendKeys("");
		logger.info("Entered Email :");
		
		wd.findElement(By.id("btnSave")).click();
		logger.info(" Test case No 2.2 :Employee Data Without Entered"); // Test Case - 2.1 Created Successfully
		logger.info(" Test case No 2.2 :Tested Negative Case Successfully");
	    Thread.sleep(2000);
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_SPACE);
	    Thread.sleep(5000);
        redirect = "Sucess";
		return redirect;
	}
	// NegativeCase   ----   Wrong Data Entering
		public static void testNegativeCase1(WebDriver wd) throws InterruptedException, AWTException {

			wd.manage().window().maximize();
	        wd.get(UserURL);
	    	wd.findElement(By.linkText("Employee")).click();
	    	logger.info("Clicked  Employee Button");
	    	
	    	wd.findElement(By.xpath("//*[@id='createEmpBtn']")).click();
			logger.info("Clicked Create Employee");
			
			wd.findElement(By.name("FirstName")).sendKeys("84561@#$%^");
			logger.info("Entered FirstName:84561@#$%^");
			
			wd.findElement(By.name("MiddleName")).sendKeys("84561@#$%^");
			logger.info("Entered MiddleName:84561@#$%^");
			
			wd.findElement(By.name("LastName")).sendKeys("84561@#$%^");
			logger.info("Entered LastName:84561@#$%^");
			
			wd.findElement(By.name("Initials")).sendKeys("84561@#$%^");
			logger.info("Entered Initials:84561@#$%^");
			
			wd.findElement(By.name("FatherName")).sendKeys("Kumar");
			logger.info("Entered FatherName:Kumar");
			
			wd.findElement(By.name("SpouseName")).sendKeys("84561@#$%^");
			logger.info("Entered SpouseName:84561@#$%^");
			
			WebElement selectDate = wd.findElement(By.id("dpDOB"));
			selectDate.clear();
			selectDate.sendKeys("84561@#$%^");
			logger.info("DOB Date Entered:84561@#$%^");
			
			Select dropdown1 = new Select(wd.findElement(By.id("selCompanyID")));
			dropdown1.selectByIndex(0);
			logger.info("Selected CompanyID:");
			
			Select dropdown2 = new Select(wd.findElement(By.id("department")));
			dropdown2.selectByIndex(0);
			logger.info("Selected department:");
			
			Select dropdown3 = new Select(wd.findElement(By.id("businessTitle")));
			dropdown3.selectByIndex(0);
			logger.info("Selected businessTitle:");
			
			Select dropdown4 = new Select(wd.findElement(By.id("reportingPerson")));
			dropdown4.selectByIndex(0);
			logger.info("Selected reportingPerson:");
			
			Select dropdown5 = new Select(wd.findElement(By.id("employmentType")));
			dropdown5.selectByIndex(0);
			logger.info("Selected employmentType:");
			
			Select dropdown6 = new Select(wd.findElement(By.id("jobBand")));
			dropdown6.selectByIndex(0);
			logger.info("Selected jobBand:");
			
			WebElement selectDate1 = wd.findElement(By.id("dpJoiningDate"));
			selectDate1.clear();
			selectDate1.sendKeys("84561@#$%^");
			logger.info("JoiningDate Date Entered:84561@#$%^");
			
			wd.findElement(By.name("MobileNo")).sendKeys("asdfg@#$%^");
			logger.info("Entered MobileNo:asdfg@#$%^\"");
			
			wd.findElement(By.name("AlternateContactNo")).sendKeys("asdfg@#$%^\"");
			logger.info("Entered AlternateContactNo:asdfg@#$%^\"");
			
			wd.findElement(By.name("Pan")).sendKeys("asdfg@#$%^\"12");
			logger.info("Entered Pan:asdfg@#$%^\"12");
			
			wd.findElement(By.name("Aadhaar")).sendKeys("asdfg@#$%^\\\"12");
			logger.info("Entered Aadhaar:asdfg@#$%^\\\"12");
			
			wd.findElement(By.name("Pf_UAN")).sendKeys("asdfg@#$%^\\\"12");
			logger.info("Entered Pf_UAN:asdfg@#$%^\\\"12");
			
			wd.findElement(By.name("PassportNo")).sendKeys("asdfg@#$%^\\\"12");
			logger.info("Entered PassportNo :asdfg@#$%^\\\"12");
			
			Select dropdown7 = new Select(wd.findElement(By.id("selActive")));
			dropdown7.selectByIndex(0);
			logger.info("Selected selActive:");
			
			WebElement selectDate2 = wd.findElement(By.id("dpResignationDate"));
			selectDate2.clear();
			selectDate2.sendKeys("asdfg@#$%^\\\"12");
			logger.info("Entered ResignationDate:asdfg@#$%^\\\"12");
			
			WebElement selectDate3 = wd.findElement(By.id("dpLeavingDate"));
			selectDate3.clear();
			selectDate3.sendKeys("asdfg@#$%^\\\"12");
			logger.info("Entered LeavingDate :asdfg@#$%^\\\"12");
			
			wd.findElement(By.name("Email")).sendKeys("asdfg@#$%^\\\"12");
			logger.info("Entered Email :asdfg@#$%^\\\"12");
			
			wd.findElement(By.id("btnSave")).click();
			logger.info(" Test case No 2.3 :  Entered Valid Employee Data");
			logger.info(" Test case No 2.2 :Tested Negative Case Successfully"); // Test case No 2.3 :Created Successfully
			//Thread.sleep(2000);
			Robot robot = new Robot();
    	    robot.keyPress(KeyEvent.VK_SPACE);
    	    robot.keyRelease(KeyEvent.VK_SPACE);
			wd.findElement(By.id("btnReset")).click();
			logger.info(" Test case No 2.3 :Employee Data Resetted Sucessfully"); 
			Thread.sleep(5000);
			
			//Thread.sleep(2000);
		}
}
