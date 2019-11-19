Feature: Create account
  As a user I want to create an account
  So that I can buy my items

  Scenario: I am navigated to the page to the 'Create an Account' form when I enter a valid email
<<<<<<< HEAD

=======
>>>>>>> signUp
    Given that I am on the sign-up page
    When I enter a valid email into the Email field in the ‘Create an Account’ section
    And I press ‘Create an account’
    Then I should be navigated to the ‘Create An Account’ form.