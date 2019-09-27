package in.lti.day5;
import util.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Scrolling extends basic{
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.seleniumhq.org/");
	/*  since we pass the reference of web driver
	  and pass */
/*	  Java Script executer is the parent of chrome and firefox driver*/
	  JavascriptExecutor JS=(JavascriptExecutor)driver;
	  JS.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("Selenium blog"))); //scrolling by some blog or link
	 //till the time that element is not viewed it will scroll
	  Thread.sleep(3000);
	  JS.executeScript("window.scrollBy(0,-500)"); //pixel by pixel scrolling
	  Thread.sleep(3000);
	  JS.executeScript("window.scrollBy(0,-.document.body.scrollHeight)");//it scrolls to maximum height,,,,the '-' sign indicates to the top of browser
  //scroll will calculate the height and then goes to bottom
  }
}
