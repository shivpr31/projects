Feature: TestCases_APITesting_VideoTutorial

  Background: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"

  Scenario: Successful TestCase Linkname generation
    When User clicks on TestCases
    Then User is directed and is visible as "Test Cases"
    And User generates the linkname of the page

  Scenario: Successful APITesting clicking
    When User clicks on API Testing
    Then User sees and is visible as "APIs List for practice"
    And User generates the link names of the page displayed

  Scenario: Successful Video Tutorial clicking
    When User clicks on  Video Tutorials
    Then User navigates back to Home Page
