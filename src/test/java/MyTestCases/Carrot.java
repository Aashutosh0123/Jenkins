package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Carrot_page;

public class Carrot extends BaseClass {
	@Test(priority=10,groups= {"sanity","invalid"})
	
	public void Carrot() throws InterruptedException {
	
	Carrot_page cp = new Carrot_page(driver);
	
	cp.searchitem();
	cp.addquantity();
	}

}
