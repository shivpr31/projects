Feature: ContactUs

  Scenario: Successfully enter the get in touch form details
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"
    When User click on the Contact Us button
    Then User is on  page "GET IN TOUCH" and will be visible
    And The User enters the name as "Cristaino"
    And User enters mail as "cr56@gmail.com"
    And User enters subject as "[BONUS] this is my best gift"
    And User enters the message as "I really loved the gift. Thank you much!"
    And User  clicks and enters the file as "C:\Users\Hiral Patel\Downloads\Amazontest.xlsx"
    And User click on Submit button
    Then User clicks on OK button
    Then User gets a message as "Success! Your details have been submitted successfully." is visible
    And User clicks on Home button
