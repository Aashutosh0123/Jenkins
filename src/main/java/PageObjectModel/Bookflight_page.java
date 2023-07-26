package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookflight_page {
	WebDriver  driver;
    public Bookflight_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
    }
    
    @FindBy(xpath="//a[contains(text(),'Flight Booking')]")
    WebElement clickflight;
    
    @FindBy(xpath="//input[@id='autosuggest']")
    WebElement insertcountry;
    
    
    public void flighthit() throws InterruptedException {
    	
    	clickflight.click();
    	Thread.sleep(3000);
    }
    public void countryinsert() throws InterruptedException {
    	
    	insertcountry.sendKeys("India");
    	Thread.sleep(3000);
    	
    }
}
