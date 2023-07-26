package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseClass;

public class Corn_page extends BaseClass{
	WebDriver  driver;
    public Corn_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement cornsearch;
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement cornquantity;
    
     
    
    public void searchingforcorn() throws InterruptedException {
    	
    	cornsearch.sendKeys("Corn");
    	Thread.sleep(2000);
    	
    }
    public void addingquantity() throws InterruptedException {
    	
    	cornquantity.click();
    	cornquantity.click();
    	cornquantity.click();
    	Thread.sleep(4000);
    	logger.info("there are corn flakes");
    	
    }

}
