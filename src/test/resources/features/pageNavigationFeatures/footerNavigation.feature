Feature: Footer navigation
  As a user I want to be able to navigate the site from the footer
  from any page so that I can have a better user experience

  @Footer
  Scenario Outline: If I click a link on the footer I will get to the URL of the link I clicked
    Given I am on any page

    When I click on the <link> on the footer

    Then I should be taken to the right <page>

    Examples:
    |link|page|