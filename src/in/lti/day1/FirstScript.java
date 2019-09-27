package in.lti.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/"); //opens url

		WebElement E=driver.findElement(By.linkText("Download")); //finding element
		E.click();
		String title=driver.getTitle();
		System.out.println("you are on "+title+"Page");
		
		driver.findElement(By.name("q")).sendKeys("LTI"); //typing in text field
		//driver.quit(); //closes browser
	}

}
