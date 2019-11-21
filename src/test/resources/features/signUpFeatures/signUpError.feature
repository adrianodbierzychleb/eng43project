##****** WORKING AUTHENTICATION PAGE EMAIL ERROR TESTS FOR CREATE ACCOUNT*************

#Feature: Testing invalid emails on authentication page
#  As a user
#  I want to be able to sign up
#  So that I can purchase products
#
#  @outline
#  Scenario Outline: If I input incorrect email I will receive the correct error message
#    Given I am on the sign-up page
#    When I input a invalid <email>
#    Then I receive the corresponding error <error>
#    Examples:
#      | email                     |                          error                                                                                       |
#      | srehman@spartaglobal.com  |  An account using this email address has already been registered. Please enter a valid password or request a new one.|
#      | dfgdsfg                   |  Invalid email address.                                                                                              |
#
