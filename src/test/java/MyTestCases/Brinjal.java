package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Brinjal_page;

public class Brinjal extends BaseClass {
	@Test(priority=2,groups= {"sanity","invalid"})
	public void Brinjal() throws InterruptedException {
		
		
		Brinjal_page bp =  new Brinjal_page(driver);
		
		bp.searchitem();
		bp.increasequantity();
		
		
		
		
	}

}
