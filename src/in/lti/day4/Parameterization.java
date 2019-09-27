package in.lti.day4;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.TakesScreenshot;
import util.ExcelReader;
import util.basic;
public class Parameterization extends basic{
  @Test(dataProvider = "dp")
  public void f(String un, String pwd) {
/*	  System.out.println(un+""+pwd);*/
driver.get("http://127.0.0.1:8080/htmldb/");
driver.findElement(By.name("p_t01")).clear();
driver.findElement(By.name("p_t01")).sendKeys(un);
driver.findElement(By.name("p_t02")).clear();
driver.findElement(By.name("p_t02")).sendKeys(pwd);
driver.findElement(By.cssSelector("input[value='Login']")).click();
Assert.assertEquals(driver.getTitle(), "Oracle","Login Failed");
driver.findElement(By.linkText("Logout")).click();
driver.findElement(By.linkText("Login")).click();
  }
@AfterMethod
public void afterMethod(ITestResult arg)
{
	if(arg.getStatus()==ITestResult.FAILURE)
	{
		   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   Date date=new Date();
		   	        String newDate=date.toString().replaceAll(" ", "_").replaceAll(":"," _");
		   	        System.out.println(newDate);
		   	        try {
		   	     FileHandler.copy(src, new File(".//"+arg.getName()+newDate+".png"));
		   	        }
		   	        catch(IOException e)
		   	        {
		   	        	System.out.println("error");
		   	        }
		   	        }
}
  @DataProvider
  public Object[][] dp() throws FileNotFoundException, IOException {  
  
//a place to store data used for data driven testing
	  ExcelReader excel=new ExcelReader(".//Book2.xlsx");
	  /*Object data[][]=new Object[4][2];
	   data[0][0]="System";
	  data[0][1]="Newuser123";
	  data[1][0]="tester2";
	  data[1][1]="tester2";
	  data[2][0]="tester3";
	  data[2][1]="tester3";
	  data[3][0]="hr";
	  data[3][1]="hr";  */
   Object[][] data=excel.getAllData("sheet1", 4, 2);
	  return data;
  }
  }

