package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Beans_page;

public class Beans extends BaseClass {
	@Test(priority=4,groups= {"sanity","invalid"})
	
	public void Beans() throws InterruptedException {
		
		
		Beans_page bp = new Beans_page(driver);
		bp.fieldsearch();
		logger.info("n");
		bp.addquantity();
		bp.cartadd();
		
		
		
		
		
		
	}

}
