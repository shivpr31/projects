Feature: ProductsinCart

  Background: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"

  Scenario: Add Products to cart, increase Product quantity and remove one product from cart
    When User clicks on Products link
    When User hovers on first product and clicks on Add to cart
    And User click on Continue Shopping button
    And User  goes  on hover on second product and adds product on Add to cart
    And User clicks on View Cart button
    Then Verify both the products are added in cart
    Then Verify their prices, quantity, and total price
    When User clicks on BlueTops description and directed on Product details page
    And User add in the cart for the  same product
    And User clicks on View Cart button
    And User clicks on X button corresponding to Mens Tshirt product
    Then verify that the product is removed from the cart

  Scenario: Add to cart from recommended items
    When User scrolls to bottom of page, verify 'RECOMMENDED ITEMS' are visible
    And User clicks on Add to cart on recommended product
    And User clicks on View Cart button
