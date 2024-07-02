package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyAllProducts_Productdetailpage {

	
	WebDriver driver;
	public VerifyAllProducts_Productdetailpage(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[2]/child::a")
	WebElement product;
	
	
	
	@FindBy (xpath="//div[@class='features_items']/child::h2") WebElement allProductspage;
	@FindBy (xpath="//div[@class='features_items']/child::div[2]/child::div/child::div[2]/child::ul/child::li/child::a")
	WebElement viewProduct;
	@FindBy (xpath="//div[@class='product-details']/child::div[2]/child::div/child::h2")
	WebElement bluetop;
	@FindBy (xpath="//div[@class='product-details']/child::div[2]/child::div/child::p")
	WebElement categorywomen;
	@FindBy (xpath="//div[@class='product-details']/child::div[2]/child::div/descendant::p/child::b")
	WebElement availability;
	@FindBy (xpath="//div[@class='product-details']/child::div[2]/child::div/descendant::p[3]/child::b")
	WebElement condition;
	@FindBy (xpath="//div[@class='product-details']/child::div[2]/child::div/descendant::p[4]/child::b")
	WebElement brand;
	
	
	@FindBy (xpath="//input[@id='name']")
	WebElement name;
	@FindBy (xpath="//input[@id='email']")
	WebElement email;
	@FindBy (xpath="//textarea[@id='review']")
	WebElement review;
	
	@FindBy (xpath="//button[@id='button-review']") WebElement submit;
	
	public void ClickOnProducts() throws InterruptedException {
		product.click();
		Thread.sleep(2000);
	}
	
	
	public void AllProductPage() throws InterruptedException {
			   if(allProductspage.isDisplayed()) {
			 String newuser1=  allProductspage.getText();
			 System.out.println(newuser1);
			   }
		   	Thread.sleep(3000);
	}
	
	public void ClickOnViewProduct() throws InterruptedException {
		viewProduct.click();
		Thread.sleep(2000);
	}
	
	
	
	public void GetProductName() {
		if(bluetop.isDisplayed()) {
		bluetop.getText();
	}}
	
	
	public void Getcategorywomen() {
		if(categorywomen.isDisplayed()) {
			categorywomen.getText();
		}}
		
	
	
	public void Getavailability() {
		if(availability.isDisplayed()) {
			availability.getText();
		}}
		
	
	public void GetCondition() {
		if(condition.isDisplayed()) {
			condition.getText();
		}}
		
	public void GetBrandName() {
		if(brand.isDisplayed()) {
			brand.getText();
		}}
		
	
	public void EnterNameReview(String ern) {
		name.sendKeys(ern);
	}
	
	public void EnterEmailReview(String eer) {
		email.sendKeys(eer);
	}
	public void EnterRReview(String err) {
		review.sendKeys(err);
	}
	
	public void ClickonSubmit() {
		submit.click();
	}
}
