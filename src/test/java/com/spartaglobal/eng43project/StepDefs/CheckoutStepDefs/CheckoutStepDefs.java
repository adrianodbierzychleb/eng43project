package com.spartaglobal.eng43project.StepDefs.CheckoutStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CheckoutStepDefs {
    // TODO: 18/11/2019  Change your driver path to your own path!


    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Dana Korang-Awua\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());

    /**
     *   Scenario Outline: If I want to update my delivery address I will be able to do so
     */

    @Given("I am at the address page in the checkout")
    public void i_am_at_the_address_page_in_the_checkout() {
        automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout().proceedToSummary();
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
       String currUrl =  seleniumConfig.getDriver().getCurrentUrl();
      //  Assert.assertEquals("http://automationpractice.com/index.php?controller=order&step=1",currUrl);
    }

    @When("I click the update address button")
    public void i_click_the_update_address_button() {
        automationPracticeSite.getCheckout().clickDeliveryAddressUpdateButton();
    }

    @And("I am taken to the page to change my address")
    public void i_am_taken_to_the_page_to_change_my_address() {
        String currUrl = seleniumConfig.getDriver().getCurrentUrl();
      //  Assert.assertEquals("http://automationpractice.com/index.php?controller=address&back=order.php%3Fstep%3D1&id_address=239178",currUrl);
    }

    @And("I change my address with {string}")
    public void i_change_my_address(String string) {
        seleniumConfig.getDriver().findElement(By.id("address1")).clear();
        automationPracticeSite.getSignup().inputAddress1IntoYourAddressSection(string);
    }

    @And("I change my city with {string}")
    public void i_change_my_city(String string) {
        seleniumConfig.getDriver().findElement(By.id("city")).clear();
        automationPracticeSite.getSignup().inputCityIntoYourAddressSection(string);
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
        automationPracticeSite.getCheckout().clickSaveAddressButton();
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


    @When("I press sign up button")
    public void iPressSignUpButton() {
        automationPracticeSite.getSignup().inputEmail("test4321@test.com");
        automationPracticeSite.getSignup().clickCreateAccountButton();
    }

    @Then("I will be redirected to a sign up page in order to create an account")
    public void iWillBeRedirectedToASignUpPageInOrderToCreateAnAccount() {
        System.out.println("in signup");
    }



    // As a user I want to be able to get my order delivered to a different address

    /**
     *           Scenario: As a user I want to be able to get my order delivered to a different address
     */


    @Given("I have items in my basket")
    public void iHaveItemsInMyBasket() {
        automationPracticeSite.getBasket().addItemToBasket();
    }

    @And("I want to proceed to pay")
    public void iWantToProceedToPay() {
        automationPracticeSite.getBasket().proceedToCheckout().proceedToSummary();

    }

    @And("I am logged in")
    public void iAmLogedIn() {
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
    }

    @When("I press the button to change address")
    public void iPressTheButtonToChangeAddress() {
        automationPracticeSite.getCheckout().clickDropDownMenu();
    }

    @Then("I should be able to select a new address")
    public void iShouldBeAbleToSelectANewAddress() {
        automationPracticeSite.getCheckout().selectAddressFromDropDown();
        automationPracticeSite.getCheckout().clickDropDownMenu();
    }


    /**
    * Scenario : I want to be able to change my billing address
     */



    @When("I press the change billing address button")
    public void iPressTheChangeBillingAddressButton() {
        automationPracticeSite.getCheckout().clickBillingUpdateButton();
    }

    @Then("I should be able to alter my billing address")
    public void iShouldBeAbleToAlterMyBillingAddress() {
        String currentUrl = seleniumConfig.getDriver().getCurrentUrl();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=address&back=order.php%3Fstep%3D1&id_address=237923",currentUrl);
        automationPracticeSite.getCheckout().clickSaveAddressButton();
    }



    // Scenario add comment to order

    @Given("I have an item in my basket")
    public void iHaveAnItemInMyBasket() {
        automationPracticeSite.getBasket().addItemToBasket();
        automationPracticeSite.getBasket().proceedToCheckout().proceedToSummary();
    }

    @And("I am logged in to my account")
    public void iAmLoggedInToMyAccount() {
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
    }

    @When("I add a comment to the text box")
    public void iAddACommentToTheTextBox() {
        automationPracticeSite.getCheckout().fillInCommentBox();
    }

    @Then("The order should proceed to the next tab with the comment")
    public void theOrderShouldProceedToTheNextTabWithTheComment() {
        automationPracticeSite.getCheckout().clickProceedToCheckoutAddress();
    }

    /**
     *   Scenario Outline: As a user I want to be able to add a new address
     */

    @When("I press the add new address button")
    public void i_press_the_add_new_address_button() {
        automationPracticeSite.getCheckout().clickDeliveryAddAddressButton();
    }

    @Then("I should be redirected to the address form")
    public void i_should_be_redirected_to_the_address_form() {
        String addAddressCurrentURL = seleniumConfig.getDriver().getCurrentUrl();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=address&back=order.php%3Fstep%3D1", addAddressCurrentURL);
    }
    // Scenario Tick Terms and Conditions Box

    @Given("I have proceeded to the shipping tab")
    public void iHaveProceededToTheShippingTab() {
        automationPracticeSite.getBasket().addItemToBasket();
        automationPracticeSite.getBasket().proceedToCheckout().proceedToSummary();
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
        automationPracticeSite.getCheckout().clickProceedToCheckoutAddress();
    }

    @When("I click the terms and conditions box")
    public void iClickTheTermsAndConditionsBox() {
        automationPracticeSite.getCheckout().agreeTermsConditions();
    }

    @Then("I should be taken to the payment page")
    public void iShouldBeTakenToThePaymentPage() {
        automationPracticeSite.getCheckout().clickProceedToCheckoutShipping();
    }

    /**
     *   Scenario Outline: As I user I want the option to pay by bank wire
     */

    @Given("I click the pay by bank wire option")
    public void i_click_the_pay_by_bank_wire_option() {
        automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout().proceedToSummary();
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com", "spartaglobal");

       automationPracticeSite.getCheckout().clickProceedToCheckoutAddress().agreeTermsConditions().clickProceedToCheckoutShipping().payByBankWire();
    }

    @Then("I should be taken to the order summary page where it will confirm that I have paid by bank wire")
    public void i_should_be_taken_to_the_order_summary_page_where_it_will_confirm_that_I_have_paid_by_bank_wire() {
        String bankwireCurrentURL = seleniumConfig.getDriver().getCurrentUrl();
        Assert.assertEquals("http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment", bankwireCurrentURL);
    }

    /**
     *   Scenario Outline: As I user I want the option to pay by cheque
     */

    @Given("I click the pay by cheque option")
    public void i_click_the_pay_by_cheque_option() {
        automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout().proceedToSummary();
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com", "spartaglobal");

        automationPracticeSite.getCheckout().clickProceedToCheckoutAddress().agreeTermsConditions().clickProceedToCheckoutShipping().payByCheque();
    }

    @Then("I should be taken to the order summary page where it will confirm that I have paid by cheque")
    public void i_should_be_taken_to_the_order_summary_page_where_it_will_confirm_that_I_have_paid_by_cheque() {
        String chequeCurrentURL = seleniumConfig.getDriver().getCurrentUrl();
        Assert.assertEquals("http://automationpractice.com/index.php?fc=module&module=cheque&controller=payment", chequeCurrentURL);
    }

    @Then("I click the confirm button")
    public void i_click_the_confirm_button() {
        automationPracticeSite.getBasket().waitForElement();
        automationPracticeSite.getCheckout().clickConfirmOrderButton();
    }

}
