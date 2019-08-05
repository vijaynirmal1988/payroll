package main.java.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {
	 public static String HOSTNAME = "http://localhost:8080";
		

		public static void main(String[] args) throws Exception {

			org.apache.log4j.PropertyConfigurator.configure("C:\\Users\\hp\\eclipse-workspace\\Payroll\\src\\Log4j.properties");

       	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			WebDriver wd = new ChromeDriver();

		    	// test all the positive Scenarios
			
			  TestLoginPage.testLogin(wd);     //test case:1.1

	     	  // TestCreateEmployeePage.testCreateemployee(wd); //test case:2.1

    		 // TestSalarymasterPage.testSalararymaster(wd);   //test case:3 
	    		
	    		
		  //  TestDashboardPage.testDashboard(wd);           // test case:4
    	
    	  //  TestWorkedUnitsPage.testWorkedUnits(wd);    // test case:5
		// TestDashboardPage.testSalaryTransation(wd);  // test case:6
		
   	      DatabaseTesting testconnection= new DatabaseTesting();
   	             testconnection.setUp();
   		         testconnection.test();
   		     
         // TestSalarytransactionPage.testsalarytransaction(wd);  // test case:7
		     
          DatabaseTesting testconnection1= new DatabaseTesting();
             testconnection1.setUp();
	         testconnection1.test();
		    	   
		     
			   
			  TestIncomeTaxPage.testIncomeTax(wd); // test case:8
	    		
			     
			 
	//	TestITDeclarationFormPage.testITDeclarationForm(wd); // test case:9

			            }

}

