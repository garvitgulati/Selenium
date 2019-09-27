package day5POM;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelReader;
import util.basic;
public class executePOM extends basic{
  @Test(enabled=false)
  public void f() {
  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:6923971976430341885::NO:::");
  LoginPOM Login=new LoginPOM(driver);
  Login.loginProcess("sys", "Newuser123");
 
  Assert.assertEquals(driver.getTitle(),  "Oracle","Login Failed");
  WelcomePOM welcome=new WelcomePOM(driver);
  welcome.logoutClick();
  }
  
  
  @Test(enabled=false)
  public void f1() {
  driver.get("http://127.0.0.1:8080/htmldb/");
  LoginFactory Login=new LoginFactory(driver);
  Login.LoginProcesss("sys", "Newuser123");
 
  Assert.assertEquals(driver.getTitle(),  "Oracle","Login Failed");
  WelcomeFactory welcome=new WelcomeFactory(driver);
  welcome.logoutClick();
  }
  
  
  @Test(enabled=true,dataProvider="dp",description="it is using page factory method")
  public void f2(String UN,String pwd) {
  driver.get("http://127.0.0.1:8080/htmldb/");
  LoginFactory Login=new LoginFactory(driver);
  Login.LoginProcesss(UN, pwd);
 
  Assert.assertEquals(driver.getTitle(),  "Oracle","Login Failed");
  WelcomeFactory welcome=new WelcomeFactory(driver);
  welcome.logoutClick();
  }
  @DataProvider
  public Object[][] dp() throws FileNotFoundException, IOException
  {
	ExcelReader ex=new ExcelReader(".//Book2.xlsx");  
	Object data[][]=ex.getAllData("sheet1", 4, 2);
	return data;
  }
  }

