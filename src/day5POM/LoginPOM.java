package day5POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	WebDriver driver;
	LoginPOM(WebDriver driver){
		this.driver=driver;
		//we cant extends base class so we use it as there is no is a relationship
	}
By e_un=By.id("P11_USERNAME");//return type is by
By e_pwd=By.id("P11_PASSWORD");
By e_Login=By.cssSelector("input[value='Login']");
By e_GetStart=By.cssSelector("input[value='Getting Started']");

public void loginProcess(String un,String pwd) {
	driver.findElement(e_un).sendKeys(un);
	driver.findElement(e_pwd).sendKeys(pwd);
	driver.findElement(e_Login).click();
}

public void getStartClick()
{
	driver.findElement(e_GetStart).click();
}
}
