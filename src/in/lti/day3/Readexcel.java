package in.lti.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.Test;

public class Readexcel {
	WebDriver driver;
	@Test(priority=1)
	public void f() throws FileNotFoundException, IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(".\\Book2.xlsx"));
		XSSFSheet sheet=wb.getSheet("Sheet1");
	
		for(int i = 0;i<=sheet.getLastRowNum();i++)
		{
			String data=sheet.getRow(i).getCell(0).toString();
			System.out.println(data);
			 driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:7603201413900227708::NO:::");
				
				driver.findElement(By.cssSelector("input[name='p_t01']")).sendKeys(data);
				driver.findElement(By.cssSelector("input[name='p_t02']")).sendKeys(data);
				WebElement E  = driver.findElement(By.cssSelector("input[type='BUTTON']"));
				E.click();
		}
	
		
	}
	
	
	
	
}
