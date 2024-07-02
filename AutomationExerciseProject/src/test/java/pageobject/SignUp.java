package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp 

	 {
		WebDriver driver;
		public SignUp(WebDriver idriver) {
			driver= idriver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[4]/child::a") WebElement signup;
		@FindBy (xpath="//section[@id='form']/child::div/child::div/child::div[3]/child::div/child::h2") WebElement newUserSignup;
		
		@FindBy (xpath="//input[@name='name']") WebElement name;
		@FindBy (xpath="//input[@data-qa='signup-email']") WebElement email;
		
		@FindBy (xpath="//button[@data-qa='signup-button']") WebElement signupBTN;
		
		@FindBy (xpath="//section[@id='form']/child::div/child::div/child::div/child::div[1]/child::h2/child::b") WebElement accountInfo;
		@FindBy (xpath="//div[@id='uniform-id_gender1']") WebElement mrTitle;
		@FindBy (xpath="//input[@id='name']") WebElement firstname;
		
		@FindBy (xpath="//input[@id='email']") WebElement emailAddress;
		@FindBy (xpath="//input[@id='password']") WebElement password;
		
		
		@FindBy (id="days") WebElement day;
		@FindBy (id="months") WebElement month;
		@FindBy (id="years") WebElement year;
		
		
		@FindBy (xpath="//input[@id='newsletter']") WebElement newsletter;
		@FindBy (xpath="//input[@id='optin']") WebElement specialOffers;
		
		
		
		//Address field
		@FindBy (xpath="//input[@id='first_name']") WebElement fname;
		@FindBy (xpath="//input[@id='last_name']") WebElement lname;
		@FindBy (xpath="//input[@id='company']") WebElement company;
		
		@FindBy (xpath="//input[@id='address1']") WebElement address1;
		@FindBy (id="country") WebElement country;
		
		@FindBy (id="state") WebElement state;
		@FindBy (id="city") WebElement city;
		
		@FindBy (xpath="//input[@id='zipcode']") WebElement zipcode;
		@FindBy (id="mobile_number") WebElement mobileNumber;
		
		@FindBy (xpath="//button[@data-qa='create-account']") WebElement createAccount;
		
	    @FindBy (xpath="//section[@id='form']/descendant::div[3]/child::h2/child::b") WebElement accountCreated;
	    @FindBy (xpath="//section[@id='form']/descendant::div[4]/child::a") WebElement continueBTN;
	    
	    
	    @FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[10]/child::a/child::i") WebElement loggedinUser;
	    @FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[5]/child::a/child::i") WebElement deleteAccount;
	    
	    @FindBy (xpath="//section[@id='form']/child::div/child::div/child::div/child::h2/child::b") WebElement accountDeleted;
	    @FindBy (xpath="//section[@id='form']/child::div/child::div/child::div/child::h2/following-sibling::div/child::a") WebElement continueDeletedBTN;
	    
	    @FindBy (xpath="//div[@class='signup-form']/child::form/child::p") WebElement accountExits;
	    
	   public void ClickOnSignUp() 
	   {
		   signup.click();
	   }
	   
	   public void NewUserSignupText() {
		   if(newUserSignup.isDisplayed()) {
		 String newuser=  newUserSignup.getText();
		 System.out.println(newuser);
		   }
	   }
	   
	  public void EnterUsername(String em) 
	   {
		   
		 name.sendKeys(em);
	   }
	   
	   
	   public void EnterEmail(String ee) 
	   {
		 email.sendKeys(ee);
	   }
	   public void ClickOnSignUpBTN() 
	   {
		   signupBTN.click();
		   
	   }
	   
	   //Account info
	   public void EnterAccountInfoText() {
		   if(accountInfo.isDisplayed())
		   {
			 String AccInfo=  accountInfo.getText();
			 System.out.println(AccInfo);
			 }
		   }
	   
	   public void ClickOnTitle() 
	   {
		   mrTitle.click();
		   
	   }
	   
	  /* public void EnterFirstName(String fm) 
	   {
		   firstname.clear();
		 firstname.sendKeys(fm);
	   }
	   
	   
	   public void EnterEmailAddress(String ea) 
	   {

		 emailAddress.sendKeys(ea);
	   }*/
	   
	   public void EnterPassword(String ep) 
	   {
		   password.clear();
		   password.sendKeys(ep);
	   }
	   
	  
	   public void SelectDate() {
		 Select sc = new Select(day);
		 sc.selectByVisibleText("5"); 
			
	   }
	   
	   public void SelectMonth() {
			 Select sc = new Select(month);
			 sc.selectByVisibleText("February"); 
				
		   }
	   public void SelectYear() {
			 Select sc = new Select(year);
			 sc.selectByVisibleText("1985"); 
				
		   }
	   
	   public void ClickOnNewsLetter() 
	   {
		   newsletter.click();
		   
	   }
	   
	   public void ClickOnSpecialOffer() 
	   {
		   specialOffers.click();
		   
	   }
	   
	   
	   //address field
	   public void EnterFirstNameField(String ff) 
	   {
		 
		   fname.sendKeys(ff);
	   }
	   
	   public void EnterLastNameField(String lf) 
	   {
		   
		   lname.sendKeys(lf);
	   }
	   
	   
	   
	   public void EnterCompany(String ec) 
	   {
		   
		   company.sendKeys(ec);
	   }
	   
	   public void EnterAddress1(String ea1) 
	   {
		   
		   address1.sendKeys(ea1);
	   }
	   
	   public void SelectCountry() {

		   Select sc= new Select(country);
		   sc.selectByVisibleText("United States");
		   
	   }
	   
	   public void EnterStates(String ess) 
	   {
		  
		   state.sendKeys(ess);
	   }
	   
	   public void EnterCity(String ecc) 
	   {
		  
		   city.sendKeys(ecc);
	   }
	   
	   public void EnterZipcode(String zc) 
	   {
		  
		   zipcode.sendKeys(zc);
	   }
	   
	   public void EnterMobileNumber(String mn) 
	   {
		  
		   mobileNumber.sendKeys(mn);
	   }
	   
	   public void ClickCreateAccount() 
	   {
		  
		   createAccount.click();
	   }
	   
	   
	   public void VerifyAccountCreated() {
		   if (accountCreated.isDisplayed()) {
			   String accCreated=  accountCreated.getText();
				 System.out.println(accCreated);
		   }
		   
		   
	   }
	   
	   public void ClickOnContinueBTN() {
		   continueBTN.click();
	   }
	   public void VerifyUserLogged() {
		   if (loggedinUser.isDisplayed()) {
			   String loggedUser=  loggedinUser.getText();
				 System.out.println(loggedUser);
		   }
	   }
	   
	  
	   public void ClickDeleteAccount() throws InterruptedException 
	   {
		  
		   deleteAccount.click();
		   Thread.sleep(2000);
		   
	   }
	   
	    
	   public void VerifyUserDeleted() {
		   if (accountDeleted.isDisplayed()) {
			   String Userdeleted=  accountDeleted.getText();
				 System.out.println(Userdeleted);
		   }
	   }
	    
	   
	  
	   public void ClickContinueDeleteBTN() throws InterruptedException
	   {
		  
		   continueDeletedBTN.click();
		   Thread.sleep(2000);
		  
	   }
	   
	   public void VerifyAccountAlreadyExist() {
		   if (accountExits.isDisplayed()) {
			   String accExits=  accountExits.getText();
				 System.out.println(accExits);
		   }
	   }
		
		
		
		
		
		
		
		
		
		
		
	}


