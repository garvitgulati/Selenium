package in.lti.day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import util.basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;
import day5POM.LoginFactory;
import day5POM.WelcomeFactory;

public class CSVExample extends basic{
  @Test(dataProvider="dp")
  public void f(String UN,String PWD) throws IOException {
	  
	
	  CSVReader cs=new CSVReader(new FileReader(".//data.csv"));
List<String[]>allData = cs.readAll();
for(int i=1;i<allData.size();i++)
{
	 UN=allData.get(i)[0];	
	 PWD=allData.get(i)[1];
	driver.get("http://127.0.0.1:8080/htmldb");
	
	LoginFactory Login=new LoginFactory(driver);
	WelcomeFactory WF=new WelcomeFactory(driver);
	Login.LoginProcesss(UN,PWD);
	try {
	WF.logoutClick();
	System.out.println("Login Pass");
	      }
	catch(Exception e)
	{
		System.out.println("Login Failed");
	}
}

  }
  
  @DataProvider
  public Object[][] dp()
  {
	  Object[][] arrayData=null;
	  try {
	  CSVReader cs=new CSVReader(new FileReader(".//data.csv"));
List<String[]>allData = cs.readAll();
System.out.println(allData.size()-1);
 arrayData=new Object[allData.size()-1][allData.get(0).length];

for(int i=0;i<allData.size()-1;i++)
{
	arrayData[i][0]=allData.get(i)[0];
	arrayData[i][1]=allData.get(i)[1];
}
 }catch(Exception e)
	  {
	 e.printStackTrace();
	  }
	  return arrayData;
  }
  
}
