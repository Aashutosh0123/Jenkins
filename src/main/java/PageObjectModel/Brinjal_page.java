package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseClass;

public class Brinjal_page extends BaseClass{
	WebDriver  driver;
    public Brinjal_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
    }
    
    
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement search_field;
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement add_quantity;
    
    
    public void searchitem() throws InterruptedException {
    	search_field.sendKeys("brinjal");
    	Thread.sleep(2000);
    	
    }
    public void increasequantity() throws InterruptedException {
    	
    	add_quantity.click();
    	logger.info("Brinjals are successfully added");
    	Thread.sleep(3000);
    }
    
    
    
    

}
