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
<<<<<<< HEAD
formatter.step({
  "name": "I change my \"\u003caddress\u003e\"",
  "keyword": "And "
=======
formatter.before({
  "error_message": "java.lang.NullPointerException\r\n\tat com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup.\u003cinit\u003e(Signup.java:42)\r\n\tat com.spartaglobal.eng43project.StepDefs.SignUpStepDefs.SignUpStepDefs.setup(SignUpStepDefs.java:25)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
>>>>>>> signUp
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
<<<<<<< HEAD
  "name": "I attempt to change my address before the delivery",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutStepDefs.i_attempt_to_change_my_address_before_the_delivery()"
=======
  "name": "I enter a valid firstname",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_fn()"
>>>>>>> signUp
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