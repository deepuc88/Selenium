package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager
{
	public WebDriver driver;
	public DriverManager(String url) // Constructor used to get url
	{		
		driver = new ChromeDriver();
		driver.get(url);
	}
/*	public static void launchBrowser(String url) // implemented as method for getting url in webdriver.
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(url);
	} */
}
