Feature: Basket
  As a user I want to be able to add and remove items from the basket and view the total I would have to pay
  so I can easily purchase the right items

  Scenario: I am able to delete item in cart drop-down menu
    Given I am in woman catalog page
    When I select product to the cart drop-down menu
    Then I click the delete button for a product which i don't want

  Scenario: I am able to increase quantity in the basket summary page
    Given I am in woman catalog page
    And I select a product and process to checkout
    When I select the function to increase the quantity of the product
    Then I process to sign-in page toward payment

  Scenario: I am able to decrease quantity in the basket summary page
    Given I am in woman catalog page
    When I select a product and process to checkout
    Then I select the function to decrease the quantity of the product

  Scenario: As a user I want to see all the items I have selected before I
  checkout so that I can keep track of the money I’m spending.
    Given I am in the cart summary page
    When I look at the items on the page
    And I look at the cart drop down menu information
    Then the amounts of items will be identical
    And the totals will be the same

  Scenario: As a user I want to select multiple items so that
  I can checkout only once while I have all the items I want.
    Given I am in woman catalog page
    When I have added multiple products using the quick view functionality to the cart
    Then I can process to payment by pressing the checkout button
