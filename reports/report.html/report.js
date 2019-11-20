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
formatter.step({
  "name": "that I am on the create account page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefs.that_I_am_on_the_create_account_page()"
});
formatter.result({
  "error_message": "java.lang.ExceptionInInitializerError\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:40)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:32)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n\tat ✽.that I am on the create account page(classpath:features/signUpFeatures/signUp.feature:5)\r\nCaused by: java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\Pawel Misiura\\Downloads\\chromedriver_win32\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:147)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:142)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:363)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:131)\r\n\tat com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig.\u003cinit\u003e(SeleniumConfig.java:19)\r\n\tat com.spartaglobal.eng43project.StepDefs.SignUpStepDefs.SignUpStepDefs.\u003cclinit\u003e(SignUpStepDefs.java:17)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:40)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:32)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter a valid first name",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid last name",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid company",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_company()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid first address",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_first_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid second address",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_second_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid city",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_city()"
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
  "name": "I enter a valid post code",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_post_code()"
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
  "name": "I enter additional information",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_additional_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid home phone",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_home_phone()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter a valid mobile phone",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_mobile_phone()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter an address alias",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_an_address_alias()"
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
formatter.step({
  "name": "that I am on the sign-up page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefs.that_I_am_on_the_sign_up_page()"
});
formatter.result({
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class com.spartaglobal.eng43project.StepDefs.SignUpStepDefs.SignUpStepDefs\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:40)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:32)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n\tat ✽.that I am on the sign-up page(classpath:features/signUpFeatures/signUpCreateAccount.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter a valid email into the Email field in the ‘Create an Account’ section",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_email_into_the_Email_field_in_the_Create_an_Account_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I press ‘Create an account’",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_press_Create_an_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should be navigated to the ‘Create An Account’ form.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefs.i_should_be_navigated_to_the_Create_An_Account_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("classpath:features/signUpFeatures/yazCreateAccount.feature");
formatter.feature({
  "name": "As a user i want to be able to access the \u0027create account\u0027",
  "description": "  page so that i can enter my information on the \u0027your personal information\u0027\n  field of the form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I can fill in the your personal information section on the create an account page.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that I am on create account page",
  "keyword": "Given "
});
formatter.match({
  "location": "YazStepDefs.that_I_am_on_create_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a title",
  "keyword": "When "
});
formatter.match({
  "location": "YazStepDefs.i_select_a_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid first and last name",
  "keyword": "And "
});
formatter.match({
  "location": "YazStepDefs.i_enter_a_valid_first_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid password",
  "keyword": "And "
});
formatter.match({
  "location": "YazStepDefs.i_enter_a_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a birth date",
  "keyword": "And "
});
formatter.match({
  "location": "YazStepDefs.i_select_a_birth_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Sign up for our newsletter",
  "keyword": "And "
});
formatter.match({
  "location": "YazStepDefs.i_select_Sign_up_for_our_newsletter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Receive special offers from our partners",
  "keyword": "And "
});
formatter.match({
  "location": "YazStepDefs.i_select_Receive_special_offers_from_our_partners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can fill in the your address section of the form",
  "keyword": "Then "
});
formatter.match({
  "location": "YazStepDefs.i_can_fill_in_the_your_address_section_of_the_form()"
});
formatter.result({
  "status": "passed"
});
});