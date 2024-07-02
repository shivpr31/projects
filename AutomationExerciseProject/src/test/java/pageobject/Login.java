package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver;
	
		public Login (WebDriver idriver) 
		{
			driver= idriver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy (xpath="//section[@id='form']/descendant::div[4]/child::h2") 
		WebElement logintoACC;
		@FindBy (xpath="//input[@data-qa='login-email']") 
		WebElement email;
		@FindBy (xpath="//input[@data-qa='login-password']") 
		WebElement password;
		@FindBy (xpath="//button[@data-qa='login-button']")
		WebElement loginbtn;
		
		@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[4]/child::a/child::i")
		WebElement logout;
		@FindBy (xpath="//div[@class='login-form']/child::form/child::p")
		WebElement incorrectLogindetails;
		
		
		
		public void VerifyLoginToAccount() {
			   if (logintoACC.isDisplayed()) {
				   String acclogin=  logintoACC.getText();
					 System.out.println(acclogin);
			   }
		}
			   
		public void EnterEmail(String eem) {
			email.sendKeys(eem);
		}
		
		public void EnterPassword(String epp) {
			password.sendKeys(epp);
		}
		
		public void ClickonLoginBTN() {
			loginbtn.click();
		}
		
		public void ClickonLogoutBTN() {
			logout.click();
		}
		
		public void VerifyIncorrectLogindetails() {
			   if (incorrectLogindetails.isDisplayed()) {
				   String incorrectlogin=  incorrectLogindetails.getText();
					 System.out.println(incorrectlogin);
			   }
		}
		
		
		public void CloseBrowser() {
			driver.close();
		}
		
		}
		

