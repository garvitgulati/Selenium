package in.lti.day4;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCheck {
static WebDriver driver; //since before class is static ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		  System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
			 driver=new ChromeDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("http://www.newtours.demoaut.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	//	List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		//List<WebElement> allLinks=driver.findElements(By.cssSelector("a"));
		System.out.println("total links are"+allLinks.size());
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
	
	}

}
