package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category_Brands {

	
	WebDriver driver;
	public Category_Brands(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (xpath="//div[@id='accordian']/child::div[1]/child::div/child::h4/child::a/descendant::i")
	WebElement womenplus;
	
	@FindBy (xpath="//div[@id='Women']/child::div/child::ul/child::li[2]/child::a") 
	WebElement womentops;
	
	
	@FindBy (xpath="//div[@id='accordian']/child::div[2]/child::div/child::h4/child::a/descendant::i") 
	WebElement menplus;
	@FindBy (xpath="//div[@id='Men']/child::div/child::ul/child::li[2]/child::a")
	WebElement menjeans;
	
	@FindBy (xpath="//div[@id='accordian']/child::div[3]/child::div/child::h4/child::a/descendant::i") 
	WebElement kidsplus;
	@FindBy (xpath="//div[@id='Kids']/child::div/child::ul/child::li[1]/child::a") 
	WebElement kidsdress;
	
	
	@FindBy (xpath="//div[@class='brands-name']/child::ul/child::li[6]/child::a")
	WebElement allensolley;
	
	
	public void ClickOnWomenPlus() {
		womenplus.click();
	}
	
	public void ClickOnWomenTops() {
		womentops.click();
	}
	
	public void ClickOnMenPlus() {
		menplus.click();
	}
	public void ClickOnMenJeans() {
		menjeans.click();
	}
	public void ClickOnKidsPlus() {
		kidsplus.click();
	}
	public void ClickOnKidsDress() {
		kidsdress.click();
	}
	
	
	public void ClickOnAllenSolley() {
		allensolley.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
