Feature: Subscription on Home and Cart page

  Background: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"

  Scenario: Verify Subscription on Home Page and scroll up arrow button
    When User scrolls down and "Subscription" text is displayed
    And User enters the emailaddress "abc100@gmail.com"
    And User clicks on circle arrow
    And User clicks on Scrollup arrow button on right

  Scenario: Verify Subscription on Cart Page
    When User clicks on Cart link
    When User scrolls down and "Subscription" text is displayed
    And User enters the emailaddress "abc100@gmail.com"
    And User clicks on circle arrow
