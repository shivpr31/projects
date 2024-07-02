Feature: VerifyAllProducts&productdetailpage

  Background: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"
    When User clicks on Products link
    Then User is directed to ALL PRODUCTS visible page
    And User clicks on View Product of first product

  Scenario: VerifyAllProducts page and Product details & Review Product
    Then Verify product name, category, price, availability, condition and brand is visible
    And User enters Names as "Shivam" and email addresses as "shiv@gmail.com" and adds a review here as "This is wonderful and must get it. Loved it"
    And User clicks on Submit buttons
