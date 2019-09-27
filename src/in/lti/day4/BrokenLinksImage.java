package in.lti.day4;
import util.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinksImage extends basic{
  @Test
  public void f() throws IOException {
	  driver.get("http://bing.com");
	  
	  List<WebElement> LinkImage=driver.findElements(By.tagName("a"));
	  LinkImage.addAll(driver.findElements(By.xpath("//img")));
	  
	  for(int i=0;i<LinkImage.size();i++)
	  {
		  String url=LinkImage.get(i).getAttribute("href");
	  
try {	  
	
	  
	  URL U=new URL(url);
	  Proxy webProxy=new Proxy(Proxy.Type.HTTP,new InetSocketAddress("192.168.100.1",8081));
	  
	  URLConnection UC=U.openConnection(webProxy);
	  
	  HttpURLConnection HUC=(HttpURLConnection)UC;
	  HUC.connect();
	  
	  int status=HUC.getResponseCode();
	  if(status==200)
	  {
		  System.out.println(url+"is working");
		  
	  }
	  else
	  {
		  System.out.println(url+"is not working");
	  }
  }
  catch(Exception e)
  {
	  System.out.println(url);
	 
  }
	  }
}
}