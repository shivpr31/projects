package pageobject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsinCart {

	WebDriver driver;
	public ProductsinCart(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy  (xpath="//div[@class='features_items']/child::div[2]/child::div/child::div[1]/child::div[1]/child::a")
	WebElement addtocart1;
	
	@FindBy (xpath="//button[@class='btn btn-success close-modal btn-block']")
	WebElement continueshopping;
	
	@FindBy  (xpath="//div[@class='features_items']/child::div[3]/child::div/child::div[1]/child::div[1]/child::a")
	WebElement addtocart2;
	 
	
	@FindBy (xpath="//div[@id='cartModal']/descendant::div[5]/child::p[2]/child::a/child::u") 
	WebElement viewcart;
	
	@FindBy (tagName="a") 
	List <WebElement> bothproductsincart;
	
	@FindBy (xpath="//table[@id='cart_info_table']/child::tbody/child::tr/child::td[3]/child::p")
	List <WebElement> price;
	
	@FindBy (xpath="//table[@id='cart_info_table']/child::tbody/child::tr/child::td[4]/child::button")
	List <WebElement> cartquantity;
	
	@FindBy (xpath="//table[@id='cart_info_table']/child::tbody/child::tr/child::td[5]/child::p")
	List <WebElement> totalprice;
	
	
	
	@FindBy (xpath="//tr[@id='product-1']/child::td[2]/child::h4/child::a") 
	WebElement bluetopLink;
	
    @FindBy (xpath="//input[@id='quantity']") 
    WebElement quantity;
	
    @FindBy (xpath="//button[@class='btn btn-default cart']")
    WebElement addtocart;
	
   @FindBy (xpath="//table[@id='cart_info_table']/child::tbody/child::tr[2]/child::td[6]/child::a")
	WebElement menstshirtDelete;
   
   @FindBy (xpath="//tr[@id='product-2']/child::td[2]/child::h4/child::a")
	WebElement menstshirtremoved;
   
   @FindBy (xpath="//div[@class='recommended_items']/child::h2") WebElement recommeneditems;
   
   @FindBy (xpath="//div[@class='recommended_items']/child::div/descendant::div[19]/child::a/child::i") WebElement stylistdresscart;
   
   
   
   
	public void HoverOn1stProduct() throws InterruptedException {
		Actions act= new Actions(driver);
		act.moveToElement(addtocart1).build().perform();
		
		addtocart1.click();
		Thread.sleep(4000);

	}

	public void ClickOnContinueShoppingBTN() {
		continueshopping.click();
		//Thread.sleep(2000);
	}
	
	public void HoverOn2ndProduct() throws InterruptedException {
		Actions act= new Actions(driver);
		act.moveToElement(addtocart2).build().perform();
		addtocart2.click();
		Thread.sleep(5000);

	}
	
	public void ClickOnViewCartBTN() throws InterruptedException {
		viewcart.click();
		Thread.sleep(2000);
	}
	
	public void AddedProductsInCart() {
		System.out.println("Total no of links: "+ bothproductsincart.size());
		for(int i=0;i<bothproductsincart.size();i++) 
		{
			WebElement currentlink= bothproductsincart.get(i);
			String Productlinknames=currentlink.getText();
			System.out.println("Product LINK names is:" +Productlinknames);	
			
			if ((Productlinknames.equalsIgnoreCase("Blue Top")) && (Productlinknames.equalsIgnoreCase("Men Tshirt"))) {
				System.out.println("Both Products - Blue Top && Men Tshirt are presently added in cart ");
			} else {
				System.out.println("Cart is empty and/or Products are not present in cart");
			}
			 
   }
	}
	
	public void VerifyPrice() {
		for(int f=0; f<price.size();f++)
		{
			String Price =price.get(f).getText();
			System.out.println("The Price of products are : " +Price);
	}
	
	}
	public void VerifyCartQuantity() {
		for(int f=0; f<cartquantity.size();f++)
		{
			String Quantity =cartquantity.get(f).getText();
			System.out.println("The cart quantity of products are : " +Quantity);
	}
	
	}
	public void VerifyTotalPrice() {
		for(int f=0; f<totalprice.size();f++)
		{
			String TotalPrice =totalprice.get(f).getText();
			System.out.println("The TotalPrice of products are : " +TotalPrice);
	}
	
	}
	
	public void ClickOnBlueTopLink() {
		bluetopLink.click();
	}
	
	
	public void EnterQuantity(String a) {
		quantity.clear();
		quantity.sendKeys(a);
	}
	
	public void ClickonAddtoCart() {
		addtocart.click();
	}
	
	public void ClickonRemoveProductfromCart() {
		menstshirtDelete.click();
	}
	
	
	public void VerifyMensTshirtRemovedCart() {
		
		if (!(menstshirtremoved.isDisplayed()) &&  (bluetopLink.isDisplayed()))
				{
			System.out.println("Verified!, Product not in cart");
		} else {
			System.out.println("Not Verified");
		}
	}
	
	
	//=========================
     public void  VerifyRecommenedItems() throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3050)");
		
		   if(recommeneditems.isDisplayed()) {
		 String subtext1=  recommeneditems.getText();
		 System.out.println(subtext1);
		 	Thread.sleep(2000);
		   }
	   }
	
	
     public void StylistDressCart() throws InterruptedException {
 		
 		Actions act= new Actions(driver);
 		act.moveToElement(stylistdresscart).build().perform();
 		Thread.sleep(1000);
 		
 		stylistdresscart.click();
 		Thread.sleep(2000);

 	}
 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
