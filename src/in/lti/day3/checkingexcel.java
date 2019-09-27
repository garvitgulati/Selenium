package in.lti.day3;
import util.basic;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class checkingexcel extends basic {
	
	@Test
	public void f() throws FileNotFoundException, IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(".\\Book2.xlsx"));
		XSSFSheet sheet=wb.getSheet("Sheet1");
	
		for(int i = 1;i<=sheet.getLastRowNum();i++)
		{
			String user=sheet.getRow(i).getCell(0).toString();
			String pass=sheet.getRow(i).getCell(1).toString();
	
			 driver.get("http://127.0.0.1:8080/htmldb");
				
				driver.findElement(By.cssSelector("input[name='p_t01']")).sendKeys(user);
				driver.findElement(By.cssSelector("input[name='p_t02']")).sendKeys(pass);
				WebElement E  = driver.findElement(By.cssSelector("input[type='BUTTON']"));
				E.click();
				if(driver.getTitle().equals("Oracle"))
				{
					System.out.println("login successfull");
					
					driver.findElement(By.linkText("Logout")).click();
				}
				else
				{
					System.out.println("invalid");
				}
		}
	}


}
