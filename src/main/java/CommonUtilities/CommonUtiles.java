package CommonUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import BaseTest.BaseClass;

public class CommonUtiles extends BaseClass {

	public void driverSetup()
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aashutosh\\eclipse-workspace\\Aashutosh_Selenium_Assignmenet\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		// this for window maximize
		driver.manage().window().maximize();
		// to delete all cookies
		driver.manage().deleteAllCookies();
		// this is pageload timeout
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	
	
	public void getUrl()
	
	
	{
		driver.get(prop.getProperty("url"));
		// getting url
	}


}
