package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Topdeals_page {
	WebDriver  driver;
    public Topdeals_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    
    @FindBy(xpath="//a[contains(text(),'Top Deals')]")
    WebElement clickontop;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]")
    WebElement clickonnext;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]")
    WebElement clickonfirst;
    
    public void hitattop() throws InterruptedException {
    	
    	clickontop.click();
    	Thread.sleep(3000);
    	
    }
    public void hitonnext() throws InterruptedException {
    	
    	clickonnext.click();
    	clickonnext.click();
    	clickonnext.click();
    	Thread.sleep(3000);
    	
    }
    public void hitonfirst() throws InterruptedException {
    	
    	clickonfirst.click();
    	Thread.sleep(3000);
    	
    }
    
    

}
