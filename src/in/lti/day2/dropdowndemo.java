package in.lti.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\1SEL\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://blazedemo.com/"); //opens url
    Select select=new Select(driver.findElement(By.name("fromPort")));
    
  //  select.selectByValue("Portland");
    select.selectByIndex(5);
    System.out.println(select.isMultiple());
    System.out.println(select.getFirstSelectedOption().getText());
    System.out.println(driver.findElement(By.name("fromPort")).getText()); //prints all the options
    
    Select select1=new Select(driver.findElement(By.name("toPort")));
    select1.selectByIndex(5);
    
    WebElement E  = driver.findElement(By.cssSelector("input[type='submit']"));
	E.click();
    
    
/*	WebElement E1  = driver.findElement(By.cssSelector("input[type='submit']"));
	E1.click();*/
    
	List<WebElement> flights=driver.findElements(By.cssSelector("input[type='submit']"));
	flights.get(2).click();
	driver.findElement(By.name("inputName")).sendKeys("Garvit");
	driver.findElement(By.name("address")).sendKeys("123 Main Street");
	driver.findElement(By.name("city")).sendKeys("Mumbai");
	driver.findElement(By.name("state")).sendKeys("Maharashtra");
	driver.findElement(By.name("zipCode")).sendKeys("411042");
	
	
	
	Select select2=new Select(driver.findElement(By.name("cardType")));
	select2.selectByIndex(0);
	
	
	
	driver.findElement(By.name("creditCardNumber")).sendKeys("4110417042");
	driver.findElement(By.name("creditCardMonth")).clear();
	driver.findElement(By.name("creditCardMonth")).sendKeys("12");
	
	driver.findElement(By.name("creditCardYear")).clear();
	driver.findElement(By.name("creditCardYear")).sendKeys("2018");
	driver.findElement(By.name("nameOnCard")).sendKeys("Garvit Gulati");
	
	driver.findElement(By.cssSelector("label[class='checkbox']")).click();
	
	
	WebElement E2  = driver.findElement(By.cssSelector("input[type='submit']"));
	E2.click();
	
	
	}

}
