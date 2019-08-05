package main.java.selenium;
import java.io.File;  
import java.util.concurrent.TimeUnit;  
//import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 

public class TakeScreenShot {

	public static void main(String[] args) throws Exception {  
	    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");   
	  WebDriver wd = new ChromeDriver() ;  
	   wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	    wd.manage().window().maximize();    
	     try{          
	       File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);   
	       FileUtils.copyFile(scrFile, new File("D:screenShot1.png"));  
	       System.out.println("Screenshot is captured and stored in your D: Drive");  
	     }    
	     catch (Exception e)  
	     {   
	       System.out.println("Error in loading the Google page");  
	     }   
	}
}
