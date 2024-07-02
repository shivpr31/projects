Feature: Login

  Background: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"
    And User click on the SignUp/Login button
    Then User is on visible page "Login to your account"

  Scenario: Successful  Account Login and Logout
    When User enter email address as "shivam.p@aol.com" and password as "Life@123"
    And User click on the Login button
    Then Page directed as "Logged in as shivam" is visible
    And User click on the Loggout button
    Then User closes the browser

  Scenario Outline: Successful  Account not Login DDT
    When User enter email as "<Email>" and password as "<password>"
    And User click on the Login button
    Then User is on page "Your email or password is incorrect!" and is visible
    Then User closes the browser

    Examples: 
      | Email                  | password |
      | shivprcar180@gmail.com | shiv@123 |
      | cr787@gmail.com        | cr77     |
