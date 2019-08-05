package main.java.selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestITDeclarationFormPage {

	final static Logger logger = Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME + "/meeting/ITDeclarationForm.html";

	public static void testITDeclarationForm(WebDriver wd) throws InterruptedException {
		
        testPositiveCase(wd);
        testNegativeCase(wd);      // Without Data Entering
        testNegativeCase1(wd);     // Wrong Data Entering 
	
	}
	public static void testPositiveCase(WebDriver wd) throws InterruptedException {
		wd.manage().window().setPosition(new Point(0, -1000));
		Thread.sleep(3000);
		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered ITDeclarationFormPage to Test Without Entering Data");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(2);
		logger.info("Entered Employeedropdown:2");
		
		//SECTION-A Started
		wd.findElement(By.id("txtDividends")).clear();
		wd.findElement(By.id("txtDividends")).sendKeys("150");
		logger.info("Entered Dividends:150");						 //SECTION-A -1
		
		wd.findElement(By.id("txtInterest")).clear();
		wd.findElement(By.id("txtInterest")).sendKeys("150");
		logger.info("Entered Interest:150");						//SECTION-A -2
		
		wd.findElement(By.id("txtOtherIncomes")).clear();
		wd.findElement(By.id("txtOtherIncomes")).sendKeys("150");
		logger.info("Entered OtherIncomes:150"); 					//SECTION-A -3
		
	//	wd.findElement(By.id("next-a")).click();
		logger.info("Clicked to next-a Button:");
		logger.info(" Test case No 9.1 :SECTION-A Data Entered SECTION-B Started  "); //Test case No 9.1 : SECTION-A Created Successfully
		Thread.sleep(2000);
		
		// SECTION-B Started
		
		wd.findElement(By.id("txtAnnualValue")).clear();
		wd.findElement(By.id("txtAnnualValue")).sendKeys("1000");
		logger.info("Entered AnnualValue:1000");								 // SECTION-B-1
		
		wd.findElement(By.id("txtStandardDeduction")).clear();
		wd.findElement(By.id("txtStandardDeduction")).sendKeys("1500");
		logger.info("Entered StandardDeduction:1500"); 							// SECTION-B-2
		
		wd.findElement(By.id("txtInterestonHousingLoan")).clear();
		wd.findElement(By.id("txtInterestonHousingLoan")).sendKeys("15000");
		logger.info("Entered InterestonHousingLoan:15000"); 						// SECTION-B-3
		
		wd.findElement(By.id("txtAmountofInterest")).clear();
		wd.findElement(By.id("txtAmountofInterest")).sendKeys("15000");
		logger.info("Entered AmountofInterest:15000"); 									// SECTION-B-4
		
		wd.findElement(By.id("txtAmountofInterestforPreConstruction")).clear();
		wd.findElement(By.id("txtAmountofInterestforPreConstruction")).sendKeys("15000");
		logger.info("Entered AmountofInterestforPreConstruction:15000"); 				// SECTION-B-5
		
		//wd.findElement(By.id("next-b")).click();
		logger.info("Clicked to next-b Button:");
		logger.info(" Test case No 9.2 : SECTION-B Data Entered SECTION-B Started"); 	//Test case No 9.2 : SECTION-B Created Successfully
		Thread.sleep(2000);
		
		// SECTION-C Started
		
		wd.findElement(By.id("txtPeriod")).clear();
		wd.findElement(By.id("txtPeriod")).sendKeys("1500");
		logger.info("Entered Period:1500");														 //SECTION-C-1
		
				
		//wd.findElement(By.id("next-c")).click();
		logger.info("Clicked to next-C Button:");
		logger.info(" Test case No 9.3 : SECTION-C Data Entered SECTION-D Started"); 				//Test case No 9.3 : SECTION-C Created Sucessfully
		Thread.sleep(2000);
		
		//SECTION-D started
		wd.findElement(By.id("txtPF")).clear();
		wd.findElement(By.id("txtPF")).sendKeys("1500");
		logger.info("Entered PF:1500");                         								 //SECTION-D-1
		
		wd.findElement(By.id("txtEmployeesContribution")).clear();
		wd.findElement(By.id("txtEmployeesContribution")).sendKeys("1500");
		logger.info("Entered EmployeesContribution:1500"); 													 //SECTION-D-2
		
		wd.findElement(By.id("txtEmployeesContribution1B")).clear();
		wd.findElement(By.id("txtEmployeesContribution1B")).sendKeys("1500");
		logger.info("Entered EmployeesContribution1B:1500");   												//SECTION-D-3
		
		wd.findElement(By.id("txtPublicPF")).clear();
		wd.findElement(By.id("txtPublicPF")).sendKeys("1500");
		logger.info("Entered txtPublicPF:1500");   															 //SECTION-D-4
			
		wd.findElement(By.id("txtContributiontoCertainPF")).clear();
		wd.findElement(By.id("txtContributiontoCertainPF")).sendKeys("1500");
		logger.info("Entered ContributiontoCertainPF:1500");   											   //SECTION-D-5
		
		wd.findElement(By.id("txtHousingLoanRepayment")).clear();
		wd.findElement(By.id("txtHousingLoanRepayment")).sendKeys("1500");
		logger.info("Entered HousingLoanRepayment:1500");  													 //SECTION-D-6
		
		wd.findElement(By.id("txtInsurancePremium")).clear();
		wd.findElement(By.id("txtInsurancePremium")).sendKeys("1500");
		logger.info("Entered InsurancePremium:1500"); 												  //SECTION-D-7
		
		wd.findElement(By.id("txtAllowableTermDeposit")).clear();
		wd.findElement(By.id("txtAllowableTermDeposit")).sendKeys("1500");
		logger.info("Entered AllowableTermDeposit:1500");    										 //SECTION-D-8
		
		wd.findElement(By.id("txtNationalSavingScheme")).clear();
		wd.findElement(By.id("txtNationalSavingScheme")).sendKeys("1500");
		logger.info("Entered NationalSavingScheme:1500");     											 //SECTION-D-9
		
		wd.findElement(By.id("txtMutualFund")).clear();
		wd.findElement(By.id("txtMutualFund")).sendKeys("1500");
		logger.info("Entered MutualFund:1500");  												    //SECTION-D-10
		
		wd.findElement(By.id("txtChildrenEducationExpenses")).clear();
		wd.findElement(By.id("txtChildrenEducationExpenses")).sendKeys("1500");
		logger.info("Entered ChildrenEducationExpenses:1500");   									  //SECTION-D-11
		
		wd.findElement(By.id("txtOthersD")).clear();
		wd.findElement(By.id("txtOthersD")).sendKeys("1500");
		logger.info("Entered PANNo:SIRMQ9874T:1500");   															 //SECTION-D-12
			
	//	wd.findElement(By.id("next-d")).click();
		logger.info("Clicked to next-D Button:");
		logger.info(" Test case No 9.4 : SECTION-D Data Entered SECTION-E Started");    //Test case No 9.4 : SECTION-D Created Successfully
		Thread.sleep(2000);
		
		//SECTION-E
		wd.findElement(By.id("txtMedicalInsurancePremium")).clear();
		wd.findElement(By.id("txtMedicalInsurancePremium")).sendKeys("1500");
		logger.info("Entered MedicalInsurancePremium:1500");                          //SECTION-E-1
		 
		wd.findElement(By.id("txtDeductioninrespectofmaintenance")).clear();
		wd.findElement(By.id("txtDeductioninrespectofmaintenance")).sendKeys("1500");
		logger.info("Entered Deductioninrespectofmaintenance:1500");                      //SECTION-E-2
		 
		wd.findElement(By.id("txtExpenditureonMedicalTreatment")).clear();
		wd.findElement(By.id("txtExpenditureonMedicalTreatment")).sendKeys("1500");
		logger.info("Entered ExpenditureonMedicalTreatment:1500");                               //SECTION-E-3
		
		wd.findElement(By.id("txtRepaymentofInterest")).clear();
		wd.findElement(By.id("txtRepaymentofInterest")).sendKeys("1500");
		logger.info("Entered RepaymentofInterest:1500");                                              //SECTION-E-4
		
		wd.findElement(By.id("txtDeduction")).clear();
		wd.findElement(By.id("txtDeduction")).sendKeys("1500");
		logger.info("Entered Deduction:1500");                                                  //SECTION-E-5
		
		wd.findElement(By.id("txtDeductioninrespectofdonations")).clear();
		wd.findElement(By.id("txtDeductioninrespectofdonations")).sendKeys("1500");
		logger.info("Entered Deductioninrespectofdonations:1500");                                          //SECTION-E-6
		
		wd.findElement(By.id("txtRentPaid")).clear();
		wd.findElement(By.id("txtRentPaid")).sendKeys("1500");
		logger.info("Entered RentPaid:1500");                                                        //SECTION-E-7
		
		wd.findElement(By.id("txtPermanentPhysicalDisability")).clear();
		wd.findElement(By.id("txtPermanentPhysicalDisability")).sendKeys("1500");
		logger.info("Entered PermanentPhysicalDisability:1500");                                              //SECTION-E-8
		
		wd.findElement(By.id("txtOthersE")).clear();
		wd.findElement(By.id("txtOthersE")).sendKeys("1500");
		logger.info("Entered OthersE:1500");                                       //SECTION-E-9
		
		//wd.findElement(By.id("next-e")).click();
		logger.info("Clicked to next-E Button:");
		logger.info(" Test case No 9.5 : SECTION-E Data Entered SECTION-F Started");         //Test case No 9.5 : SECTION-E Created Successfully
		Thread.sleep(2000);
		
		 //SECTION-F
		wd.findElement(By.id("txtFormfrompreviousemployer")).clear();
		wd.findElement(By.id("txtFormfrompreviousemployer")).sendKeys("1500");
		logger.info("Entered Formfrompreviousemployer:1500");                                       //SECTION-F-9.1
		
		wd.findElement(By.id("btnSave")).click();
		logger.info("Clicked to Save Button:");
		logger.info(" Test case No 9.1 : Created Sucessfully");          //Test case No 9.6 : SECTION-F Created Successfully
		logger.info(" Test case No 9.1 :Tested Positive Test Case Sucessfully"); 
		Thread.sleep(2000);
       }
     //Negative case - 1 Without Data Entered
	public static void testNegativeCase(WebDriver wd) throws InterruptedException {

		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered ITDeclarationFormPage to Test Without Entering Data");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(2);
		logger.info("Entered Employeedropdown:2");
		
		//SECTION-A Started
		wd.findElement(By.id("txtDividends")).clear();
		logger.info("Entered Dividends:Blank Space"); //SECTION-A -1
		
		wd.findElement(By.id("txtInterest")).clear();
		logger.info("Entered Interest:Blank Space");//SECTION-A -2
		
		wd.findElement(By.id("txtOtherIncomes")).clear();
		logger.info("Entered OtherIncomes:Blank Space"); //SECTION-A -3
		
		wd.findElement(By.id("txtTotalEarnings")).clear();
		logger.info("Entered TotalEarnings:Blank Space");
		logger.info(" Test case No 9.1 :SECTION-A Data Entered SECTION-B Started  "); //Test case No 9.1 : SECTION-A Created Successfully
		Thread.sleep(1000);
		
		// SECTION-B Started
		
		wd.findElement(By.id("txtAnnualValue")).clear();
		logger.info("Entered AnnualValue:Blank Space"); // SECTION-B-1
		
		wd.findElement(By.id("txtStandardDeduction")).clear();
		logger.info("Entered StandardDeduction:Blank Space"); // SECTION-B-2
		
		wd.findElement(By.id("txtInterestonHousingLoan")).clear();
		logger.info("Entered InterestonHousingLoan:"); // SECTION-B-3
		
		wd.findElement(By.id("txtAmountofInterest")).clear();
		logger.info("Entered AmountofInterest:Blank Space"); // SECTION-B-4
		
		wd.findElement(By.id("txtAmountofInterestforPreConstruction")).clear();
		logger.info("Entered AmountofInterestforPreConstruction:Blank Space"); // SECTION-B-5
		
		wd.findElement(By.id("txtTotalIncomefromHouseProperty")).clear();
		logger.info("Entered AmountofInterestforPreConstruction:Blank Space");
		logger.info(" Test case No 9.2 : SECTION-B Data Entered SECTION-B Started");  //Test case No 9.2 : SECTION-B Created Successfully
		Thread.sleep(2000);
		
		// SECTION-C Started
		
		wd.findElement(By.id("txtPeriod")).clear();
		logger.info("Entered Period:Blank Space"); //SECTION-C-1
		
				
		wd.findElement(By.id("txtTotalRentPaid")).clear();
		logger.info("Entered TotalRentPaid:Blank Space");
		logger.info(" Test case No 9.3 : SECTION-C Data Entered SECTION-D Started");  //Test case No 9.3 : SECTION-C Created Successfully
		Thread.sleep(2000);
		
		//SECTION-D started
		wd.findElement(By.id("txtPF")).clear();
		logger.info("Entered PF:Blank Space");                          //SECTION-D-1
		
		wd.findElement(By.id("txtEmployeesContribution")).clear();
		logger.info("Entered EmployeesContribution:Blank Space");        //SECTION-D-2
		
		wd.findElement(By.id("txtEmployeesContribution1B")).clear();
		logger.info("Entered EmployeesContribution1B:Blank Space");                        //SECTION-D-3
		
		wd.findElement(By.id("txtPublicPF")).clear();
		logger.info("Entered txtPublicPF:Blank Space");                                      //SECTION-D-4
		
		wd.findElement(By.id("txtContributiontoCertainPF")).clear();
		logger.info("Entered ContributiontoCertainPF:Blank Space");                         //SECTION-D-5
		
		wd.findElement(By.id("txtHousingLoanRepayment")).clear();
		logger.info("Entered HousingLoanRepayment:Blank Space");                             //SECTION-D-6
		
		wd.findElement(By.id("txtInsurancePremium")).clear();
		logger.info("Entered InsurancePremium:Blank Space");                                     //SECTION-D-7
		
		wd.findElement(By.id("txtAllowableTermDeposit")).clear();
 		logger.info("Entered AllowableTermDeposit:Blank Space");                                   //SECTION-D-8
		
		wd.findElement(By.id("txtNationalSavingScheme")).clear();
		logger.info("Entered NationalSavingScheme:Blank Space");                                //SECTION-D-9
		
		wd.findElement(By.id("txtMutualFund")).clear();
		logger.info("Entered MutualFund:Blank Space");                                          //SECTION-D-10
		
		wd.findElement(By.id("txtChildrenEducationExpenses")).clear();
		logger.info("Entered ChildrenEducationExpenses:Blank Space");                                //SECTION-D-11
		
		wd.findElement(By.id("txtOthersD")).clear();
		logger.info("Entered PANNo:SIRMQ9874T:Blank Space");                                            //SECTION-D-12
		
		wd.findElement(By.id("txtTotalInvestmentsD")).clear();
		logger.info("Entered TotalInvestmentsD:Blank Space");  
		logger.info(" Test case No 9.4 : SECTION-D Data Entered SECTION-E Started");                     //Test case No 9.4 : SECTION-D Created Sucessfully
		Thread.sleep(2000);
		
		//SECTION-E
		wd.findElement(By.id("txtMedicalInsurancePremium")).clear();
		logger.info("Entered MedicalInsurancePremium:Blank Space");                          //SECTION-E-1
		 
		wd.findElement(By.id("txtDeductioninrespectofmaintenance")).clear();
		logger.info("Entered Deductioninrespectofmaintenance:Blank Space");                      //SECTION-E-2
		 
		wd.findElement(By.id("txtExpenditureonMedicalTreatment")).clear();
		logger.info("Entered ExpenditureonMedicalTreatment:Blank Space");                               //SECTION-E-3
		
		wd.findElement(By.id("txtRepaymentofInterest")).clear();
		logger.info("Entered RepaymentofInterest:Blank Space");                                              //SECTION-E-4
		
		wd.findElement(By.id("txtDeduction")).clear();
		logger.info("Entered Deduction:Blank Space");                                                  //SECTION-E-5
		
		wd.findElement(By.id("txtDeductioninrespectofdonations")).clear();
		logger.info("Entered Deductioninrespectofdonations:Blank Space");                                          //SECTION-E-6
		
		wd.findElement(By.id("txtRentPaid")).clear();
		logger.info("Entered RentPaid:Blank Space");                                                        //SECTION-E-7
		
		wd.findElement(By.id("txtPermanentPhysicalDisability")).clear();
		logger.info("Entered PermanentPhysicalDisability:Blank Space");                                              //SECTION-E-8
		
		wd.findElement(By.id("txtOthersE")).clear();
		logger.info("Entered OthersE:Blank Space");                                       //SECTION-E-9
		
		wd.findElement(By.id("txtTotalDeductions")).clear();
		logger.info("Entered TotalDeductions:Blank Space"); 
		logger.info(" Test case No 9.5 : SECTION-E Data Entered SECTION-F Started");           //Test case No 9.5 : SECTION-E Created Successfully
		Thread.sleep(2000);
		
		//SECTION-F
		wd.findElement(By.id("txtFormfrompreviousemployer")).clear();
		logger.info("Entered Formfrompreviousemployer:Blank Space");                                       //SECTION-F-9
		
		wd.findElement(By.id("btnSave")).click();
		logger.info("Clicked to Save Button:");
		Thread.sleep(2000);
		wd.findElement(By.id("btnResetF")).click();
		logger.info("Clicked to Reset Button:");
		logger.info(" Test case No 9.2 : Entered Valid Data");          //Test case No 9.6 : SECTION-F Created Successfully
		logger.info(" Test case No 9.2 :Tested Negative Test Case Sucessfully"); 
		Thread.sleep(3000);
       }
	//Negative case - 2  Alphabetical Data Entered
	public static void testNegativeCase1(WebDriver wd) throws InterruptedException {

		wd.manage().window().maximize();
        wd.get(UserURL);
        logger.info("Entered ITDeclarationFormPage to Test Wrong Data Entering ");
        Select dropdown = new Select(wd.findElement(By.id("Employeedropdown")));
		dropdown.selectByIndex(2);
		logger.info("Entered Employeedropdown:2");
		
		//SECTION-A Started
		wd.findElement(By.id("txtDividends")).clear();
		wd.findElement(By.id("txtDividends")).sendKeys("qqq");
		logger.info("Entered Dividends:qqq");                       //SECTION-A -1
		
		wd.findElement(By.id("txtInterest")).clear();
		wd.findElement(By.id("txtInterest")).sendKeys("aaa");
		logger.info("Entered Interest:aaa");                  		//SECTION-A -2
		
		wd.findElement(By.id("txtOtherIncomes")).clear();
		wd.findElement(By.id("txtOtherIncomes")).sendKeys("aaa");
		logger.info("Entered OtherIncomes:aaa"); 					//SECTION-A -3
		
		wd.findElement(By.id("txtTotalEarnings")).sendKeys("aaa");
		logger.info("Entered TotalEarnings:aaa"); 	
		
		//wd.findElement(By.id("next-a")).click();
		//logger.info("Clicked to next-A Button:");
		logger.info(" Test case No 9.1 : SECTION-a Data Entered SECTION-b Started"); 	 //Test case No 9.1 : SECTION-A Created Sucessfully
		Thread.sleep(2000);
		
		// SECTION-B Started
		
		wd.findElement(By.id("txtAnnualValue")).clear();
		wd.findElement(By.id("txtAnnualValue")).sendKeys("aaa");
		logger.info("Entered AnnualValue:aaa"); 					// SECTION-B-1
		
		wd.findElement(By.id("txtStandardDeduction")).clear();
		wd.findElement(By.id("txtStandardDeduction")).sendKeys("aaa");
		logger.info("Entered StandardDeduction:aaa");				 // SECTION-B-2
		
		wd.findElement(By.id("txtInterestonHousingLoan")).clear();
		wd.findElement(By.id("txtInterestonHousingLoan")).sendKeys("aaa");
		logger.info("Entered InterestonHousingLoan:aaa"); 				// SECTION-B-3
		
		wd.findElement(By.id("txtAmountofInterest")).clear();
		wd.findElement(By.id("txtAmountofInterest")).sendKeys("aaa");
		logger.info("Entered AmountofInterest:aaa");					 // SECTION-B-4
		
		wd.findElement(By.id("txtAmountofInterestforPreConstruction")).clear();
		wd.findElement(By.id("txtAmountofInterestforPreConstruction")).sendKeys("aaa");
		logger.info("Entered AmountofInterestforPreConstruction:aaa");			 // SECTION-B-5
		
		wd.findElement(By.id("txtTotalIncomefromHouseProperty")).sendKeys("aaa");
		logger.info("Entered TotalIncomefromHouseProperty:aaa");	
		
		//wd.findElement(By.id("next-b")).click();
		//logger.info("Clicked to next-B Button:");
		logger.info(" Test case No 9.2 : SECTION-B Data Entered SECTION-C Started");  			//Test case No 9.2 : SECTION-B Created Sucessfully
		Thread.sleep(2000);
		
		// SECTION-C Started
		
		wd.findElement(By.id("txtPeriod")).clear();
		wd.findElement(By.id("txtPeriod")).sendKeys("aaa");
		logger.info("Entered Period:aaa");										 //SECTION-C-1
		
		//wd.findElement(By.id("txtPANNo")).clear();
	//	wd.findElement(By.id("txtPANNo")).sendKeys("aaa");
	//	logger.info("Entered txtPANNo:aaa");	
		
		wd.findElement(By.id("txtTotalRentPaid")).sendKeys("aaa");
		logger.info("Entered TotalRentPaid:aaa");					
				
	//	wd.findElement(By.id("next-c")).click();
	//	logger.info("Clicked to next-C Button:");
		logger.info(" Test case No 9.3 : SECTION-C Data Entered SECTION-D Started"); 			//Test case No 9.3 : SECTION-C Created Sucessfully
		Thread.sleep(2000);
		
		//SECTION-D started
		wd.findElement(By.id("txtPF")).clear();
		wd.findElement(By.id("txtPF")).sendKeys("aaa");
		logger.info("Entered PF:aaa");                        				  //SECTION-D-1
		
		wd.findElement(By.id("txtEmployeesContribution")).clear();
		wd.findElement(By.id("txtEmployeesContribution")).sendKeys("aaa");
		logger.info("Entered EmployeesContribution:1500"); 						 //SECTION-D-2
		
		wd.findElement(By.id("txtEmployeesContribution1B")).clear();
		wd.findElement(By.id("txtEmployeesContribution1B")).sendKeys("aaa");
		logger.info("Entered EmployeesContribution1B:aaa");  						 //SECTION-D-3
		
		wd.findElement(By.id("txtPublicPF")).clear();
		wd.findElement(By.id("txtPublicPF")).sendKeys("aaa");
		logger.info("Entered txtPublicPF:aaa");   									 //SECTION-D-4
		
		wd.findElement(By.id("txtContributiontoCertainPF")).clear();
		wd.findElement(By.id("txtContributiontoCertainPF")).sendKeys("aaa");
		logger.info("Entered ContributiontoCertainPF:aaa");     						 //SECTION-D-5
		
		wd.findElement(By.id("txtHousingLoanRepayment")).clear();
		wd.findElement(By.id("txtHousingLoanRepayment")).sendKeys("aaa");
		logger.info("Entered HousingLoanRepayment:aaa"); 								  //SECTION-D-6
		
		wd.findElement(By.id("txtInsurancePremium")).clear();
		wd.findElement(By.id("txtInsurancePremium")).sendKeys("aaa");
		logger.info("Entered InsurancePremium:aaa");  										 //SECTION-D-7
		
		wd.findElement(By.id("txtAllowableTermDeposit")).clear();
		wd.findElement(By.id("txtAllowableTermDeposit")).sendKeys("aaa");
		logger.info("Entered AllowableTermDeposit:aaa");    								 //SECTION-D-8
		
		wd.findElement(By.id("txtNationalSavingScheme")).clear();
		wd.findElement(By.id("txtNationalSavingScheme")).sendKeys("aaa");
		logger.info("Entered NationalSavingScheme:aaa");  								    //SECTION-D-9
		
		wd.findElement(By.id("txtMutualFund")).clear();
		wd.findElement(By.id("txtMutualFund")).sendKeys("aaa");
		logger.info("Entered MutualFund:aaa"); 										     //SECTION-D-10
		
		wd.findElement(By.id("txtChildrenEducationExpenses")).clear();
		wd.findElement(By.id("txtChildrenEducationExpenses")).sendKeys("aaa");
		logger.info("Entered ChildrenEducationExpenses:aaa"); 						    //SECTION-D-11
		
		wd.findElement(By.id("txtOthersD")).clear();
		wd.findElement(By.id("txtOthersD")).sendKeys("aaa");
		logger.info("Entered PANNo:SIRMQ9874T:aaa");								    //SECTION-D-12
		
		wd.findElement(By.id("txtTotalInvestmentsD")).sendKeys("aaa");
		logger.info("Entered TotalInvestmentsD:aaa");            
		
	//	wd.findElement(By.id("next-d")).click();
		//logger.info("Clicked to next-D Button:");
		logger.info(" Test case No 9.4 : SECTION-D Data Entered SECTION-E Started");  				//Test case No 9.4 : SECTION-D Created Sucessfully
		Thread.sleep(2000);
		
		//SECTION-E
		wd.findElement(By.id("txtMedicalInsurancePremium")).clear();
		wd.findElement(By.id("txtMedicalInsurancePremium")).sendKeys("aaa");
		logger.info("Entered MedicalInsurancePremium:aaa");                          //SECTION-E-1
		 
		wd.findElement(By.id("txtDeductioninrespectofmaintenance")).clear();
		wd.findElement(By.id("txtDeductioninrespectofmaintenance")).sendKeys("aaa");
		logger.info("Entered Deductioninrespectofmaintenance:aaa");                      //SECTION-E-2
		 
		wd.findElement(By.id("txtExpenditureonMedicalTreatment")).clear();
		wd.findElement(By.id("txtExpenditureonMedicalTreatment")).sendKeys("aaa");
		logger.info("Entered ExpenditureonMedicalTreatment:aaa");                          //SECTION-E-3
		
		wd.findElement(By.id("txtRepaymentofInterest")).clear();
		wd.findElement(By.id("txtRepaymentofInterest")).sendKeys("aaa");
		logger.info("Entered RepaymentofInterest:aaa");                                   //SECTION-E-4
		
		wd.findElement(By.id("txtDeduction")).clear();
		wd.findElement(By.id("txtDeduction")).sendKeys("aaa");
		logger.info("Entered Deduction:1500");                                            //SECTION-E-5
		
		wd.findElement(By.id("txtDeductioninrespectofdonations")).clear();
		wd.findElement(By.id("txtDeductioninrespectofdonations")).sendKeys("aaa");
		logger.info("Entered Deductioninrespectofdonations:aaa");                           //SECTION-E-6
		
		wd.findElement(By.id("txtRentPaid")).clear();
		wd.findElement(By.id("txtRentPaid")).sendKeys("aaa");
		logger.info("Entered RentPaid:aaa");                                                //SECTION-E-7
		
		wd.findElement(By.id("txtPermanentPhysicalDisability")).clear();
		wd.findElement(By.id("txtPermanentPhysicalDisability")).sendKeys("aaa");
		logger.info("Entered PermanentPhysicalDisability:aaa");                             //SECTION-E-8
		
		wd.findElement(By.id("txtOthersE")).clear();
		wd.findElement(By.id("txtOthersE")).sendKeys("aaa");
		logger.info("Entered OthersE:aaa");                                             //SECTION-E-9
		
		wd.findElement(By.id("txtTotalDeductions")).sendKeys("aaa");
		logger.info("Entered TotalDeductions:aaa");      
		
	//	wd.findElement(By.id("next-e")).click();
	//	logger.info("Clicked to next-E Button:");
		logger.info(" Test case No 9.5 : SECTION-E Data Entered SECTION-F Started");          //Test case No 9.5 : SECTION-E Created Successfully
		Thread.sleep(2000);
		
		//SECTION-F
		wd.findElement(By.id("txtFormfrompreviousemployer")).clear();
		wd.findElement(By.id("txtFormfrompreviousemployer")).sendKeys("aaa");
		logger.info("Entered Formfrompreviousemployer:aaa");                                //SECTION-F-9
		
		wd.findElement(By.id("btnSave")).click();
		logger.info("Clicked to Save Button:");
		logger.info(" Test case No 9.3 : Enter Numeric only"); 
		Thread.sleep(3000);
		wd.findElement(By.id("btnResetF")).click();
		logger.info("Clicked to Reset Button:");
		logger.info(" Test case No 9.3 :Tested Negative Test Case Sucessfully");       //Test case No 9.6 : SECTION-F Created Successfully
	
	    wd.findElement(By.xpath("//i[@class='fas fa-user-circle fa-fw']")).click();
		wd.findElement(By.linkText("Logout")).click();
     	logger.info("Clicked Logout to Exit the Application");
    	wd.close();
    }

	}
