package in.lti.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.basic;
public class AlertExample  extends basic {
  @Test
  public void f(){
	  driver.get("https://www.magneticautomation.in/2019/01/alert-example.html");
	  driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
	  Alert A=driver.switchTo().alert();
	  System.out.println(A.getText());
	  A.sendKeys("Garvit");
	  
	  A.accept(); //for pressing on okay button
	  //A.dismiss(); //it will click on cancel
  }
}
