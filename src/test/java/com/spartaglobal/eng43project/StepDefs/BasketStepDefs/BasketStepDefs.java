package com.spartaglobal.eng43project.StepDefs.BasketStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Basket;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasketStepDefs {
    // TODO: 18/11/2019  Change your driver path to your own path!
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\NGeorgiev\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());


    //As a user I want to see all the items I have selected before I checkout so that I can keep track of the money I’m spending.

    @Given("I am in the cart summary page")
    public void i_am_in_the_cart_summary_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I look at the items on the page")
    public void i_look_at_the_items_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("I look at the cart drop down menu information")
    public void i_look_at_the_cart_drop_down_menu_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the amounts of items will be identical")
    public void the_amounts_of_items_will_be_identical() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("the totals will be the same")
    public void the_totals_will_be_the_same() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    //  Scenario: As a user I want to select multiple items so that I can checkout only once while I have all the items I want.

    @Given("I am in Woman Catalog page")
    public void i_am_in_Woman_Catalog_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I have added multiple products using the quick view functionality to the cart")
    public void i_have_added_multiple_products_using_the_quick_view_functionality_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I can process to payment by pressing the checkout button")
    public void i_can_process_to_payment_by_pressing_the_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    //  Scenario: As a user I want to select an item and write down the
    //  quantity instead of clicking multiple times so that I save time.

    @Given("I am at the summary page")
    public void i_am_at_the_summary_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I select an item")
    public void i_select_an_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("write down the quantity of items I want")
    public void write_down_the_quantity_of_items_I_want() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the amount typed by me will correspond to the quantity of items bought")
    public void the_amount_typed_by_me_will_correspond_to_the_quantity_of_items_bought() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    //Scenario: As a user I want to see the tax and delivery costs I have to
    //  pay additionally so that I know how much more I have to pay.

    @When("I finish selecting items")
    public void i_finish_selecting_items() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the tax and delivery costs will be displayed correctly")
    public void the_tax_and_delivery_costs_will_be_displayed_correctly() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    //  Scenario: As a user I want to reduce the quantity of items
    //  in my basket so that I make changes before I finalise my purchase.

    @Given("that I am in the cart drop down")
    public void that_I_am_in_the_cart_drop_down() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("I have selected a certain quantity of items")
    public void i_have_selected_a_certain_quantity_of_items() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I want reduce items")
    public void i_want_reduce_items() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("it will remove specified number of items")
    public void it_will_remove_specified_number_of_items() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    //Scenario: As a user I want to have an option to delete items from my cart summary
    // so that I can get rid of an item if I change my mind.

    @Given("i am in Women Catalog page")
    public void i_am_in_Women_Catalog_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("I have selected Products to the cart\\/basket")
    public void i_have_selected_Products_to_the_cart_basket() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I click the delete button for a product which I don’t want")
    public void i_click_the_delete_button_for_a_product_which_I_don_t_want() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("It will remove the product from the cart\\/basket")
    public void it_will_remove_the_product_from_the_cart_basket() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    //Scenario: As a user I want to be able to remove products from my cart until the payment so
    //  that I can make sure I have the right amount of items I want to purchase.

    @Given("that I am on the payment page")
    public void that_I_am_on_the_payment_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("I am able to select the cart menu")
    public void i_am_able_to_select_the_cart_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I remove a product from the cart")
    public void i_remove_a_product_from_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the items displayed will not show that product")
    public void the_items_displayed_will_not_show_that_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the total will be correct")
    public void the_total_will_be_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

   // Scenario: As a user I want to be able to modify quantities of products within my cart until the payment
    // so that I can make sure I have the right amount of items I want to purchase.

    @When("change the quantity of said item in the menu")
    public void change_the_quantity_of_said_item_in_the_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the correct amount of that item are displayed")
    public void the_correct_amount_of_that_item_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the correct total cost is displayed")
    public void the_correct_total_cost_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
