package in.lti.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bingAction {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			   Actions action=new Actions(driver);
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebDriverWait wt=new WebDriverWait(driver,20);
				driver.get("https://www.bing.com/?toWww=1&redig=28779C37C88B40CD9AAF247235C8FCAC");
				WebElement E=driver.findElement(By.name("q"));
				
			Action a=	action.keyDown(Keys.SHIFT).sendKeys(E,"lti").doubleClick(E).contextClick(E).build();//to keep shift key pressed

			a.perform();
	}

}
