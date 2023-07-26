package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Mango_page;

public class Mango extends BaseClass{
	@Test(priority=6,groups= {"sanity","invalid"})
	
	public void Mango() throws InterruptedException {
		
		Mango_page mp = new Mango_page(driver);
			
			mp.seachfieldmango();
			mp.increasemango();
			
		
		
		
		
	}

}
