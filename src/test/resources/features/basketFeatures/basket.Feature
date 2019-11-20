Feature: Basket
  As a user I want to be able to add and remove items from the basket and view the total I would have to pay
  so I can easily purchase the right items

  Scenario: As a user I want to see all the items I have selected before I
  checkout so that I can keep track of the money I’m spending.
    Given I am in the cart summary page
    When I look at the items on the page
    And I look at the cart drop down menu information
    Then the amounts of items will be identical
    And the totals will be the same

  Scenario: As a user I want to select multiple items so that
  I can checkout only once while I have all the items I want.
    Given I am in Woman Catalog page
    When I have added multiple products using the quick view functionality to the cart
    Then I can process to payment by pressing the checkout button


  Scenario: As a user I want to select an item and write down the
  quantity instead of clicking multiple times so that I save time.
    Given I am at the summary page
    When I select an item
    And write down the quantity of items I want
    Then the amount typed by me will correspond to the quantity of items bought

  Scenario: As a user I want to see the tax and delivery costs I have to
  pay additionally so that I know how much more I have to pay.
    Given I am at the summary page
    When I finish selecting items
    Then the tax and delivery costs will be displayed correctly

  Scenario: As a user I want to reduce the quantity of items
  in my basket so that I make changes before I finalise my purchase.
    Given that I am in the cart drop down
    And I have selected a certain quantity of items
    When I want reduce items
    Then it will remove specified number of items

  Scenario: As a user I want to have an option to delete items from my cart summary
  so that I can get rid of an item if I change my mind.
    Given i am in Women Catalog page
    And I have selected Products to the cart/basket
    When I click the delete button for a product which I don’t want
    Then It will remove the product from the cart/basket

  Scenario: As a user I want to be able to remove products from my cart until the payment so
  that I can make sure I have the right amount of items I want to purchase.
    Given that I am on the payment page
    And I am able to select the cart menu
    When I remove a product from the cart
    Then the items displayed will not show that product
    And the total will be correct

  Scenario: As a user I want to be able to modify quantities of products within my cart until the payment
  so that I can make sure I have the right amount of items I want to purchase.
    Given that I am on the payment page
    And I am able to select the cart menu
    When I select an item
    And change the quantity of said item in the menu
    Then the correct amount of that item are displayed
    And the correct total cost is displayed


