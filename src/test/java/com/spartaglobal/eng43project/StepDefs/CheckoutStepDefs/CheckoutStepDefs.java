package com.spartaglobal.eng43project.StepDefs.CheckoutStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefs {
    // TODO: 18/11/2019  Change your driver path to your own path!
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Fabio Fernandes\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());

    @Given("I have an account")
    public void i_have_an_account() {
        System.out.println("account working");
        automationPracticeSite.getBasket().addItemToBasket();
        automationPracticeSite.getBasket().proceedToCheckout();
    }

    @When("I attempt to change my address before the delivery")
    public void i_attempt_to_change_my_address_before_the_delivery() {
        System.out.println("Attempt to change delivery address");
    }

    @And("I am taken to the page to change my address")
    public void i_am_taken_to_the_page_to_change_my_address() {
        System.out.println("changing pages");
    }

    @And("I change my {string}")
    public void i_change_my(String string) {
        System.out.println("ability to change the address");
    }

    @Then("My delivery address should update")
    public void my_delivery_address_should_update() {
        System.out.println("updated address change");
    }
}
