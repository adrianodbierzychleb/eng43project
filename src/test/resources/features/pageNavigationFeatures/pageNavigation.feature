Feature: Navigate between pages
  As a user I want to be able to navigate from the homepage to the various categories
  so that I can look at categories of products

  Scenario Outline: If I click on a category in the navigation bar, from the homepage, then I will be directed
  to that category page.
    Given I am at the Homepage
    When I click on a <category>
    Then I am navigated to the <categoryURL> page

    Examples:
      |category |categoryURL                                                              |
      | Women   |http://automationpractice.com/index.php?id_category=3&controller=category|
      | Dresses |http://automationpractice.com/index.php?id_category=8&controller=category|
      | T-Shirts|http://automationpractice.com/index.php?id_category=8&controller=category|

Feature: Navigate to sub-category
  As a user I want to be able to navigate into the sub-categories from the navigation bar
  so that I can look at specific products

Scenario Outline: If i click on a sub-category in the navigation bar, from the homepage, then I will be directed
to that category page.
  Given I am able to access the navigation bar
  When I click on a <subCategory> under a <specific> category
  Then I am navigated to the <subCategoryURL> page

  Examples:
    |subCategory         |specific |subCategoryURL                                                             |
    |T-Shirts            | Women   |http://automationpractice.com/index.php?id_category=5&controller=category |
    |Blouses             | Women   |http://automationpractice.com/index.php?id_category=7&controller=category  |
    |Casual Dresses      | Women   |http://automationpractice.com/index.php?id_category=9&controller=category  |
    |Evening Dresses     | Women   |http://automationpractice.com/index.php?id_category=10&controller=category |
    |Summer Dresses      | Women   |http://automationpractice.com/index.php?id_category=11&controller=category |
    |Casual Dresses      | Dresses |http://automationpractice.com/index.php?id_category=9&controller=category  |
    |Evening Dresses     | Dresses |http://automationpractice.com/index.php?id_category=10&controller=category |
    |Summer Dresses      | Dresses |http://automationpractice.com/index.php?id_category=11&controller=category |

Feature: Information Link
  As a user, I want to be able to use the information link on the sidebar
  so It takes me to the information page

  Scenario Outline: If I click on the information button on the side bar of any given page on the website
    then I will be directed to the information page.
    Given I am on a page
    When I click the information <link>
    Then I should be directed to the <informationPageURL>

    Examples:
      | link                      |informationPageURL                                             |
      |Delivery                   |http://automationpractice.com/index.php?id_cms=1&controller=cms|
      |Legal Notice               |http://automationpractice.com/index.php?id_cms=2&controller=cms|
      |Terms and conditions of use|http://automationpractice.com/index.php?id_cms=3&controller=cms|
      |About us                   |http://automationpractice.com/index.php?id_cms=4&controller=cms|
      |Secure payment             |http://automationpractice.com/index.php?id_cms=5&controller=cms|
      |Our stores                 |http://automationpractice.com/index.php?controller=stores      |