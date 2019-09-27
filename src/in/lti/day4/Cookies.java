package in.lti.day4;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cookies {
static WebDriver driver; //since before class is static ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		  System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
			ChromeOptions ch=new ChromeOptions();
			ch.addArguments("--headless"); //without opening browser to reduce the time of execution
			//since rendering time which is minimised for user.
		  driver=new ChromeDriver(ch);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("http://127.0.0.1:8080/htmldb/");
		driver.findElement(By.name("p_t01")).clear();
		driver.findElement(By.name("p_t01")).sendKeys("sys");
		driver.findElement(By.name("p_t02")).clear();
		driver.findElement(By.name("p_t02")).sendKeys("Newuser123");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
	   Set<Cookie> ALL_COOKIE=driver.manage().getCookies();
	   
	   for(Cookie C:ALL_COOKIE)
	   {
		   System.out.println("domain name is "+C.getDomain());
		   System.out.println("Name is "+C.getName());
		   System.out.println("Path is "+C.getPath());
		   System.out.println("Value is "+C.getValue());
		   System.out.println("Expiriy is "+C.getExpiry());
	   }
	   
	   driver.manage().deleteAllCookies();
	   driver.navigate().refresh();
	   //driver.navigate().to(" ").to(new URL);
	 //  driver.get(" "); //wait for page to get load fully
	   
	   
	  assertEquals(driver.getTitle(),"HTML DB Login" );
		/*List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	//	List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		//List<WebElement> allLinks=driver.findElements(By.cssSelector("a"));
		System.out.println("total links are"+allLinks.size());
		for(int i=0;i<=allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}*/
	
	}

}
