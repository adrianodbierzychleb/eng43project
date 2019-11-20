Feature: Checkout
  As a user
  I want the ability to pay for items
  So that I can order items from the website

  #Scenario 51
  @outline
  Scenario Outline: If I want to update my delivery address I will be able to do so
        Given I have an account
        When I attempt to change my address before the delivery
        And I am taken to the page to change my address
        And I change my "<address>"
        And I change my "<city>"
        Then My delivery address should update


    Examples:
    |address        | city    |
    |126 Manor House| London  |
    |126 London Wall| Bristol |

  #Scenario 51
  @outline
  Scenario Outline: If I input an incorrect phone format then I will receive an error
        Given I have an account
        When I attempt to change my address before the delivery
        And I am taken to the page to change my address
        And I change my <phone number>
        Then I receive an error message
    Examples:
      | phone number |
      |02089402333 |
      |0208940233  |
      | 0208940     |
      | 02089       |


    @Outline
    Scenario: As a user I want to remove unwanted items from the basket
      Given I have an account
      And I want to pay for my order
      When I proceed to go to the summary page
      And I want to remove an item before paying
      Then The item should be removed from the basket
<<<<<<< HEAD
      
=======

      @Outline
      Scenario: As a user I want to be able to log in so that I can proceed to checkout
        Given I have added an item to the basket
        And I go to the basket via the checkout button
        And I press the proceed to checkout button in the summary
        And I am not signed in
        When I input my username password
        Then I will be redirected  to the address form



>>>>>>> checkout


