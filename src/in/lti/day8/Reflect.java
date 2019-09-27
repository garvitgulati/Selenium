package in.lti.day8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Reflect {
  @Test
  public void f() throws ClassNotFoundException {
	  Class cl=Class.forName("org.openqa.selenium.chrome.ChromeDriver");
	  Field[] fd=cl.getDeclaredFields();
	  for(Field f:fd)
	  {
		  System.out.println(f.getName());
	  }
	  System.out.println(cl.getSuperclass());
	  System.out.println("methods are>>>>>>>>>>>>");
	  Method[] MD=cl.getMethods();
	  for(Method M:MD)
	  {
		  System.out.println(M.getName());
	  }
  }
}
