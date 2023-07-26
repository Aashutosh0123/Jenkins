package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseClass;

public class Carrot_page extends BaseClass {
	WebDriver  driver;
    public Carrot_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
    }
    
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement field_search;
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement increase_quantity;
    
    
    public void searchitem() throws InterruptedException {
    	field_search.sendKeys("Carrot");
    	Thread.sleep(2000);
    	
    	logger.info("***carrots are selected finally****");
    }
     public void addquantity() throws InterruptedException {
    	 
    	 increase_quantity.click();
    	 Thread.sleep(3000);
     }

}
