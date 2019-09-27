package in.lti.day2;

import java.util.concurrent.TimeUnit;
import java.util.*; 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ugc {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		   Actions action=new Actions(driver);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			driver.get("https://ugc.ac.in/");
			String PID =driver.getWindowHandle();
			//action.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).perform();
			   action.moveToElement(driver.findElement(By.linkText("Universities"))).perform();
			   action.keyDown(Keys.SHIFT).click(driver.findElement(By.linkText("Central Universities"))).perform();
			
			   Set<String> ALL_ID=driver.getWindowHandles(); //collects all window ids
			
			   //i want switch to child tab,print title and close it
			   Iterator iterator = ALL_ID.iterator();
			  for(String C:ALL_ID)
			   {
				   if(!(C.equals(PID)))
				   {
					   driver.switchTo().window(C);
					   System.out.println("You was on"+driver.getTitle()+"Page");
					   driver.close(); //closing the child tab/
				   }
			   }
			 /*  while (iterator.hasNext()) 
			   
			   {
				   if(!(iterator.equals(PID)))
				   {
					   driver.switchTo().window(iterator);
					   System.out.println("You was on"+driver.getTitle()+"Page");
					   driver.close(); //closing the child tab/
				   }
			   }*/
			driver.switchTo().window(PID);
			Thread.sleep(3000);
			driver.quit();
	}

}
