package main.java.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestIncomeTaxPage {

	final static Logger logger = Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME + "/meeting/IncomeTax.html";

	public static void testIncomeTax(WebDriver wd) throws InterruptedException, AWTException {
		
          testPositiveCase(wd);
       //   testNegativeCase(wd);      // Without Data Entering
       
		
	}
	public static void testPositiveCase(WebDriver wd) throws InterruptedException, AWTException {

		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered IncomeTaxPage to Test Valid Data");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(2);
		logger.info("Entered Employeedropdown:2");
		
		wd.findElement(By.id("txtGrossSalary")).clear();
		wd.findElement(By.id("txtGrossSalary")).sendKeys("15000");
		logger.info("Entered GrossSalary:15000");
		
		wd.findElement(By.id("txtExemptionsUnderSection")).clear();
		wd.findElement(By.id("txtExemptionsUnderSection")).sendKeys("1000");
		logger.info("Entered ExemptionsUnderSection:1000");
		
		wd.findElement(By.id("txtGrossSalaryafterSectionexemptions")).clear();
		wd.findElement(By.id("txtGrossSalaryafterSectionexemptions")).sendKeys("1000");
		logger.info("Entered GrossSalaryafterSectionexemptions:1000");
		
		wd.findElement(By.id("txtAccommodationorFurnishing")).clear();
		wd.findElement(By.id("txtAccommodationorFurnishing")).sendKeys("2500");
		logger.info("Entered AccommodationorFurnishing:2500");
		
		wd.findElement(By.id("txtNetSalary")).clear();
		wd.findElement(By.id("txtNetSalary")).sendKeys("15000");
		logger.info("Entered NetSalary:15000");
		
		wd.findElement(By.id("txtIncomereceivedfrompreviousemployersalary")).clear();
		wd.findElement(By.id("txtIncomereceivedfrompreviousemployersalary")).sendKeys("25000");
		logger.info("Entered Incomereceivedfrompreviousemployersalary:25000");
		
		wd.findElement(By.id("txtProfessionalTaxrecoveredbypreviousemployer")).clear();
		wd.findElement(By.id("txtProfessionalTaxrecoveredbypreviousemployer")).sendKeys("15000");
		logger.info("Entered ProfessionalTaxrecoveredbypreviousemployer:15000");
		
		wd.findElement(By.id("txtProfessionalTaxrecoveredbyCurrentEmployer")).clear();
		wd.findElement(By.id("txtProfessionalTaxrecoveredbyCurrentEmployer")).sendKeys("5000");
		logger.info("Entered ProfessionalTaxrecoveredbyCurrentEmployer:5000");
		
		wd.findElement(By.id("txtStandardDeduction")).clear();
		wd.findElement(By.id("txtStandardDeduction")).sendKeys("2500");
		logger.info("Entered StandardDeduction:2500");
		
		wd.findElement(By.id("txtIncomechageableundertheheadSalaries")).clear();
		wd.findElement(By.id("txtIncomechageableundertheheadSalaries")).sendKeys("1500");
		logger.info("Entered IncomechageableundertheheadSalaries:1500");
		
		wd.findElement(By.id("txtHousepropertyincomeorloss")).clear();		
		wd.findElement(By.id("txtHousepropertyincomeorloss")).sendKeys("3500");
		logger.info("Entered Housepropertyincomeorloss:3500");
		
		wd.findElement(By.id("txtOtherincome")).clear();		
		wd.findElement(By.id("txtOtherincome")).sendKeys("1500");
		logger.info("Entered Otherincome:1500");
		
		wd.findElement(By.id("txtGrossTotalIncome")).clear();		
		wd.findElement(By.id("txtGrossTotalIncome")).sendKeys("20000");
		logger.info("Entered GrossTotalIncome:20000");
		
		wd.findElement(By.id("txtOtherDeductionunderchapter")).clear();		
		wd.findElement(By.id("txtOtherDeductionunderchapter")).sendKeys("2500");
		logger.info("Entered OtherDeductionunderchapter:2500");
		
		wd.findElement(By.id("txtDeductionsUnderChapter")).clear();		
		wd.findElement(By.id("txtDeductionsUnderChapter")).sendKeys("5000");
		logger.info("Entered DeductionsUnderChapter:5000");
		
		wd.findElement(By.id("txtNetTaxableIncome")).clear();		
		wd.findElement(By.id("txtNetTaxableIncome")).sendKeys("4500");
		logger.info("Entered NetTaxableIncome:4500");
		
		wd.findElement(By.id("txtTaxonNetIncome")).clear();		
		wd.findElement(By.id("txtTaxonNetIncome")).sendKeys("10000");
		logger.info("Entered TaxonNetIncome:10000");
		
		wd.findElement(By.id("txtIncomeTaxpayable")).clear();		
		wd.findElement(By.id("txtIncomeTaxpayable")).sendKeys("4000");
		logger.info("Entered IncomeTaxpayable:4000");
		
		wd.findElement(By.id("txtSurchargeonIncomeTax")).clear();		
		wd.findElement(By.id("txtSurchargeonIncomeTax")).sendKeys("2300");
		logger.info("Entered SurchargeonIncomeTax:2300");
		
		wd.findElement(By.id("txtHealthandEducationCess")).clear();		
		wd.findElement(By.id("txtHealthandEducationCess")).sendKeys("22000");
		logger.info("Entered HealthandEducationCess:22000");
		
		wd.findElement(By.id("txtTotalTaxLiability")).clear();		
		wd.findElement(By.id("txtTotalTaxLiability")).sendKeys("350");
		logger.info("Entered TotalTaxLiability:350");
		
		wd.findElement(By.id("txtIncomeTaxPerMonth")).clear();		
		wd.findElement(By.id("txtIncomeTaxPerMonth")).sendKeys("3500");
		logger.info("Entered IncomeTaxPerMonth:3500");
		
		wd.findElement(By.id("txtMarginalTaxtobeRecoveredforthisMonth")).clear();		
		wd.findElement(By.id("txtMarginalTaxtobeRecoveredforthisMonth")).sendKeys("35000");
		logger.info("Entered txtMarginalTaxtobeRecoveredforthisMonth:35000");
		
		wd.findElement(By.id("txtTaxtobeRecoveredfortheCurrentMonth")).clear();		
		wd.findElement(By.id("txtTaxtobeRecoveredfortheCurrentMonth")).sendKeys("3500");
		logger.info("Entered TaxtobeRecoveredfortheCurrentMonth:3500");
		
		wd.findElement(By.id("txtTotalIncometaxpaidfromsalarytilldate")).clear();		
		wd.findElement(By.id("txtTotalIncometaxpaidfromsalarytilldate")).sendKeys("3500");
		logger.info("Entered TotalIncometaxpaidfromsalarytilldate:3500");
		
		wd.findElement(By.id("txtTaxpaidoutsidesalaryorTaxrecoveredbypreviousemployer")).clear();		
		wd.findElement(By.id("txtTaxpaidoutsidesalaryorTaxrecoveredbypreviousemployer")).sendKeys("3250");
		logger.info("Entered TaxpaidoutsidesalaryorTaxrecoveredbypreviousemployer:3250");
		
		wd.findElement(By.id("txtIncomeTaxdue")).clear();		
		wd.findElement(By.id("txtIncomeTaxdue")).sendKeys("35000");
		logger.info("Entered IncomeTaxdue:35000");
		
		wd.findElement(By.id("txtRemainingmonthsinthecurrentYear")).clear();		
		wd.findElement(By.id("txtRemainingmonthsinthecurrentYear")).sendKeys("11");
		logger.info("Entered RemainingmonthsinthecurrentYear:11");
		
		wd.findElement(By.id("txtTDStoberecoveredpermonth")).clear();		
		wd.findElement(By.id("txtTDStoberecoveredpermonth")).sendKeys("257350");
		logger.info("Entered txtTDStoberecoveredpermonth:257350");
		
		
		wd.findElement(By.id("btnSave")).click();
		logger.info("Clicked to Save Button Successfully");
		
		Thread.sleep(2000);
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_SPACE);
		logger.info(" Test case No 8.1 :IncomeTax Page Created Sucessfully"); 
		logger.info("Test case No 8.1 :Tested Positive Test Case Sucessfully");
		
}
	 //Negative case - 1 Without Data Entered
	public static void testNegativeCase(WebDriver wd) throws InterruptedException, AWTException {

		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered IncomeTaxPage to Test Without Entering Data");
      
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(2);
		logger.info("Entered Employeedropdown:2");
		
		wd.findElement(By.id("txtGrossSalary")).clear();
		logger.info("Entered GrossSalary:");
		
		wd.findElement(By.id("txtExemptionsUnderSection")).clear();
		logger.info("Entered ExemptionsUnderSection:");
		
		wd.findElement(By.id("txtGrossSalaryafterSectionexemptions")).clear();
		logger.info("Entered GrossSalaryafterSectionexemptions:");
		
		wd.findElement(By.id("txtAccommodationorFurnishing")).clear();
		logger.info("Entered AccommodationorFurnishing:");
		
		wd.findElement(By.id("txtNetSalary")).clear();
		logger.info("Entered NetSalary:");
		
		wd.findElement(By.id("txtIncomereceivedfrompreviousemployersalary")).clear();
		logger.info("Entered Incomereceivedfrompreviousemployersalary:");
		
		wd.findElement(By.id("txtProfessionalTaxrecoveredbypreviousemployer")).clear();
		logger.info("Entered ProfessionalTaxrecoveredbypreviousemployer:");
		
		wd.findElement(By.id("txtProfessionalTaxrecoveredbyCurrentEmployer")).clear();
		logger.info("Entered ProfessionalTaxrecoveredbyCurrentEmployer:");
		
		wd.findElement(By.id("txtStandardDeduction")).clear();
		logger.info("Entered StandardDeduction:");
		
		wd.findElement(By.id("txtIncomechageableundertheheadSalaries")).clear();
		logger.info("Entered IncomechageableundertheheadSalaries:");
		
		wd.findElement(By.id("txtHousepropertyincomeorloss")).clear();		
		logger.info("Entered Housepropertyincomeorloss:");
		
		wd.findElement(By.id("txtOtherincome")).clear();		
		logger.info("Entered Otherincome:");
		
		wd.findElement(By.id("txtGrossTotalIncome")).clear();		
		logger.info("Entered GrossTotalIncome:");
		
		wd.findElement(By.id("txtOtherDeductionunderchapter")).clear();		
		logger.info("Entered OtherDeductionunderchapter:");
		
		wd.findElement(By.id("txtDeductionsUnderChapter")).clear();		
		logger.info("Entered DeductionsUnderChapter:5000");
		
		wd.findElement(By.id("txtNetTaxableIncome")).clear();		
		logger.info("Entered NetTaxableIncome:");
		
		wd.findElement(By.id("txtTaxonNetIncome")).clear();		
		logger.info("Entered TaxonNetIncome:");
		
		wd.findElement(By.id("txtIncomeTaxpayable")).clear();		
		logger.info("Entered IncomeTaxpayable:");
		
		wd.findElement(By.id("txtSurchargeonIncomeTax")).clear();		
		logger.info("Entered SurchargeonIncomeTax:");
		
		wd.findElement(By.id("txtHealthandEducationCess")).clear();		
		logger.info("Entered HealthandEducationCess:");
		
		wd.findElement(By.id("txtTotalTaxLiability")).clear();		
		logger.info("Entered TotalTaxLiability:");
		
		wd.findElement(By.id("txtIncomeTaxPerMonth")).clear();		
		logger.info("Entered IncomeTaxPerMonth:");
		
		wd.findElement(By.id("txtMarginalTaxtobeRecoveredforthisMonth")).clear();		
		logger.info("Entered txtMarginalTaxtobeRecoveredforthisMonth:");
		
		wd.findElement(By.id("txtTaxtobeRecoveredfortheCurrentMonth")).clear();		
		logger.info("Entered TaxtobeRecoveredfortheCurrentMonth:");
		
		wd.findElement(By.id("txtTotalIncometaxpaidfromsalarytilldate")).clear();		
		logger.info("Entered TotalIncometaxpaidfromsalarytilldate:");
		
		wd.findElement(By.id("txtTaxpaidoutsidesalaryorTaxrecoveredbypreviousemployer")).clear();		
		logger.info("Entered TaxpaidoutsidesalaryorTaxrecoveredbypreviousemployer:");
		
		wd.findElement(By.id("txtIncomeTaxdue")).clear();		
		logger.info("Entered IncomeTaxdue:");
		
		wd.findElement(By.id("txtRemainingmonthsinthecurrentYear")).clear();		
		logger.info("Entered RemainingmonthsinthecurrentYear:");
		
		wd.findElement(By.id("txtTDStoberecoveredpermonth")).clear();		
	    logger.info("Entered txtTDStoberecoveredpermonth:");
		
		
		wd.findElement(By.id("btnSave")).click();
		logger.info("Clicked to Save Button:");
		logger.info(" Test case No 8.2 : Entered Valid Data");      //Test case No 8.2 : Created Successfully
		logger.info("Test case No 8.2 :Tested Negative Test Case Sucessfully");
		Thread.sleep(5000);
	}
	
}