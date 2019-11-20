package com.spartaglobal.eng43project.StepDefs.SignUpStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YazStepDefs {

    public static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\Yasmin Jones\\Downloads\\chromedriver_win32\\chromedriver.exe");
    public static AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());

    @Given("that I am on create account page")
    public void that_I_am_on_create_account_page() {
        automationPracticeSite.getSignup().goToSignUpURL().inputEmail("jdjfi@gmail.com").clickCreateAccountButton();

    }

    @When("I select a title")
    public void i_select_a_title() {
        automationPracticeSite.getSignup().getTitle();
    }

    @When("I enter a valid first and last name")
    public void i_enter_a_valid_first_and_last_name() {
        automationPracticeSite.getSignup().inputFirstName("steve");
        automationPracticeSite.getSignup().inputLastname("smith");
    }

    @When("I enter a valid password")
    public void i_enter_a_valid_password() {
       automationPracticeSite.getSignup().inputPassword("qwert");
    }

    @When("I select a birth date")
    public void i_select_a_birth_date() {
        automationPracticeSite.getSignup().checkDayOptions();
        automationPracticeSite.getSignup().checkMonthOptions();
        automationPracticeSite.getSignup().checkYearOptions();
    }

    @When("I select Sign up for our newsletter")
    public void i_select_Sign_up_for_our_newsletter() {
        automationPracticeSite.getSignup().clickNewsletter();
    }

    @When("I select Receive special offers from our partners")
    public void i_select_Receive_special_offers_from_our_partners() {
        automationPracticeSite.getSignup().clickSpecialOffer();
    }

    @Then("I can fill in the your address section of the form")
    public void i_can_fill_in_the_your_address_section_of_the_form() {
        System.out.println("i can move on to the next step");
    }

}
