package com.spartaglobal.eng43project.StepDefs.CheckoutStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStepDefs {
    // TODO: 18/11/2019  Change your driver path to your own path!
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Fabio Fernandes\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());

    /**
     *   Scenario Outline: If I want to update my delivery address I will be able to do so
     */

    @Given("I am at the address page in the checkout")
    public void i_am_at_the_address_page_in_the_checkout() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I click the update address button")
    public void i_click_the_update_address_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("I am taken to the page to change my address")
    public void i_am_taken_to_the_page_to_change_my_address() {
        System.out.println("changing pages");
    }

    @And("I change my {string}")
    public void i_change_my(String string) {
        System.out.println("ability to change the address");
    }

    /**
     *   Scenario Outline: If I input an incorrect phone format then I will receive an error
     * @param int1
     */

    @And("I change my {int} with an incorrect format")
    public void i_change_my(Integer int1) {
        System.out.println("the number will be changed ");
    }

    @Then("My delivery address should update")
    public void my_delivery_address_should_update() {
        System.out.println("updated address change");
    }


    @Then("I receive an error message")
    public void iReceiveAnErrorMessage() {
    }


    /**
     *       Scenario: As a user I want to be able to log in so that I can proceed to checkout
     */

    @Given("I have added an item to the basket")
    public void iHaveAddedAnItemToTheBasket() {
        automationPracticeSite.getBasket().addItemToBasket();
    }

    @And("I go to the basket via the checkout button")
    public void iGoToTheBasketViaTheCheckoutButton() {
        automationPracticeSite.getBasket().proceedToCheckout();
    }

    @And("I press the proceed to checkout button in the summary")
    public void iPressTheProceedToCheckoutButtonInTheSummary() {
        automationPracticeSite.getBasket().proceedToSummary();
    }

    @And("I am not signed in")
    public void iAmNotSignedIn() {
        System.out.println("not signed in");
    }

    @When("I input my username password")
    public void iInputMyUsernamePassword() {
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
    }

    @Then("I will be redirected  to the address form")
    public void iWillBeRedirectedToTheAddressForm() {
        System.out.println("Address form link");
    }

    /**
     *         Scenario: As a user I want to be able to sign up in order to proceed with the order
     */

    @And("I do not own an account")
    public void iDoNotOwnAnAccount() {
        
    }

    @When("I press sign up button")
    public void iPressSignUpButton() {
    }

    @Then("I will be redirected to a sign up page in order to create an account")
    public void iWillBeRedirectedToASignUpPageInOrderToCreateAnAccount() {
    }
}
