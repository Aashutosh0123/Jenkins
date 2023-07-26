package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Potato_page;

public class Potato extends BaseClass {
	@Test(priority=1,groups= {"sanity","invalid"})
	public void Potato() throws InterruptedException {
		
		
		Potato_page po = new Potato_page(driver);
		po.searchitem();
		po.searchbutton();
		po.increasequantity();
		po.cartaddedpot();
		
		
		

		
	}

}
