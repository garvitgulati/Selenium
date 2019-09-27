package in.lti.day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstNG {
 
	
	  WebDriver driver;
	@Test(priority=1)
  public void googleTest() {
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google","Title didnt match");
		
  }
	
	@Test(priority=2)
	public void a() {
		WebElement E=driver.findElement(By.name("q"));
		Assert.assertEquals(E.isDisplayed(), true);
		Assert.assertTrue(E.isEnabled(),"element not enabled");
		// 	Assert.assertTrue(E.isSelected()); this is used for radio button and checkbox
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
	  //post condition
	  driver.quit();
  }

}
