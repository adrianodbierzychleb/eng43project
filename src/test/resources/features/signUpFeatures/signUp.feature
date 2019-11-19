Feature: As a user, I want to be able to access the create account page
  So that I can enter my address in the "Your Address" section

  Scenario: I can fill in the your address section on the create an account page.
  Given that I am on the create account page
    When I enter a valid first name
    And I enter a valid last name
    And I enter a valid company
    And I enter a valid first address
    And I enter a valid second address
    And I enter a valid city
    And select a state
    And I enter a valid post code
    And select a country
    And I enter additional information
    And I enter a valid hp home phone
    And I enter a valid mobile phone
    And I enter an address alias
    Then I can click register to create my account
