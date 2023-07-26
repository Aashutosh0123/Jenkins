package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Bookflight_page;

public class Bookflight extends BaseClass {
	
	@Test(priority=9,groups= {"sanity","invalid"})
	
	public void Bookflight() throws InterruptedException {
		
		Bookflight_page fb = new Bookflight_page(driver);
		 fb.flighthit();
		 fb.countryinsert();
		
		
		
	}

}
