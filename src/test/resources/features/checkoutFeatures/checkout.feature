Feature: checkout
  as a user
  I want to pay
  and order items from the website

  @outline
  Scenario Outline: If I want to update my delivery address I will be able to do so
        Given I have an account
        When I attempt to change my address before the delivery
        And I am taken to the page to change my address
        And all the fields have been filled
        And I do not receive an <error>
        Then My delivery address should update

    Examples:



