package testCase;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


import webDriverManager.DriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class InitialTestCaseURLCheck 
{
	public WebDriver driver; // declares driver variable in the TestNG class.
  @Test
  public void checkUrl() 
  {
	  String currentUrl = driver.getCurrentUrl();
	  Assert.assertEquals(currentUrl, "https://automationexercise.com/");
  }
  
  @Test
  public void checkTitle() 
  {
	  String currentTitle = driver.getTitle();
	  Assert.assertEquals(currentTitle, "Automation Exercise");
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  DriverManager ob = new DriverManager("https://automationexercise.com/");
	  this.driver = ob.driver; // this.driver is the driver variable declared in this class.
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
