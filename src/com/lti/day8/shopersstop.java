package com.lti.day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import util.basic;
import util.Keywords;;

public class shopersstop extends basic {
  @Test
  public void f() {
	  driver.get("https://www.shoppersstop.com");
	  Actions action=new Actions(driver);
	  action.moveToElement(driver.findElement(By.linkText("MEN"))).perform();
	  action.moveToElement(driver.findElement(By.linkText("Shoes"))).perform();
	  
	  String shoes=driver.findElement(By.xpath("/html/body/main/nav/div[2]/div/ul/li[4]/div/div/ul/li[3]/div/ul/li[1]/div/ul")).getText();
   System.out.println(shoes);
   System.out.println("************************");
   
   driver.findElement(By.linkText("All Stores")).click();
   
   Keywords key = new Keywords(driver);
   key.dropdown("id:=city-name","Pune");
   
   
   Select select=new Select(driver.findElement(By.id("selectedPOS")));
   List<WebElement> ls=select.getOptions();
	
	for(WebElement el:ls)
	{
		System.out.println(el.getText());
	}
	
	try
	{
		 Keywords key2 = new Keywords(driver);
		 key2.dropdown("id:=city-name","Chennai");
		 Select select2=new Select(driver.findElement(By.id("selectedPOS")));
		   List<WebElement> ls2=select2.getOptions();
			
			for(WebElement el:ls2)
			{
				System.out.println(el.getText());
			}
		   
	}catch(Exception e)
	{
		System.out.println("Stores not available in this city");
	}
	
  }
}
