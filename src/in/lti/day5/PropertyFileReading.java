package in.lti.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PropertyFileReading {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  WebDriver driver = null;
	   Properties prop=new Properties();
	   prop.load(new FileInputStream(".//Settings.property"));
	   System.out.println(prop.getProperty("url"));
	   
	   if(prop.getProperty("browser").equals("chrome")) {
		   System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
		  driver=new ChromeDriver();
	   }
	   else  if(prop.getProperty("browser").equals("firefox"))
	   {
		   System.setProperty("webdriver.gecko.driver","D:\\1SEL\\geckodriver.exe");
		 driver=new FirefoxDriver();
	   }
	   
	   driver.get(prop.getProperty("url"));
	   
	   driver.findElement(By.xpath(prop.getProperty("search"))).sendKeys("lti");
	   driver.findElement(By.xpath(prop.getProperty("searchButton"))).click();
  }
}
