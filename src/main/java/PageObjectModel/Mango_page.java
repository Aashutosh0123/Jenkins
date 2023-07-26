package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mango_page {
	WebDriver  driver;
    public Mango_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement mangosearch;
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement mangoadd;
    
    
    
    public void seachfieldmango() throws InterruptedException {
    	
    	mangosearch.sendKeys("mango");
    	Thread.sleep(3000);
    }
    public void increasemango() throws InterruptedException {
    	
    	mangoadd.click();
    	mangoadd.click();
    	Thread.sleep(3000);
    }
    
    

}
