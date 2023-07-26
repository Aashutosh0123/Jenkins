package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseClass;



public class Potato_page extends BaseClass  {
	WebDriver  driver;
    public Potato_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement search_field;
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/button[1]")
    WebElement search_button;
   @FindBy(xpath="//a[contains(text(),'+')]")
   WebElement quantity_add;
   @FindBy(xpath="//button[contains(text(),'ADD TO CART')]")
   WebElement addpotato;
   
  
    
    public void searchitem() throws InterruptedException {
    	search_field.sendKeys("Potato");
    	Thread.sleep(2000);
    	
    }
    public void searchbutton() throws InterruptedException {
    	search_button.click();
    	Thread.sleep(2000);
    	
    }
    public void increasequantity() throws InterruptedException {
    quantity_add.click();
    quantity_add.click();
    logger.info("POTATOES ARE ADDED");
    
    Thread.sleep(2000);
    }
    public void cartaddedpot () throws InterruptedException {
    	
    	addpotato.click();
    	
    	Thread.sleep(3000);
    }
   
    

}
