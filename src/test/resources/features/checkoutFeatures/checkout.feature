Feature: Checkout
  As a user
  I want the ability to pay for items
  So that I can order items from the website

  #Scenario 51
  @outline
  Scenario Outline: If I want to update my delivery address I will be able to do so
        Given I am at the address page in the checkout
        When I click the update address button
        And I am taken to the page to change my address
        And I change my address with "<address>"
        And I change my city with "<city>"
        Then My delivery address should update


    Examples:
    |address        | city    |
    |126 Manor House| London  |
    |126 London Wall| Bristol |

  #Scenario 51
  @outline
  Scenario Outline: If I input an incorrect phone format then I will receive an error
        Given I am at the address page in the checkout
        When I click the update address button
        And I am taken to the page to change my address
        And I change my <phone number> with an incorrect format
        Then I receive an error message
    Examples:
      | phone number |
      |02089402333 |
      |0208940233  |
      | 0208940     |
      | 02089       |


      @Outline
      Scenario: As a user I want to be able to log in so that I can proceed to checkout
        Given I have added an item to the basket
        And I go to the basket via the checkout button
        And I press the proceed to checkout button in the summary
        And I am not signed in
        When I input my username password
        Then I will be redirected  to the address form


        @Outline
        Scenario: As a user I want to be able to sign up in order to proceed with the order
          Given I have added an item to the basket
          And I go to the basket via the checkout button
          And I press the proceed to checkout button in the summary
          And I do not own an account
          When I press sign up button
          Then I will be redirected to a sign up page in order to create an account


          @Outline
          Scenario: As a user I want to be able to get my order delivered to a different address
            Given I have items in my basket
            And I want to proceed to pay
            And I am logged in
            When I press the button to change address
            Then I should be able to select a new address


            @Outline
            Scenario: As a user I want to be able to change my billing address
              Given I have items in my basket
              And I want to proceed to pay
              When I press the change billing address button
              Then My delivery address should update



              Scenario: If I want to update my delivery address I will be able to do so
            Given I am at the address page in the checkout
            When I press the change billing address button
            And I change my address with "<address>"
            And I change my city with "<city>"
            Then My delivery address should update



