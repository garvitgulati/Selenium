package in.lti.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			
				WebDriverWait wt=new WebDriverWait(driver,20);
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://opensource-demo.orangehrmlive.com/"); //opens url
             
				driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("admin");
				driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
				
				WebElement E  = driver.findElement(By.cssSelector("input[type='submit']"));
				E.click();
				
			
				driver.findElement(By.linkText("Welcome Admin")).click();
			//	driver.findElement(By.cssSelector(href="/index.php/auth/logout")).click();
				//Thread.sleep(2000);
				
				wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
				driver.findElement(By.linkText("Logout")).click();
				
	}

}
