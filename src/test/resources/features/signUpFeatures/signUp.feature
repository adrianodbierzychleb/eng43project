# Use cucumber test runner class to run all the scenarios together, otherwise run them separately by running each scenario

Feature: As a user
  I want to fill in the sign up form
  So that i can create an account.

  Scenario: I am navigated to the page to the 'Create an Account' form when I enter a valid email
    Given that I am on the sign-up page
    When I enter a valid email into the Email field in the ‘Create an Account’ section
    And I press ‘Create an account’
    Then I should be navigated to the ‘Create An Account’ form.


  Scenario: I can fill in the your personal information section on the create an account page.
    Given that I am on create account page
    When I select a title
    And I enter a valid first and last name
    And I enter a valid password
    And I select a birth date
    And I select Sign up for our newsletter
    And I select Receive special offers from our partners
    Then I can fill in the your address section of the form

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
    And I enter a valid home phone
    And I enter a valid mobile phone
    And I enter an address alias
    Then I can click register to create my account
