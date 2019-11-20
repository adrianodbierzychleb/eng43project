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
formatter.step({
  "name": "I have an account",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckoutStepDefs.i_have_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutStepDefs.i_attempt_to_change_my_address_before_the_delivery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_am_taken_to_the_page_to_change_my_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my \"126 Manor House\"",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_change_my(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my \"London\"",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_change_my(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My delivery address should update",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutStepDefs.my_delivery_address_should_update()"
});
formatter.result({
  "status": "passed"
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
formatter.step({
  "name": "I have an account",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckoutStepDefs.i_have_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutStepDefs.i_attempt_to_change_my_address_before_the_delivery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_am_taken_to_the_page_to_change_my_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my \"126 London Wall\"",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_change_my(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my \"Bristol\"",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_change_my(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My delivery address should update",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutStepDefs.my_delivery_address_should_update()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "If I input an incorrect phone format then I will receive an error",
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
  "name": "I change my \u003cphone number\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "phone number"
      ]
    },
    {
      "cells": [
        "02089402333"
      ]
    },
    {
      "cells": [
        "0208940233"
      ]
    },
    {
      "cells": [
        "0208940"
      ]
    },
    {
      "cells": [
        "02089"
      ]
    }
  ]
});
formatter.scenario({
  "name": "If I input an incorrect phone format then I will receive an error",
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
formatter.match({
  "location": "CheckoutStepDefs.i_have_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutStepDefs.i_attempt_to_change_my_address_before_the_delivery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_am_taken_to_the_page_to_change_my_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my 02089402333",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "If I input an incorrect phone format then I will receive an error",
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
formatter.match({
  "location": "CheckoutStepDefs.i_have_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutStepDefs.i_attempt_to_change_my_address_before_the_delivery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_am_taken_to_the_page_to_change_my_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my 0208940233",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "If I input an incorrect phone format then I will receive an error",
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
formatter.match({
  "location": "CheckoutStepDefs.i_have_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutStepDefs.i_attempt_to_change_my_address_before_the_delivery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_am_taken_to_the_page_to_change_my_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my 0208940",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "If I input an incorrect phone format then I will receive an error",
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
formatter.match({
  "location": "CheckoutStepDefs.i_have_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutStepDefs.i_attempt_to_change_my_address_before_the_delivery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the page to change my address",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStepDefs.i_am_taken_to_the_page_to_change_my_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my 02089",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});