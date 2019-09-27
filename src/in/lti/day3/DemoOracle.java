package in.lti.day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoOracle {
	  WebDriver driver;
		@Test(priority=1)
	  public void t1() {
			driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:7603201413900227708::NO:::");
		
			driver.findElement(By.cssSelector("input[name='p_t01']")).sendKeys("sys");
			driver.findElement(By.cssSelector("input[name='p_t02']")).sendKeys("Newuser123");
			WebElement E  = driver.findElement(By.cssSelector("input[type='BUTTON']"));
			E.click();

			
	  }
		
		
		@Test(priority=2)
		public void t2() {
			String title=driver.getTitle();
			Assert.assertEquals(title, "Oracle","Title didnt match");
			
		
			//WebElement E=driver.findElement(By.name("q"));
			//Assert.assertEquals(E.isDisplayed(), true);
			//Assert.assertTrue(E.isEnabled(),"element not enabled");
			// 	Assert.assertTrue(E.isSelected()); this is used for radio button and checkbox
		}
	
		@Test(priority=3)
		public void t3()
		{
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/a[1]/img[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/a[1]/img[1]")).click();
			WebElement E = driver.findElement(By.id("P1003_AUTOCOMMIT_0"));
			Assert.assertTrue(E.isEnabled(), "Element not enabled");
		}
		@BeforeTest
		  public void beforeTest() {
			  //pre condition
			  
			  //start the browser
			  
			  System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver=new ChromeDriver();	  
		  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
