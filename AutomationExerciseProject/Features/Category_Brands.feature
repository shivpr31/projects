Feature: Category_Brands

  Background: 
    Given User Launch the Chrome Browser
    When User open the url as "https://automationexercise.com/"
    Then Page Title should be "Automation Exercise"

  Scenario: Category_Women_Tops
    When User clicks on plus sign
    Then User selects the Tops from the drop values
    Then Title of womens top should be  as "Automation Exercise"

  Scenario: Category_Men_Jeans
    When User clicks on a sign made of plus
    Then User chooses from the drop values as Jeans
    Then "Automation Exercise"  should be mens Page Title

  Scenario: Category_KIDS_Dress
    When User clicks Kids plus
    Then User decides for Dress from the options
    Then "Automation Exercise" should  be page Title of kids dress

  Scenario: Brands
    When User makes an attempt for ALLEN SOLLY JUNIOR
    Then "Automation Exercise"  should be title page for Brands
