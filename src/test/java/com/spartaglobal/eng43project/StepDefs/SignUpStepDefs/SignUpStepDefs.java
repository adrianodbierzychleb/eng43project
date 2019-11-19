package com.spartaglobal.eng43project.StepDefs.SignUpStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class SignUpStepDefs {

    // TODO: 18/11/2019  Change your driver path to your own path!
   // private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Shmaila Rehman\\Downloads\\chromedriver_win32\\chromedriver.exe");
  //  private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());

    public static WebDriver driver;
    public static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Pawel Misiura\\Downloads\\chromedriver_win32\\chromedriver.exe");
    public static AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    public static Signup signup;


    @Before
    public static void setup(){
        automationPracticeSite.getSignup().goToSignUpURL().inputEmail("jdjfi@gmail.com").clickCreateAccountButton();
        signup = new Signup(driver);
    }

    @Given("that I am on the create account page")
    public void that_I_am_on_the_create_account_page() {
        signup.inputFirstNameIntoYourAddressSection("steve");
    }

    @When("I enter a valid first name")
    public void i_enter_a_valid_first_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid last name")
    public void i_enter_a_valid_last_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid company")
    public void i_enter_a_valid_company() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid first address")
    public void i_enter_a_valid_first_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid second address")
    public void i_enter_a_valid_second_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid city")
    public void i_enter_a_valid_city() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("select a state")
    public void select_a_state() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid post code")
    public void i_enter_a_valid_post_code() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("select a country")
    public void select_a_country() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter additional information")
    public void i_enter_additional_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid hp home phone")
    public void i_enter_a_valid_hp_home_phone() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid mobile phone")
    public void i_enter_a_valid_mobile_phone() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter an address alias")
    public void i_enter_an_address_alias() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I can click register to create my account")
    public void i_can_click_register_to_create_my_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
