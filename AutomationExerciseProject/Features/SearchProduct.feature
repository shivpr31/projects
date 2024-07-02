Feature: SearchProduct

  Scenario: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"
    When User clicks on Products link
    Then User is directed to ALL PRODUCTS visible page
    And User hovers on Search textbox
    And User enters  product name as "Fancy Green Top" in search box
    Then User clicks on search icon
    Then Searched Products page is visible
    And User adds Fancy G top in cart
    And User clicks on View Cart button
    And User clicks on Proceed to Checkout
    And User clicks on Register login successfully
    When User enter email address as "shivam.p@aol.com" and password as "Life@123"
    And User click on the Login button
    When User successfully clicks on CartLink
    Then Verify product successfully  is addin cart for Fancy G top

  Scenario Outline: Check if the product is searchable
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"
    When User clicks on Products link
    Then User is directed to ALL PRODUCTS visible page
    And User hovers on Search textbox
    And User enters  product name as "<Product name>" in search box
    Then User clicks on search icon
    Then Searched Products page is visible

    Examples: 
      | Product name                      |
      | Summer White Top                  |
      | GRAPHIC DESIGN MEN T SHIRT - BLUE |
