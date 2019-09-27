package day5POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {
public LoginFactory(WebDriver driver)
{
	PageFactory.initElements(driver, this);//initialising with driver
}
	@FindBy(css = "input[value='Login']") //return type of findby is web element
	WebElement e_loginButton;
	WebElement P11_PASSWORD;
	
	
	WebElement P11_USERNAME;
	
	
	public void LoginProcesss(String UN,String pwd) {
		P11_USERNAME.sendKeys(UN);
		P11_PASSWORD.sendKeys(pwd);
		e_loginButton.click();
	}
}
