package MyTestCases;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PageObjectModel.Nutsmixture_page;

public class Nutsmixture extends BaseClass {
	
	@Test(priority=8,groups= {"sanity","invalid"})
	
	public  void Nutsmixture() throws InterruptedException {
		
		
		Nutsmixture_page  np = new Nutsmixture_page(driver);
				
				np.searchfornut();
				np.increasenuts();
	}

}
