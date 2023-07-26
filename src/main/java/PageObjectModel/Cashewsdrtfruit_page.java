package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cashewsdrtfruit_page {
	WebDriver  driver;
    public Cashewsdrtfruit_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
   	
}
    
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement cashewfind;
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement increasecashew;
    
    
    public void searchcashew() throws InterruptedException {
    	
    	cashewfind.sendKeys("cashew");
    	Thread.sleep(2000);
    	
    }
    public void addingcashew() throws InterruptedException {
    	increasecashew.click();
    	Thread.sleep(2000);
    	
    }

}
