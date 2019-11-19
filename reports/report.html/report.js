$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/signUpFeatures/signUp.feature");
formatter.feature({
  "name": "As a user, I want to be able to access the create account page",
  "description": "  So that I can enter my address in the \"Your Address\" section",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I can fill in the your address section on the create an account page.",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "error_message": "java.lang.NullPointerException\r\n\tat com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup.enterValidEmailIntoSIgnUp(Signup.java:38)\r\n\tat com.spartaglobal.eng43project.StepDefs.SignUpStepDefs.SignUpStepDefs.setup(SignUpStepDefs.java:20)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "that I am on the create account page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefs.that_I_am_on_the_create_account_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid fn \"firstName\"",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_fn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid ln \"lastName\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_ln(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid cpny \"company\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_cpny(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid a \"addressa\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_a(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid b \"addressb\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_b(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid cty \"city\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_cty(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select a state",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.select_a_state()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid pc \"postalCode\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_pc(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select a country",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.select_a_country()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter ai \"additionalInformation\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_ai(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid hp \"homePhone\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_hp(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid mp \"mobilePhone\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_mp(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter an aa \"addressAlias\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_an_aa(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I can click register to create my account",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefs.i_can_click_register_to_create_my_account()"
});
formatter.result({
  "status": "skipped"
});
});