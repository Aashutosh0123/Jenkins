package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Corn_page;

public class Corn extends BaseClass{
	@Test(priority=5,groups= {"sanity","invalid"})
	
	public void Corn() throws InterruptedException {
		
		
		Corn_page cp= new Corn_page(driver);
		
		cp.searchingforcorn();
		cp.addingquantity();
	}

}
