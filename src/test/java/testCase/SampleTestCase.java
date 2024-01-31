package testCase;

import webDriverManager.DriverManager;

public class SampleTestCase
{
	public static void main(String[] args)
	{
		DriverManager ob = new DriverManager("https://automationexercise.com/"); //directly calling the class DriverManager
	}	
}
/*public class SampleTestCase extends DriverManager 
{
	
	public static void main(String[] args) // implemention using method in super class
	{
		launchBrowser("https://automationexercise.com/");

	}

}*/
