package com.spartaglobal.eng43project.StepDefs.SignUpStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class SignUpStepDefs {
    private static WebDriver driver;
    private static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Pawel Misiura\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private static AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    private static Signup signup;

    @Before
    public static void setup(){
        signup = new Signup(driver);
        automationPracticeSite.getSignup().goToSignUpURL();

    }

    @Given("that I am on the create account page")
    public void that_I_am_on_the_create_account_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid fn {string}")
    public void i_enter_a_valid_fn(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid ln {string}")
    public void i_enter_a_valid_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid cpny {string}")
    public void i_enter_a_valid_cpny(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid a {string}")
    public void i_enter_a_valid_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid b {string}")
    public void i_enter_a_valid_b(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid cty {string}")
    public void i_enter_a_valid_cty(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("select a state")
    public void select_a_state() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid pc {string}")
    public void i_enter_a_valid_pc(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("select a country")
    public void select_a_country() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter ai {string}")
    public void i_enter_ai(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid hp {string}")
    public void i_enter_a_valid_hp(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter a valid mp {string}")
    public void i_enter_a_valid_mp(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter an aa {string}")
    public void i_enter_an_aa(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I can click register to create my account")
    public void i_can_click_register_to_create_my_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



}
