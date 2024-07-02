package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {

	WebDriver driver;
	public PlaceOrder(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//section[@id='do_action']/child::div[1]/descendant::div[2]/child::a")
	WebElement proceedtocheckout;
	
	@FindBy (xpath="//div[@id='checkoutModal']/descendant::div[5]/child::p[2]/child::a/child::u")
	WebElement registerLogin;
	
	@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[3]/child::a") 
	WebElement cartlink;
	
	@FindBy (xpath="//textarea[@name='message']") 
	WebElement textmessage;
	
	@FindBy (xpath="//section[@id='cart_items']/child::div/child::div[7]/child::a")
	WebElement placeorder;
	
	@FindBy (name="name_on_card") WebElement nameoncard;
	@FindBy (name="card_number") WebElement cardnumber;
	@FindBy (xpath="//input[@name=\"cvc\"]") WebElement cvc;
	@FindBy (xpath="//input[@name=\"expiry_month\"]") WebElement expirymonth;
	@FindBy (xpath="//input[@name=\"expiry_year\"]") WebElement expiryyear;
	
	@FindBy (xpath="//button[@id=\"submit\"]") WebElement payandconfirmorder;
	@FindBy (xpath="//section[@id=\"form\"]/descendant::div[3]/child::h2/child::b") WebElement orderplaced;
	@FindBy (xpath="//section[@id=\"form\"]/descendant::div[3]/child::h2/following::a[1]") WebElement downloadinvoice;
	
	@FindBy (xpath="//ul[@id='address_delivery']/child::li[2]") WebElement fullnamed ;
	@FindBy (xpath="//ul[@id='address_delivery']/child::li[3]") WebElement  compnaynamed ;
	@FindBy (xpath="//ul[@id='address_delivery']/child::li[4]") WebElement address1d ;
	@FindBy (xpath="//ul[@id='address_delivery']/child::li[6]") WebElement streetnamed ;
	@FindBy (xpath="//ul[@id='address_delivery']/child::li[7]") WebElement countryd ;
	@FindBy (xpath="//ul[@id='address_delivery']/child::li[8]") WebElement  mobiled ;
	
	
	@FindBy (xpath="//ul[@id='address_invoice']/child::li[2]") WebElement fullnameinvoice;
	@FindBy (xpath="//ul[@id='address_invoice']/child::li[3]") WebElement companynameinvoice;
	@FindBy (xpath="//ul[@id='address_invoice']/child::li[4]") WebElement address1invoice;
	@FindBy (xpath="//ul[@id='address_invoice']/child::li[6]") WebElement streetnameinvoice;
	@FindBy (xpath="//ul[@id='address_invoice']/child::li[7]") WebElement countryinvoice;
	@FindBy (xpath="//ul[@id='address_invoice']/child::li[8]") WebElement mobileinvoice;
	
	
	public void ClickOnProceedToCheckout() {
		proceedtocheckout.click();
	}
	
	public void ClickOnRegisterLogin() {
		registerLogin.click();
	}
	
	public void ClickOnCartLink() {
		cartlink.click();
	}
	
	public void EnterTextComment(String tmm) {
		textmessage.sendKeys(tmm);
	}
	public void ClickOnPlaceOrder() {
		placeorder.click();
	}
	
	public void EnterNameOnCard(String emc) {
		nameoncard.sendKeys(emc);
	}
	
	public void EnterCardNumber(String ecn) {
		cardnumber.sendKeys(ecn);
	}
	public void EnterCVC(String cv) {
		cvc.sendKeys(cv);
	}
	public void EnterExpiryMonth(String eem) {
		expirymonth.sendKeys(eem);
	}
	public void EnterExpiryYear(String eey) {
		expiryyear.sendKeys(eey);
	}
	
	public void ClickOnPayandConfirmOrder() {
		payandconfirmorder.click();
	}
	
	public void VerifyAddressBillingDelivery() {
	
			   if(fullnamed.isDisplayed() && fullnameinvoice.isDisplayed()) {
			 String flname=  fullnamed.getText();
			 String flname2=  fullnameinvoice.getText();
			 System.out.println(flname +" and   " +flname2  +"are same");
			
			   }
			   
			   if( compnaynamed.isDisplayed() && companynameinvoice.isDisplayed()) {
					 String  compnayname=   compnaynamed.getText();
					 String  compnayname2=   companynameinvoice.getText();
					 System.out.println(compnayname +" and   " +compnayname2  +"are same");
					   }
			   if(address1d.isDisplayed() && address1invoice.isDisplayed()) {
					 String address1=  address1d.getText();
					 String address2=   address1invoice.getText();
					 System.out.println(address1 +" and   " +address2  +"are same");
			
					   }
			   if(streetnamed.isDisplayed() && streetnameinvoice.isDisplayed()) {
					 String streetname=  streetnamed.getText();
					 String streetname2=  streetnameinvoice.getText();
					 System.out.println(streetname +" and   " +streetname2  +"are same");
					   }
			   if(countryd.isDisplayed() && countryinvoice.isDisplayed()) {
					 String country1=  countryd.getText();
					 String country2=  countryinvoice.getText();
					 System.out.println(country1 +" and   " + country2  +"are same");
					   }
			   if(mobiled.isDisplayed() && mobileinvoice.isDisplayed()) {
					 String mobile1=  mobiled.getText();
					 String mobile2=  mobileinvoice.getText();
					 System.out.println(mobile1 +" and   " +mobile2+"are same");
					   }
			  
		   }
	
	
	
	public void VerifyOrderPlaced() {
		   if(orderplaced.isDisplayed()) {
		 String op=  orderplaced.getText();
		 System.out.println(op);
		   }
	   }
	
	public void ClickOnDownloadInvoice() throws InterruptedException {
		downloadinvoice.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
