package com.spartaglobal.eng43project.StepDefs.BasketStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Basket;
import io.cucumber.java.en.*;
import org.junit.AfterClass;
import org.junit.Assert;

public class BasketStepDefs {
    // TODO: 18/11/2019  Change your driver path to your own path!
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Anis Subba\\OneDrive - Sparta Global Limited\\Engineering43\\chromedriver_win32\\chromedriver.exe");
    private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());

//    I am able to delete item in cart drop-down menu
    @Given("I am in woman catalog page")
    public void i_am_in_woman_catalog_page() {
        automationPracticeSite.getBasket().goToWomanPage();
    }

    @When("I select product to the cart drop-down menu")
    public void i_select_product_to_the_cart_drop_down_menu() {
        automationPracticeSite.getBasket().goToCartDropDownMenu();
    }

    @Then("I click the delete button for a product which i don't want")
    public void i_click_the_delete_button_for_a_product_which_i_don_t_want() {
        automationPracticeSite.getBasket().removeProductFromCartDropDownMenu().closeDriver();
    }

//  I am able to increase quantity in the basket summary page
    @And("I select a product and process to checkout")
    public void i_select_a_product_and_process_to_checkout() {
        automationPracticeSite.getBasket().addItemToBasket();
    }

    @When("I select the function to increase the quantity of the product")
    public void i_select_the_function_to_increase_the_quantity_of_the_product() {
        automationPracticeSite.getBasket().increaseQuantityInSummary();
    }

    @Then("I process to sign-in page toward payment")
    public void i_process_to_sign_in_page_toward_payment() {
        automationPracticeSite.getBasket().proceedToCheckout().closeDriver();
    }

//  I am able to decrease quantity in the basket summary page
    @Then("I select the function to decrease the quantity of the product")
    public void i_select_the_function_to_decrease_the_quantity_of_the_product() {
        automationPracticeSite.getBasket().decreaseQuantityInSummary();
    }

//  As a user I want to see all the items I have selected before I checkout so that I can keep track of the money I’m spending.

    @Given("I am in the cart summary page")
    public void i_am_in_the_cart_summary_page() {
        automationPracticeSite.getBasket().addItemFromHomeToBasket();
    }

    @When("I look at the items on the page")
    public void i_look_at_the_items_on_the_page() {
        automationPracticeSite.getBasket().goToProceedToCheckout();
    }
    @And("I look at the cart drop down menu information")
    public void i_look_at_the_cart_drop_down_menu_information() {
        automationPracticeSite.getBasket().goToCartDropDownMenu();
    }
    @Then("the amounts of items will be identical")
    public void the_amounts_of_items_will_be_identical() {
        Assert.assertEquals(automationPracticeSite.getBasket().totalCartProducts,automationPracticeSite.getBasket().totalSummaryProducts);
    }
    @And("the totals will be the same")
    public void the_totals_will_be_the_same() {
        Assert.assertEquals(automationPracticeSite.getBasket().totalWithoutTaxString,automationPracticeSite.getBasket().cartTotal);
    }

//
    @When("I have added multiple products using the quick view functionality to the cart")
    public void i_have_added_multiple_products_using_the_quick_view_functionality_to_the_cart() {
        automationPracticeSite.getBasket().selectMultipleProductToCart();
    }

    @Then("I can process to payment by pressing the checkout button")
    public void i_can_process_to_payment_by_pressing_the_checkout_button() {
        automationPracticeSite.getBasket().proceedToCheckout().closeDriver();
    }

}
