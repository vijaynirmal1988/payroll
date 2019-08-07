package main.java.selenium;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 

public class TakeScreenShot {
	public static void screenShot() throws IOException, InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");   
	    WebDriver wd = new ChromeDriver() ;  
	    wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	    wd.manage().window().maximize();    
	     try{  
	    	   wd.get("http://localhost:8080/meeting/newemployee.html");
	           wd.navigate().refresh();
	           wd.findElement(By.xpath("//*[@id='createEmpBt']")).click();
	      
	      
	     }  catch (Exception e)  {
	     File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE); 
	     
	       FileUtils.copyFile(scrFile, new File("D:/Payroll/Selenium/screenshot_"+timestamp()+".png"));  
	     }
	       System.out.println("Error in loading the  page");  
	        
	

}

	private static String timestamp() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}