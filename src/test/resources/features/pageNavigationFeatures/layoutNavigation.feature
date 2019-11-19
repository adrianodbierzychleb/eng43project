Feature: Layout navigation
  As a user I want to be able to customise the layout when viewing the products
  so that the products are easier to view.

  Scenario Outline: If I click on the displayed layout options above the displayed products, from the homepage,
  then I will view the products in the selected layout.
    Given I am on the products page
    When I specify the <layout> view
    Then I should see the products in that given layout
    Examples:
      |layout|
      |grid  |
      |list  |