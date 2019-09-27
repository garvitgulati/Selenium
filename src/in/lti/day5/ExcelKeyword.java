package in.lti.day5;

import org.testng.annotations.Test;
import util.basic;
import util.ExcelReader;
import util.Keywords;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class ExcelKeyword extends basic{
  @Test(dataProvider = "dp")
  public void f(String key,String Locator,String data) throws IOException {
	  Keywords Key=new Keywords(driver);
	  switch(key)
	  {
	  case "getURL":
		  Key.getURL(data);
		  break;

	  case "type":
		  Key.type(Locator, data);
		  break;	
	  case "click":
		  Key.click(Locator);
		  break;		  
	  case "takeScreenShot":
		  Key.takeScreenShot(data);
		  break;	
	  case "closeBrowser":
		  Key.closeBrowser();
		  break;
	  case "dropdown":
		  Key.dropdown(Locator, data);
		  break; 
		  default:
			  System.out.println("invalid");
	  }
  }

  @DataProvider
  public Object[][] dp() throws FileNotFoundException, IOException {
 
ExcelReader ex=new ExcelReader(".//TestCase.xls");
Object[][] allKey=ex.getAllData("sheet1", 23, 3);
return allKey;
  
  }
}
