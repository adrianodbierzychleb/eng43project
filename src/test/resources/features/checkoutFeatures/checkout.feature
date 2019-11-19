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



#Feature: As a registered user,
#  I want to be able to delete my address
#  So that I can remove any unwanted addresses
#
#
#  Scenario Outline: If I want to delete my delivery address I will be able to do  so
#    Given I have an account
#    When I attempt to delete my address
#    And I delete my "<address>"
#    Then My address should be deleted
#
#    Examples:
#      | address |



