package in.lti.day6;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridConnect {
  @Test
  public void f() {
	  
	  DesiredCapabilities dc=DesiredCapabilities.chrome();
	  dc.setPlatform(Platform.WINDOWS);
	  dc.setBrowserName("chrome");
	  
	  
	 // WebDriver driver=new RemoteWebDriver(new URL("nodes ip address"),dc)
  }
}
