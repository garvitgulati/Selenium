package in.lti.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		   Actions action=new Actions(driver);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebDriverWait wt=new WebDriverWait(driver,20);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			
			
			driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
			
			WebElement E  = driver.findElement(By.cssSelector("input[type='submit']"));
			E.click();
			
			action.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).perform();
			action.moveToElement(driver.findElement(By.id("menu_leave_Configure"))).perform();
			action.click(driver.findElement(By.id("menu_leave_defineLeavePeriod"))).perform();
	}

}
