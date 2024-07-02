package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases_APITesting_VideoTutorial {

		WebDriver driver;
		public TestCases_APITesting_VideoTutorial(WebDriver idriver) {
			driver= idriver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[5]/child::a")
		WebElement testcases;
		@FindBy (xpath="//section[@id='form']/child::div/child::div/child::div/child::h2/child::b")
		WebElement testcaseText;
		@FindBy (tagName="a") List <WebElement> links;
		
		@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[6]/child::a") 
		WebElement apitesting;
		@FindBy (xpath="//section[@id='form']/child::div/child::div/child::div/child::h2/child::b")
		WebElement apitText;
		
		
		
		
		
		@FindBy (xpath="//div[@class='col-sm-8']/child::div/child::ul/child::li[7]/child::a")
		WebElement videotutorial;
	

		public void ClickOnTestCases() 
		   {
			testcases.click();
		   }
		   
		   public void VerifyTestCaseText() {
			   if(testcaseText.isDisplayed()) {
			 String testcase=  testcaseText.getText();
			 System.out.println(testcase);
			   }
		   }
		   
		   public void TestCaseLinkname()
		   {
				System.out.println("Total no of links: "+ links.size());
				for(int i=0;i<links.size();i++) 
				{
					WebElement currentlink= links.get(i);
					String linknames=currentlink.getText();
					System.out.println(linknames);	
		   }
		   }
		
		
		   public void ClickOnAPITesting() 
		   {
			   apitesting.click();
		   }
		   
		   public void VerifyAPIText() {
			   if(apitText.isDisplayed()) {
			 String apiText=  apitText.getText();
			 System.out.println(apiText);
			   }
		   }
		   
		   public void  APILinkname()
		   {
				System.out.println("Total no of links: "+ links.size());
				for(int i=0;i<links.size();i++) 
				{
					WebElement currentlink= links.get(i);
					String APIlinknames=currentlink.getText();
					System.out.println("API LINK names is:" +APIlinknames);	
		   }
		   }
		
		   public void ClickOnVideoTutorial() 
		   {
			   videotutorial.click();
		   }
		   
		   public void NavigatetoHomePage() 
		   {
			   driver.navigate().back();
		   }
		
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
