package stepDefinitions;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Category_Brands;
import pageobject.ContactUs;
import pageobject.Login;
import pageobject.PlaceOrder;
import pageobject.ProductsinCart;
import pageobject.SearchProduct;
import pageobject.SignUp;
import pageobject.Subscription;
import pageobject.TestCases_APITesting_VideoTutorial;
import pageobject.VerifyAllProducts_Productdetailpage;


public class StepDefinitions {
	WebDriver driver;
	SignUp su;
	Login l;
	ContactUs cu;
	TestCases_APITesting_VideoTutorial tav;
	Subscription s;
	Category_Brands cb;
	VerifyAllProducts_Productdetailpage pp;
	SearchProduct sp;
	ProductsinCart pc;
	PlaceOrder po;
	
	@Before
	public void beforeMethod() {
		System.out.println("First Line");
	}
	
	@Given("User Launch the Chrome Browser")
	public void user_launch_the_chrome_browser() {
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     su = new SignUp(driver);
	     l= new Login(driver);
	     cu = new ContactUs(driver);
	     tav= new TestCases_APITesting_VideoTutorial(driver);
	     s= new Subscription (driver);
	     cb= new Category_Brands(driver);
	     pp = new VerifyAllProducts_Productdetailpage(driver);
	     sp= new SearchProduct(driver);
	     pc= new ProductsinCart(driver);
	     po= new PlaceOrder(driver);
	}

	@When("User open the url as {string}")
	public void user_open_the_url_as(String url){
		driver.get(url); 
		
	
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expTitle) {
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(expTitle, actualTitle);
	    
	}

	@Then("User click on the SignUp\\/Login button")
	public void user_click_on_the_sign_up_login_button() {
	    su.ClickOnSignUp();
	}
	
	@Then("User is on visible page {string}")
	public void user_is_on_visible_page(String string) {
	    l.VerifyLoginToAccount();
	}

	@When("User enter email address as {string} and password as {string}")
	public void user_enter_email_address_as_and_password_as(String eeml, String pwds) {
	    l.EnterEmail(eeml);
	    l.EnterPassword(pwds);
	}

	@When("User click on the Login button")
	public void user_click_on_the_login_button() {
	    l.ClickonLoginBTN();
	}

	@Then("User click on the Loggout button")
	public void user_click_on_the_loggout_button() {
	    l.ClickonLogoutBTN();
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String ee3, String eer) {
	    l.EnterEmail(ee3);
	    l.EnterPassword(eer);
	}

	@Then("User is on page {string} and is visible")
	public void user_is_on_page_and_is_visible(String string) {
	    l.VerifyIncorrectLogindetails();
	}



	
	
	@Then("User is directed on {string} page and is visible")
	public void user_is_directed_on_page_and_is_visible(String newuser) {
	    su.NewUserSignupText();
	}

	@Then("User enter name as {string} and email address as {string}")
	public void user_enter_name_as_and_email_address_as(String nm, String eml) {
	    su.EnterUsername(nm);
	    su.EnterEmail(eml);
	}

	@Then("User click on Signup button")
	public void user_click_on_signup_button() {
	    su.ClickOnSignUpBTN();
	}

	
	/*@Then("Page should be on {string} and is visible")
	public void page_should_be_on_and_is_visible1 (String accExist) {
	    su.VerifyAccountAlreadyExist();
	}*/
	
	@Then("Page should be {string} is visible")
	public void page_should_be_is_visible(String accinfo) {
	    su.EnterAccountInfoText();
	}

	@Then("User clicks on {string} Title")
	public void user_clicks_on_title(String mr) {
	    su.ClickOnTitle();
	}

	

	@Then("User enters password as {string}")
	public void user_enters_password_as(String eep) {
	    su.EnterPassword(eep);
	}

	@Then("User selects date of  birth  day as {string}")
	public void user_selects_date_of_birth_day_as(String date) {
	    su.SelectDate();
	}

	@Then("User selects month as {string}")
	public void user_selects_month_as(String month) {
	    su.SelectMonth();
	}

	@Then("User selects year as {string}")
	public void user_selects_year_as(String year) {
	    su.SelectYear();
	}

	@Then("User click on Sign up for our newsletter")
	public void user_click_on_sign_up_for_our_newsletter() {
	    su.ClickOnNewsLetter();
	}

	@Then("User click on Receive special offers from our partners")
	public void user_click_on_receive_special_offers_from_our_partners() {
	    su.ClickOnSpecialOffer();
	}

	@Then("User enters first name as {string}")
	public void user_enters_first_name_as(String efnf) {
	    su.EnterFirstNameField(efnf);
	}

	@Then("User  enters last name as {string}")
	public void user_enters_last_name_as(String eln) {
	   su.EnterLastNameField(eln);
	}

	@Then("User enters company as {string}")
	public void user_enters_company_as(String ecc) {
	    su.EnterCompany(ecc);
	}

	@Then("User enters address as {string}")
	public void user_enters_address_as(String eea1) {
	    su.EnterAddress1(eea1);
	}

	@Then("User selects Country as {string}")
	public void user_selects_country_as(String string) {
	    su.SelectCountry();
	}

	@Then("User enters state  as {string}")
	public void user_enters_state_as(String ess1) {
	    su.EnterStates(ess1);
	}

	@Then("User enters city as {string}")
	public void user_enters_city_as(String ecc) {
	    su.EnterCity(ecc);
	}

	@Then("User enters zipcode as {string}")
	public void user_enters_zipcode_as(String ezcc) {
	    su.EnterZipcode(ezcc);
	}

	@Then("User enters mobile number as {string}")
	public void user_enters_mobile_number_as(String enmm) {
	    su.EnterMobileNumber(enmm);
	}

	@Then("User clicks on Create Account button")
	public void user_clicks_on_create_account_button() {
	    su.ClickCreateAccount();
	   
	}

	@Then("Page should be visible as {string}")
	public void page_should_be_visible_as(String expText) {
	    su.VerifyAccountCreated();
	    
	}

	@Then("User click on continue button")
	public void user_click_on_continue_button() {
		su.ClickOnContinueBTN();
		
	}

	@Then("Page directed as {string} is visible")
	public void page_directed_as_is_visible(String nme) {
	    su.VerifyUserLogged();
	}

	@Then("User click on  Delete Account")
	public void user_click_on_delete_account() throws InterruptedException {
		su.ClickDeleteAccount();
	    	}

	@Then("Page should be on {string} and is visible")
	public void page_should_be_on_and_is_visible(String udelete) {
	    su.VerifyUserDeleted();
	    
	   
	}
	
	@Then("User click on continue delete button")
	public void user_click_on_continue_delete_button() throws InterruptedException {
		su.ClickContinueDeleteBTN();
	
	}
	
	@When("User click on the Contact Us button")
	public void user_click_on_the_contact_us_button() {
		cu.ClickContactUS();
	}

	@Then("User is on  page {string} and will be visible")
	public void user_is_on_page_and_will_be_visible(String tcc) {
		cu.GetinTouch();
		
	}

	@Then("The User enters the name as {string}")
	public void the_user_enters_the_name_as(String etm) {
	    cu.EntertheNames(etm);
	}

	@Then("User enters mail as {string}")
	public void user_enters_mail_as(String etes) {
	    cu.Entertheemailss(etes);
	}

	@Then("User enters subject as {string}")
	public void user_enters_subject_as(String ues) {
	    cu.EnterSubject(ues);
	}

	@Then("User enters the message as {string}")
	public void user_enters_the_message_as(String etmm) {
	    cu.EntertheMessage(etmm);
	}

	@Then("User  clicks and enters the file as {string}")
	public void user_clicks_and_enters_the_file_as(String ufff) {
	    cu.UploadFile(ufff);
	}

	@Then("User click on Submit button")
	public void user_click_on_submit_button() {
	    cu.ClickonSubmitBTN();
	}

	@Then("User clicks on OK button")
	public void user_clicks_on_ok_button() {
	    cu.ClickonOKtoProceed();
	    
	}

	@Then("User gets a message as {string} is visible")
	public void user_gets_a_message_as_is_visible(String gsm) {
	    cu.GetSuccessMessage();
	}

	@Then("User clicks on Home button")
	public void user_clicks_on_home_button() throws InterruptedException {
	    cu.ClickonHomeBTN();
	    
	}
  
	
	@When("User clicks on TestCases")
	public void user_clicks_on_test_cases() {
	    tav.ClickOnTestCases();
	}

	@Then("User is directed and is visible as {string}")
	public void user_is_directed_and_is_visible_as(String tcv) {
	    tav.VerifyTestCaseText();
	}

	@Then("User generates the linkname of the page")
	public void user_generates_the_linkname_of_the_page() {
	   tav.TestCaseLinkname();
	}

	@When("User clicks on API Testing")
	public void user_clicks_on_api_testing() {
	    tav.ClickOnAPITesting();
	   
	}

	@Then("User sees and is visible as {string}")
	public void user_sees_and_is_visible_as(String apit) {
	    tav.VerifyAPIText();
	}

	@Then("User generates the link names of the page displayed")
	public void user_generates_the_link_names_of_the_page_displayed() {
	    tav.APILinkname();
	}

	@When("User clicks on  Video Tutorials")
	public void user_clicks_on_video_tutorials() {
		tav.ClickOnVideoTutorial();
	}

	@Then("User navigates back to Home Page")
	public void user_navigates_back_to_home_page() {
	    tav.NavigatetoHomePage();
	}

	@When("User scrolls down and {string} text is displayed")
	public void user_scrolls_down_and_text_is_displayed(String string) {
		s.SubscriptionText();
	}

	@When("User enters the emailaddress {string}")
	public void user_enters_the_emailaddress(String  ese) {
	   s.EnterSubscriptionEmail(ese);;
	}

	@When("User clicks on circle arrow")
	public void user_clicks_on_circle_arrow() {
	    s.ClickOnCircleArrow();
	   
	}
	
	@When("User clicks on Scrollup arrow button on right")
	public void user_clicks_on_scrollup_arrow_button_on_right() {
	    s.ClickScrollsUpArrowBTN();
	}

	@When("User clicks on Cart link")
	public void user_clicks_on_cart_link() {
		s.ClickOnCartBTN();
	}

	
	@When("User clicks on plus sign")
	public void user_clicks_on_plus_sign() {
	    cb.ClickOnWomenPlus();
	}

	@Then("User selects the Tops from the drop values")
	public void user_selects_the_tops_from_the_drop_values() {
	    cb.ClickOnWomenTops();
	}

	@Then("Title of womens top should be  as {string}")
	public void title_of_womens_top_should_be_as(String expTitle4) {
		String actualTitle4 = driver.getTitle();
	    Assert.assertEquals(expTitle4, actualTitle4);
	}
	

	@When("User clicks on a sign made of plus")
	public void user_clicks_on_a_sign_made_of_plus() {
	    cb.ClickOnMenPlus();
	}

	@Then("User chooses from the drop values as Jeans")
	public void user_chooses_from_the_drop_values_as_jeans() {
	    cb.ClickOnMenJeans();
	}

	
	@Then("{string}  should be mens Page Title")
	public void should_be_mens_page_title(String expTitle3) {
		String actualTitle3 = driver.getTitle();
	    Assert.assertEquals(expTitle3, actualTitle3);
	}
	

	@When("User clicks Kids plus")
	public void user_clicks_kids_plus() {
	    cb.ClickOnKidsPlus();
	}

	@Then("User decides for Dress from the options")
	public void user_decides_for_dress_from_the_options() {
	    cb.ClickOnKidsDress();
	}

	
	@Then("{string} should  be page Title of kids dress")
	public void should_be_page_title_of_kids_dress(String expTitle2) {
		String actualTitle2 = driver.getTitle();
	    Assert.assertEquals(expTitle2, actualTitle2);
	}


	
	@When("User makes an attempt for ALLEN SOLLY JUNIOR")
	public void user_makes_an_attempt_for_allen_solly_junior() {
	   cb.ClickOnAllenSolley();
	}

	
	
	@Then("{string}  should be title page for Brands")
	public void should_be_title_page_for_brands(String expTitle1) {
		String actualTitle1 = driver.getTitle();
	    Assert.assertEquals(expTitle1, actualTitle1);
	}

	//=============================================

	@When("User clicks on Products link")
	public void user_clicks_on_products_link() throws InterruptedException {
	    pp.ClickOnProducts();
	}

	@Then("User is directed to ALL PRODUCTS visible page")
	public void user_is_directed_to_all_products_visible_page() throws InterruptedException {
	    pp.AllProductPage();
	}

	@Then("User clicks on View Product of first product")
	public void user_clicks_on_view_product_of_first_product() throws InterruptedException {
	    pp.ClickOnViewProduct();
	}

	@Then("Verify product name, category, price, availability, condition and brand is visible")
	public void verify_product_name_category_price_availability_condition_and_brand_is_visible() {
	    pp.GetProductName();
	    pp.Getcategorywomen();
	    pp.Getavailability();
	    pp.GetCondition();
	    pp.GetBrandName();
	}

	@Then("User enters Names as {string} and email addresses as {string} and adds a review here as {string}")
	public void user_enters_names_as_and_email_addresses_as_and_adds_a_review_here_as(String string, String string2, String string3) {
	    pp.EnterNameReview(string3);
	    pp.EnterEmailReview(string2);
	    pp.EnterRReview(string);
	}

	@Then("User clicks on Submit buttons")
	public void user_clicks_on_submit_buttons() {
	    pp.ClickonSubmit();
	}
//========================================================

	@Then("User hovers on Search textbox")
	public void user_hovers_on_search_textbox() {
	    sp.HoveronSearchProduct();
	}

	@Then("User enters  product name as {string} in search box")
	public void user_enters_product_name_as_in_search_box(String abc) {
	    sp.EnterProductName(abc);
	}

	@Then("User clicks on search icon")
	public void user_clicks_on_search_icon()  {
	    sp.ClickSubmitSearch();
	}

	@Then("Searched Products page is visible")
	public void searched_products_page_is_visible() throws InterruptedException {
	    sp.VerifySearchedproduct();

	}
	
	@Then("User adds Fancy G top in cart")
	public void user_adds_fancy_g_top_in_cart() throws InterruptedException {
	    sp.AddtoCartFancyGTop();
	}
	
	/*@Then("Verify product is added in cart effectively")
	public void verify_product_is_added_in_cart_effectively() {
	   sp.VerifySearchedproduct();
	}*/

	
	
	
	@Then("Verify product successfully  is addin cart for Fancy G top")
	public void verify_product_successfully_is_addin_cart_for_fancy_g_top() {
	    sp.ItemInCartafterLogin();
	}



	
//=======================================================
	@When("User scrolls to bottom of page, verify {string} are visible")
	public void user_scrolls_to_bottom_of_page_verify_are_visible(String string) throws InterruptedException {
	    pc.VerifyRecommenedItems();
	}

	@When("User clicks on Add to cart on recommended product")
	public void user_clicks_on_add_to_cart_on_recommended_product() throws InterruptedException {
	    pc.StylistDressCart();
	}



	
	
	
	
	//========================================================

	@When("User hovers on first product and clicks on Add to cart")
	public void user_hovers_on_first_product_and_clicks_on_add_to_cart() throws InterruptedException {
	    pc.HoverOn1stProduct();
	}

	@When("User click on Continue Shopping button")
	public void user_click_on_continue_shopping_button() throws InterruptedException {
	   pc.ClickOnContinueShoppingBTN();
	}

	@When("User  goes  on hover on second product and adds product on Add to cart")
	public void user_goes_on_hover_on_second_product_and_adds_product_on_add_to_cart() throws InterruptedException {
	    pc.HoverOn2ndProduct();
	}

	@When("User clicks on View Cart button")
	public void user_clicks_on_view_cart_button() throws InterruptedException {
	    pc.ClickOnViewCartBTN();
	}

	@Then("Verify both the products are added in cart")
	public void verify_both_the_products_are_added_in_cart() {
	    pc.AddedProductsInCart();
	}

	@Then("Verify their prices, quantity, and total price")
	public void verify_their_prices_quantity_and_total_price() {
	    pc.VerifyPrice();
	    pc.VerifyCartQuantity();
	    pc.VerifyTotalPrice();
	    
	}

	@When("User clicks on BlueTops description and directed on Product details page")
	public void user_clicks_on_blue_tops_description_and_directed_on_product_details_page() {
	   pc.ClickOnBlueTopLink();
	   
	}

	/*@When("User  Enter the quantity")
	public void user_increases_enters_the_quantity_as(String q) {
	    pc.EnterQuantity(q);
	}*/
	

	@When("User add in the cart for the  same product")
	public void user_add_in_the_cart_for_the_same_product() {
	    pc.ClickonAddtoCart();
	}



	@When("User clicks on X button corresponding to Mens Tshirt product")
	public void user_clicks_on_x_button_corresponding_to_mens_tshirt_product() {
	    pc.ClickonRemoveProductfromCart();
	}

	@Then("verify that the product is removed from the cart")
	public void verify_that_the_product_is_removed_from_the_cart() {
	    pc.VerifyMensTshirtRemovedCart();
	}

//==========================

	@When("User clicks on Proceed to Checkout")
	public void user_clicks_on_proceed_to_checkout() {
	    po.ClickOnProceedToCheckout();
	    
	}

	@When("User clicks on Register login successfully")
	public void user_clicks_on_register_login_successfully() {
		po.ClickOnRegisterLogin();
	}
	@When("User successfully clicks on CartLink")
	public void user_successfully_clicks_on_cart_link() {
	    po.ClickOnCartLink();
	}

	@Then("Verify that the delivery address and billing address is same as address filled at the time of registration of account")
	public void verify_that_the_delivery_address_and_billing_address_is_same_as_address_filled_at_the_time_of_registration_of_account() {
	    po.VerifyAddressBillingDelivery();
	}

	@Then("User scrolls and enter description in comment text area as {string} and click on Place Order")
	public void user_scrolls_and_enter_description_in_comment_text_area_as_and_click_on_place_order(String etc) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		po. EnterTextComment(etc);
		
		po.ClickOnPlaceOrder();
		
	}

	@Then("User enter payment details, as Name on card as {string} and Card number as {string} and cvc as {string} and Expiration date  month as {string} and  year as {string}")
	public void user_enter_payment_details_as_name_on_card_as_and_card_number_as_and_cvc_as_and_expiration_date_month_as_and_year_as(String enoc, String cv1, String eem, String eey, String string5) {
	    po.EnterNameOnCard(enoc);
	    po.EnterCardNumber(string5);
	    po.EnterCVC(cv1);
	    po.EnterExpiryMonth(eem);
	    po.EnterExpiryYear(eey);
	}



	
	@Then("User clicks on Pay and Confirm Order button")
	public void user_clicks_on_pay_and_confirm_order_button() {
	    po.ClickOnPayandConfirmOrder();
	    
	}

	@Then("Verify success message {string}")
	public void verify_success_message(String string) {
	    po.VerifyOrderPlaced();
	   
	}

	@Then("User clicks on Download button to get the invoice of order placed")
	public void user_clicks_on_download_button_to_get_the_invoice_of_order_placed() throws InterruptedException {
	    po.ClickOnDownloadInvoice();
	}






	@Then("User closes the browser")
	public void user_closes_the_browser() {
	    l.CloseBrowser();
	}
	
@After
public void tearDown() 
{
	driver.quit();
}

}
