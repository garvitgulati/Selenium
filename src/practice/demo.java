package practice;
import util.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.Assert;

public class demo extends basic{
  @Test
  
  public void f() throws FileNotFoundException, IOException, InterruptedException {
	  
	  driver.get("https://www.meripustak.com/");
	Dimension a = driver.findElement(By.xpath("/html/body/form/div[4]/nav/div[1]/div[1]/a/img")).getSize();
	System.out.println(a);
	  JavascriptExecutor JS=(JavascriptExecutor)driver;
	  JS.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/form/footer/div/div[6]/div/a[1]/i")));
	  String url=driver.findElement(By.xpath("/html/body/form/footer/div/div[6]/div/a[1]")).getAttribute("href");
		 System.out.println("href of facebook is"+url); 
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/form/div[4]/nav/div[1]/div[2]/div[2]/a[2]")).click();
/*String b= driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/table/tbody/tr[2]/td/div/table/tbody/tr/td/h4")).getText();*/
String b= driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_gvCartTable']/tbody/tr/td/h4")).getText();
Assert.assertEquals(b ,"No Item is Added In Cart yet.Cart is Empty!!!","valid");
 /*driver.findElement(By.linkText("Taxation "));
 driver.findElement(By.xpath("//*[@id=\"162548\"]"));
 String c= driver.findElement(By.tagName("h4")).getText();
 Assert.assertEquals(c ,"No Item is Added In Cart yet.Cart is Empty!!!","invalid");*/
 
  }
}
