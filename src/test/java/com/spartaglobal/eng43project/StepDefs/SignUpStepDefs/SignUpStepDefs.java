package com.spartaglobal.eng43project.StepDefs.SignUpStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignUpStepDefs {

    // TODO: 18/11/2019  Change your driver path to your own path!
<<<<<<< HEAD
    private static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Shmaila Rehman\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private static AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    private static Signup signup;

    @Before
    public static void setup(){
        signup = new Signup(seleniumConfig.getDriver());
    }

//    @Given("that I am on the create account page")
//    public void that_I_am_on_the_create_account_page() {
//
//    }
//
//    @When("I enter a valid fn {string}")
//    public void i_enter_a_valid_fn(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter a valid ln {string}")
//    public void i_enter_a_valid_ln(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter a valid cpny {string}")
//    public void i_enter_a_valid_cpny(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter a valid a {string}")
//    public void i_enter_a_valid_a(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter a valid b {string}")
//    public void i_enter_a_valid_b(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter a valid cty {string}")
//    public void i_enter_a_valid_cty(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("select a state")
//    public void select_a_state() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter a valid pc {string}")
//    public void i_enter_a_valid_pc(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("select a country")
//    public void select_a_country() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter ai {string}")
//    public void i_enter_ai(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter a valid hp {string}")
//    public void i_enter_a_valid_hp(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter a valid mp {string}")
//    public void i_enter_a_valid_mp(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("I enter an aa {string}")
//    public void i_enter_an_aa(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("I can click register to create my account")
//    public void i_can_click_register_to_create_my_account() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }


    @Given("that I am on the sign-up page")
    public void that_I_am_on_the_sign_up_page() {
        automationPracticeSite.getSignup().goToSignUpURL();
    }

    @When("I enter a valid email into the Email field in the ‘Create an Account’ section")
    public void i_enter_a_valid_email_into_the_Email_field_in_the_Create_an_Account_section() {
        signup.inputEmail("sdf@gmail.com");
    }

    @And("I press ‘Create an account’")
    public void i_press_Create_an_account() {
        signup.clickCreateAccountButton();
    }


    @Then("I should be navigated to the ‘Create An Account’ form.")
    public void i_should_be_navigated_to_the_Create_An_Account_form() {
        signup.goToCreateAccountPage();
=======
   // private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Shmaila Rehman\\Downloads\\chromedriver_win32\\chromedriver.exe");
  //  private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());


    public static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Pawel Misiura\\Downloads\\chromedriver_win32\\chromedriver.exe");
    public static AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());


    @Given("that I am on the create account page")
    public void that_I_am_on_the_create_account_page() {
        automationPracticeSite.getSignup().goToSignUpURL().inputEmail("jdjfi@gmail.com").clickCreateAccountButton();

    }

    @When("I enter a valid first name")
    public void i_enter_a_valid_first_name() {
        automationPracticeSite.getSignup().inputFirstNameIntoYourAddressSection("Steve");

    }

    @And("I enter a valid last name")
    public void i_enter_a_valid_last_name() {
        automationPracticeSite.getSignup().inputLastNameIntoYourAddressSection("Smith");
    }

    @When("I enter a valid company")
    public void i_enter_a_valid_company() {
        automationPracticeSite.getSignup().inputCompanyIntoYourAddressSection("Sparta Global");
    }

    @When("I enter a valid first address")
    public void i_enter_a_valid_first_address() {
        automationPracticeSite.getSignup().inputAddress1IntoYourAddressSection("125 London Road");
    }

    @When("I enter a valid second address")
    public void i_enter_a_valid_second_address() {
        automationPracticeSite.getSignup().inputAddress2IntoYourAddressSection("London Wall");
    }

    @When("I enter a valid city")
    public void i_enter_a_valid_city() {
        automationPracticeSite.getSignup().inputCityIntoYourAddressSection("London");
    }

    @When("select a state")
    public void select_a_state() {
        System.out.println("doesnt get a state yet");
    }

    @When("I enter a valid post code")
    public void i_enter_a_valid_post_code() {
        automationPracticeSite.getSignup().inputPostCodeIntoYourAddressSection("12345");
    }

    @When("select a country")
    public void select_a_country() {
        System.out.println("doesnt input country yet");
    }

    @When("I enter additional information")
    public void i_enter_additional_information() {
        automationPracticeSite.getSignup().inputAdditionalInfoIntoYourAddressSection("here is some additional information");
    }

    @When("I enter a valid home phone")
    public void i_enter_a_valid_home_phone() {
        automationPracticeSite.getSignup().inputHomePhoneInfoIntoYourAddressSection("020819283273");
    }

    @When("I enter a valid mobile phone")
    public void i_enter_a_valid_mobile_phone() {
        automationPracticeSite.getSignup().inputMobilePhoneInfoIntoYourAddressSection("07892837261");
    }

    @When("I enter an address alias")
    public void i_enter_an_address_alias() {
        automationPracticeSite.getSignup().inputAliasInfoIntoYourAddressSection("This is my address alias");
    }

    @Then("I can click register to create my account")
    public void i_can_click_register_to_create_my_account() {
      //  automationPracticeSite.getSignup().clickCreateAccountButton();
>>>>>>> signUp
    }

    @Given("that I am on the sign-up page")
    public void that_I_am_on_the_sign_up_page() {
        automationPracticeSite.getSignup().goToSignUpURL();
    }
    @When("I enter a valid email into the Email field in the ‘Create an Account’ section")
    public void i_enter_a_valid_email_into_the_Email_field_in_the_Create_an_Account_section() {
        automationPracticeSite.getSignup().inputEmail("sdf@gmail.com");
    }
    @And("I press ‘Create an account’")
    public void i_press_Create_an_account() {
        automationPracticeSite.getSignup().clickCreateAccountButton();
    }

    @Then("I should be navigated to the ‘Create An Account’ form.")
    public void i_should_be_navigated_to_the_Create_An_Account_form() {
        automationPracticeSite.getSignup().goToCreateAccountPage();
    }

}
