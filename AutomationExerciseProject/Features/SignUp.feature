Feature: SignUp

  Background: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"
    And User click on the SignUp/Login button
    Then User is directed on "New User Signup!" page and is visible

  Scenario: Successful registration with valid crendentials
    And User enter name as "shivam" and email address as "shivprcar2908@gmail.com"
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
    And User click on  Delete Account
    Then Page should be visible as "Account Deleted!"
    And User click on continue delete button

  @Smoke
  Scenario Outline: Successful Account already exist DDT
    And User enter name as "<name>" and email address as "<Email address>"
    And User click on Signup button

    Examples: 
      | name   | Email address         |
      | shivam |shivam.p@aol.com |
