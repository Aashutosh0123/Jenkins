package BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CommonUtilities.CommonUtiles;

public class BaseClass {
	public static WebDriver driver;
	
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	
	
	public static ExtentReports extent;
	
	public static ExtentTest extentTest;
	
	
	static
	
	
	
	{
		
		//path of the config file here
		try
		{
			file=new File("./Resources/Config.properties");
			fis=new FileInputStream(file);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	@BeforeSuite (groups= {"sanity", "invalid"})                     
	  public void setExtent(){
		  extent = new ExtentReports("./reports/ExtentReport.html");
		  
	  }
	
	@AfterSuite  (groups= {"sanity", "invalid"})
	public void endReport() {
		extent.flush();
		extent.close();
	}
	
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public void initializeWebDriver() {
		CommonUtiles c= new CommonUtiles();
		c.driverSetup();
		
	}
	
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public void navigateSite() {
		CommonUtiles c1= new CommonUtiles();
		c1.getUrl();
	}
	
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public void startTest(Method name) {
		String testname = name.getName();
		extentTest = extent.startTest(testname);
	}
	
	
	
	
	@AfterMethod (groups= {"sanity", "invalid"})
	public void resultTest(ITestResult result) throws IOException {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
			String imagePath = ScreenShotsCapture.screenshot.capturescreenshot(driver,result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(imagePath));
			
			
			
			
		}
		else {
			if(result.getStatus() == ITestResult.SUCCESS) {
				extentTest.log(LogStatus.PASS, "Test case passed successfully");	
				
			}
		}
		extent.endTest(extentTest);
		driver.quit();
		
		
		
	}
//	@AfterClass(groups= {"sanity", "invalid"})
//		public void driverclose()
//		{		
//		driver.quit();
//		
//	}
	
	static
	
	
	
	{ 
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "./Resources/log4j2.xml";
		Configurator.initialize(null,log4jConfigFile);
	}
			public static Logger logger = LogManager.getLogger(BaseClass.class.getName());
	

}