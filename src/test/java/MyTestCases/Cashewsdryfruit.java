package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Cashewsdrtfruit_page;

public class Cashewsdryfruit extends BaseClass {
	@Test(priority=7,groups= {"sanity","invalid"})
	
	public void Cashewsdryfruit() throws InterruptedException {
		
		Cashewsdrtfruit_page cas = new Cashewsdrtfruit_page(driver);
				
				cas.searchcashew();
				cas.addingcashew();
		
		
		
		
		
		
	}
	

}
