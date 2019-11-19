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


    