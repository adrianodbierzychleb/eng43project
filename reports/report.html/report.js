$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/signUpFeatures/signUp.feature");
formatter.feature({
  "name": "As a user I want to fill in the sign up form so that i can create an account/",
  "description": "",
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
formatter.scenario({
  "name": "I can fill in the your personal information section on the create an account page.",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that I am on create account page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefs.that_I_am_on_create_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a title",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefs.i_select_a_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid first and last name",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_first_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid password",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_enter_a_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a birth date",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefs.i_select_a_birth_date()"
});
