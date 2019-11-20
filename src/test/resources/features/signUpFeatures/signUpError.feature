Feature: Testing invalid emails on authentication page

  @outline
  Scenario Outline: If I input incorrect email I will receive the correct error message
    Given I am on the sign-up page
    When I input a invalid <email>
    Then I receive the corresponding error <error>
    Examples:
      | email                     |                          error                                                                                       |
      | srehman@spartaglobal.com  |  An account using this email address has already been registered. Please enter a valid password or request a new one.|
      | dfgdsfg                   |  Invalid email address.                                                                                              |

