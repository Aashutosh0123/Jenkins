package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseClass;

public class Nutsmixture_page extends BaseClass {
	WebDriver  driver;
    public Nutsmixture_page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    
    
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement nutsearch;
    
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement addnuts;
    
    public void searchfornut() throws InterruptedException {
    	
    	
    	nutsearch.sendKeys("Nuts mixture");
    	Thread.sleep(2000);
    }
    
    public void increasenuts() throws InterruptedException {
    	
    	
    	addnuts.click();
    	addnuts.click();
    	Thread.sleep(3000);
    	logger.info("######nutsmixture##");
    }

}
