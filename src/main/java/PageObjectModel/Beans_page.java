package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Beans_page {
	WebDriver  driver;
    public Beans_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
    }
    
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement searching;
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement beanquantity;
    @FindBy(xpath="//button[contains(text(),'ADD TO CART')]")
    WebElement addtocart;
    
    
    public void fieldsearch() throws InterruptedException {
    	
    	searching.sendKeys("Beans");
    	Thread.sleep(3000);
    	
    	
    }
    public void addquantity() throws InterruptedException {
    	
    	beanquantity.click();
    	Thread.sleep(2000);
    	
    }
    public void cartadd() throws InterruptedException {
    	
    	addtocart.click();
    	Thread.sleep(4000);
    }
}
