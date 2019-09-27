package in.lti.day5;
import util.Keywords;
import util.basic;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExecuteKey extends basic{
  @Test
  public void f() throws IOException {
	  Keywords key=new Keywords(driver);
	  driver.get("http://blazedemo.com");
	/*  key.type("name:=q", "Keyword driven framework");
	  key.click("id:=sb_form_go");
	  key.takeScreenShot(".//assignment.png");*/
	  key.dropdown("name:=fromPort", "Boston");
  }
}
