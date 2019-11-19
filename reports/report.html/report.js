$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/checkoutFeatures/checkout.feature");
formatter.feature({
  "name": "Checkout",
  "description": "  As a user\n  I want the ability to pay for items\n  So that I can order items from the website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "If I want to update my delivery address I will be able to do so",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@outline"
    }
  ]
});
formatter.step({
  "name": "I have an account",
  "keyword": "Given "
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.step({
  "name": "I change my \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I change my \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "My delivery address should update",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "address",
        "city"
      ]
    },
    {
      "cells": [
        "126 Manor House",
        "London"
      ]
    },
    {
      "cells": [
        "126 London Wall",
        "Bristol"
      ]
    }
  ]
});
formatter.scenario({
  "name": "If I want to update my delivery address I will be able to do so",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@outline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have an account",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I change my \"126 Manor House\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I change my \"London\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "My delivery address should update",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "If I want to update my delivery address I will be able to do so",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@outline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have an account",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I change my \"126 London Wall\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I change my \"Bristol\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "My delivery address should update",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("classpath:features/signUpFeatures/signUpCreateAccount.feature");
formatter.feature({
  "name": "Create account",
  "description": "  As a user I want to create an account\n  So that I can buy my items",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I am navigated to the page to the \u0027Create an Account\u0027 form when I enter a valid email",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that I am on the sign-up page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefs.that_I_am_on_the_sign_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid email into the Email field in the ‘Create an Account’ section",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_email_into_the_Email_field_in_the_Create_an_Account_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press ‘Create an account’",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_press_Create_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to the ‘Create An Account’ form.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefs.i_should_be_navigated_to_the_Create_An_Account_form()"
});
formatter.result({
  "status": "passed"
});
});