package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Topdeals_page;

public class Topdeals extends BaseClass {
	
	@Test(priority=3,groups= {"sanity","invalid"})
	
	public void Topdeals() throws InterruptedException {
		
		
		Topdeals_page tp = new Topdeals_page (driver);
		
		tp.hitattop();
		tp.hitonnext();
		tp.hitonfirst();
	}

}
