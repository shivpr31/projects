Feature: PlaceOrder

  Background: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"

  Scenario: Place Order  register while at checkout, delivery and billing address is same and download invvoice
    When User hovers on first product and clicks on Add to cart
    And User clicks on View Cart button
    And User clicks on Proceed to Checkout
    And User clicks on Register login successfully
    And User click on the SignUp/Login button
    And User enter name as "shivam" and email address as "shivprcar3101@gmail.com"
    And User click on Signup button
    Then Page should be "Enter Account Information" is visible
    And User clicks on "Mr" Title
    And User enters password as "shiv@123"
    And User selects date of  birth  day as "5"
    And User selects month as "February"
    And User selects year as "1985"
    And User click on Sign up for our newsletter
    And User click on Receive special offers from our partners
    And User enters first name as "Shivam"
    And User  enters last name as "P"
    And User enters company as "CT"
    And User enters address as "XYZ Street"
    And User selects Country as "United States"
    And User enters state  as "Maharashtra"
    And User enters city as "Mumbai"
    And User enters zipcode as "400001"
    And User enters mobile number as "99022716180"
    And User clicks on Create Account button
    Then Page should be visible as "Account Created!"
    And User click on continue button
    Then Page directed as "Logged in as shivam" is visible
    When User successfully clicks on CartLink
    And User clicks on Proceed to Checkout
    Then Verify that the delivery address and billing address is same as address filled at the time of registration of account
    And User scrolls and enter description in comment text area as "This is lovely" and click on Place Order
    And User enter payment details, as Name on card as "shivam" and Card number as "AX123b876" and cvc as "B29" and Expiration date  month as "27" and  year as "2029"
    And User clicks on Pay and Confirm Order button
    Then Verify success message "Your order has been placed successfully!"
    And User clicks on Download button to get the invoice of order placed
    And User click on  Delete Account
    Then Page should be visible as "Account Deleted!"
    And User click on continue button

  Scenario: Place Order when User register before checkout
    When User click on the SignUp/Login button
    And User enter name as "shivam" and email address as "shivprcar1236@gmail.com"
    And User click on Signup button
    Then Page should be "Enter Account Information" is visible
    And User clicks on "Mr" Title
    And User enters password as "shiv@123"
    And User selects date of  birth  day as "5"
    And User selects month as "February"
    And User selects year as "1985"
    And User click on Sign up for our newsletter
    And User click on Receive special offers from our partners
    And User enters first name as "Shivam"
    And User  enters last name as "P"
    And User enters company as "CT"
    And User enters address as "XYZ Street"
    And User selects Country as "United States"
    And User enters state  as "Maharashtra"
    And User enters city as "Mumbai"
    And User enters zipcode as "400001"
    And User enters mobile number as "99022716180"
    And User clicks on Create Account button
    Then Page should be visible as "Account Created!"
    And User click on continue button
    Then Page directed as "Logged in as shivam" is visible
    When User hovers on first product and clicks on Add to cart
     And User clicks on View Cart button
    And User clicks on Proceed to Checkout
    Then Verify that the delivery address and billing address is same as address filled at the time of registration of account
    And User scrolls and enter description in comment text area as "This is lovely" and click on Place Order
    And User enter payment details, as Name on card as "shivam" and Card number as "AX123b876" and cvc as "B29" and Expiration date  month as "27" and  year as "2029"
    And User clicks on Pay and Confirm Order button
    Then Verify success message "Your order has been placed successfully!"
    And User click on  Delete Account
    Then Page should be visible as "Account Deleted!"
    And User click on continue button

  Scenario: Place Order: Login before before checkout
    When User click on the SignUp/Login button
    When User enter email address as "shivam.p@aol.com" and password as "Life@123"
    And User click on the Login button
    Then Page directed as "Logged in as shivam" is visible
    When User hovers on first product and clicks on Add to cart
     And User clicks on View Cart button
    And User clicks on Proceed to Checkout
    Then Verify that the delivery address and billing address is same as address filled at the time of registration of account
    And User scrolls and enter description in comment text area as "This is lovely" and click on Place Order
    And User enter payment details, as Name on card as "shivam" and Card number as "AX123b876" and cvc as "B29" and Expiration date  month as "27" and  year as "2029"
    And User clicks on Pay and Confirm Order button
    Then Verify success message "Your order has been placed successfully!"
    
