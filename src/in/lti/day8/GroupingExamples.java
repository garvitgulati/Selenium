package in.lti.day8;

import org.testng.annotations.Test;

public class GroupingExamples {
  @Test(groups= {"smoke","regression"})
  public void f1() {
	  
	  System.out.println("in smoke and regression");
  }
  @Test(groups= {"regression"})
  public void f2() {
	  System.out.println("in regression");
  }
  @Test(groups= {"smoke"})
  public void f3() {
	  System.out.println("in smoke");
  }
  @Test(groups= {"sanity"})
  public void f4() {
	  System.out.println("in sanity");
  }
}
