package com.spartaglobal.eng43project.ProjectTests.CheckoutTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import org.junit.Before;
import org.junit.Test;

/**
 * A base example of how to lay this class out can be seen in BasketTest.java
 **/

public class CheckoutTest {

    private static AutomationPracticeSite automationPracticeSite;

    @Before
    public void setup(){

<<<<<<< HEAD
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\Dana Korang-Awua\\Downloads\\chromedriver_win32\\chromedriver.exe");
=======
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\BB\\chromedriver_win32\\chromedriver.exe");

>>>>>>> 3f5f1fc3c2b88d1c430f0495a7abe92aaf78b40e
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    }



//    @Test
//    public void shouldGoToCheckout() throws Exception{
//        automationPracticeSite.getCheckout().goToCheckoutURL().login();
//     }

    @Test
    public void shouldGoToCheckoutAndSignIn() {
        automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout().proceedToSummary();
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
        automationPracticeSite.getCheckout().clickDeliveryAddressUpdateButton();
        automationPracticeSite.getCheckout().clickDeliveryAddAddressButton();
     }

     @Test
    public void addItemToBasketAndCheckoutAndSignUpIfUserDoesNotHaveAnAccount(){
        automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout().proceedToSummary();
        automationPracticeSite.getSignup().inputEmail("test@test.com").clickCreateAccountButton();
     }

     @Test
     public void shouldClickAddAddressButton(){
         automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout().proceedToSummary();
         automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
         automationPracticeSite.getCheckout().clickDeliveryAddAddressButton();
     }

     public void shouldSelectAddressFromDropDown() throws Exception{
         automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout().proceedToSummary();
         automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
         automationPracticeSite.getCheckout().clickDropDownMenu().selectAddressFromDropDown();
      }

    @Test
    public void shouldClickAddAddressButton(){
        automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout().proceedToSummary();
        automationPracticeSite.getMyAccount().loginInToAccount("eng43@test.com","spartaglobal");
        automationPracticeSite.getCheckout().clickDeliveryAddAddressButton();
    }

}
