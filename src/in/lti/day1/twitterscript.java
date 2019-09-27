package in.lti.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitterscript {
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://twitter.com/login"); //opens url

			driver.findElement(By.cssSelector("input[placeholder='Phone, email or username']")).sendKeys("LTI");
			driver.findElement(By.cssSelector("div[class='clearfix field'] input[placeholder='Password']")).sendKeys("LTI123");
			WebElement E  = driver.findElement(By.cssSelector("button[type='submit']"));
			E.click();
	}
	

}
