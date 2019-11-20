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
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\BB\\chromedriver_win32\\chromedriver.exe");
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
     }

     @Test
    public void addItemToBasketAndCheckout(){
        automationPracticeSite.getBasket().addItemToBasket().proceedToCheckout();
     }

}
