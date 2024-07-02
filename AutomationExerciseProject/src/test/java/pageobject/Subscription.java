package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscription {

	
	WebDriver driver;
	public Subscription(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}
	

	//@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[1]/child::a/child::i") 
	//WebElement homepage;
	@FindBy (xpath="//footer[@id='footer']/child::div[1]/child::div/child::div/child::div[2]/child::div/child::h2")
	WebElement subscriptionText;
	
	@FindBy (id="susbscribe_email") WebElement subEmail;
	@FindBy (xpath="//button[@type='submit']") WebElement submitarrow;
	
	@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[1]/child::a/child::i") 
	WebElement cart;
	
	@FindBy (xpath="//a[@id='scrollUp']") WebElement scrollsuparrow;
	
	
	
	public void SubscriptionText() {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		
		   if(subscriptionText.isDisplayed()) {
		 String subtext=  subscriptionText.getText();
		 System.out.println(subtext);
		   }
	   }
	
	public void EnterSubscriptionEmail(String see) {
		subEmail.sendKeys(see);
	}
	
	public void ClickOnCircleArrow() {
		submitarrow.click();
	}
	
	//=================
	public void ClickScrollsUpArrowBTN() {
		scrollsuparrow.click();
	}
	
	public void ClickOnCartBTN() {
		cart.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
