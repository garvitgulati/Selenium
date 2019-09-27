package in.lti.day2;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenCapture {

	public static void main(String[] args) throws IOException{
		  System.setProperty("webdriver.gecko.driver","D:\\1SEL\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			TakesScreenshot screen=(TakesScreenshot)driver;
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.bing.com/?toWww=1&redig=28779C37C88B40CD9AAF247235C8FCAC");
	        File src= screen.getScreenshotAs(OutputType.FILE);
Date date=new Date();
	        String newDate=date.toString().replaceAll(" ", "_").replaceAll(":"," _");
	        System.out.println(newDate);
	     FileHandler.copy(src, new File(".//bing"+newDate+".png")); //all function are static
	    
	
	}

}
