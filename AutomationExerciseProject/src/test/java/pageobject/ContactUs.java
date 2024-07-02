package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	WebDriver driver;
	
	public  ContactUs(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[8]/child::a") 
	WebElement contactus;
	
	@FindBy (xpath="//div[@class='contact-form']/child::h2")
	WebElement getinTouch;
	
	@FindBy (xpath="//input[@name='name']")
	WebElement name;
	@FindBy (xpath="//input[@name='email']")
	WebElement email;
	@FindBy (xpath="//input[@name='subject']")
	WebElement subject;
	
	@FindBy (xpath="//textarea[@id='message']")
	WebElement message;
	
	@FindBy (xpath="//input[@name='upload_file']")
	WebElement uploadfile;
	
	@FindBy (xpath="//input[@name='submit']")
	WebElement sumbit;
	

	@FindBy (xpath="//div[@class='contact-form']/descendant::div[2]")
	WebElement successdetails;
	
	@FindBy (xpath="//div[@class='contact-form']/child::div[3]/child::a/descendant::i")
	WebElement homeBtn;
	
	public void ClickContactUS() {
		contactus.click();
	}
	public void GetinTouch() {
		   if(getinTouch.isDisplayed()) {
		 String getintouch=  getinTouch.getText();
		 System.out.println(getintouch);
		   }
	   }
	public void EntertheNames(String etm) {
		name.sendKeys(etm);
	}
	public void Entertheemailss(String etes) {
		email.sendKeys(etes);
	}
	public void EnterSubject(String ess) {
		subject.sendKeys(ess);
	}
	public void EntertheMessage(String etmm) {
		 message.sendKeys(etmm);
	}
	public void UploadFile(String uff) {
		uploadfile.sendKeys(uff);
	}
	public void ClickonSubmitBTN() {
		sumbit.click();
	}
	public void ClickonOKtoProceed() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void GetSuccessMessage() {
		   if(successdetails.isDisplayed()) {
		 String getsuccess=  successdetails.getText();
		 System.out.println(getsuccess);
		   }
	   }
	public void ClickonHomeBTN() throws InterruptedException {
		homeBtn.click();
		Thread.sleep(2000);
	}








}

