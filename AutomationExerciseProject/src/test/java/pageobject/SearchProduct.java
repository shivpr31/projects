package pageobject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	
	WebDriver driver;
	public SearchProduct(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy (xpath="//input[@id='search_product']") WebElement searchProduct;
	
	@FindBy (xpath="//button[@id='submit_search']") WebElement submitsearch;
	
	@FindBy (xpath="//section[@id='advertisement']/following-sibling::section/child::div/child::div/child::div[2]/descendant::h2[1]")
	WebElement searchedproduct;
	
	@FindBy (tagName="a") 
	List <WebElement> bothproductsincart;
	
	@FindBy (xpath="//div[@class='features_items']/child::div[2]/child::div/child::div[1]/child::div[1]/child::a")
	   WebElement fancygreentopAddtocart;
	   
	
	
	public void HoveronSearchProduct() {
		Actions act= new Actions(driver);
		act.moveToElement(searchProduct).build().perform();
		

	}
	
	
	public void EnterProductName(String spp) {
		//searchProduct.clear();
		searchProduct.sendKeys(spp);
	}
	
	public void ClickSubmitSearch()  {
		submitsearch.click();
		
	}
	
	
	
	public void VerifySearchedproduct() throws InterruptedException {
		   if(searchedproduct.isDisplayed())
		   {
			 String searchedprod=  searchedproduct.getText();
			 System.out.println(searchedprod);
			 Thread.sleep(2000);
			 }
		   }
	
	
	
	public void AddtoCartFancyGTop() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		
		Actions act= new Actions(driver);
		act.moveToElement(fancygreentopAddtocart).build().perform();
		
		fancygreentopAddtocart.click();
		Thread.sleep(2000);

	}
	
	public void ItemInCartafterLogin() {
		System.out.println("Total no of links: "+ bothproductsincart.size());
		for(int i=0;i<bothproductsincart.size();i++) 
		{
			WebElement currentlink= bothproductsincart.get(i);
			String Productlinknames2=currentlink.getText();
			System.out.println("Product LINK name is:" +Productlinknames2);	
			
			if ((Productlinknames2.equalsIgnoreCase("Fancy Green Top")) ) {
				System.out.println("Product is presently added in cart ");
			} else
			{
				System.out.println("Product is not added in cart ");
			}
			 
   }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
