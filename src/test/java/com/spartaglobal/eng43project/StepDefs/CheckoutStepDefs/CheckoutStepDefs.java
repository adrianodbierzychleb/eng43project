package com.spartaglobal.eng43project.StepDefs.CheckoutStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefs {
    // TODO: 18/11/2019  Change your driver path to your own path!
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Bailee Beckles\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());

    @Given("I have an account")
    public void i_have_an_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I attempt to change my address before the delivery")
    public void i_attempt_to_change_my_address_before_the_delivery() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("I am taken to the page to change my address")
    public void i_am_taken_to_the_page_to_change_my_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("I change my {int} London wall")
    public void i_change_my_London_wall(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("My delivery address should update")
    public void my_delivery_address_should_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
