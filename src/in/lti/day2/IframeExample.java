package in.lti.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeExample {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		   Actions action=new Actions(driver);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebDriverWait wt=new WebDriverWait(driver,20);
			driver.get("http://192.168.100.26:9090/iframe.html");
           driver.switchTo().frame(0); //to focus on iframe
           driver.findElement(By.linkText("Download")).click();//click on web element
           driver.switchTo().defaultContent();//focuss back to default frame
           driver.switchTo().frame(1);
           driver.findElement(By.id("P11_USERNAME")).sendKeys("Garvit");;
           driver.switchTo().defaultContent();
           driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe[3]")));
	      driver.findElement(By.linkText("REGISTER")).click();
	}

}
