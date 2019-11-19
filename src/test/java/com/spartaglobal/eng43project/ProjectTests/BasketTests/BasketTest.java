package com.spartaglobal.eng43project.ProjectTests.BasketTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Basket;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import io.cucumber.java.eo.Se;
import org.junit.*;
import org.openqa.selenium.By;

public class BasketTest {

    private static SeleniumConfig seleniumConfig;
    private static AutomationPracticeSite automationPracticeSite;
    private static NavigationPages navigationPages;

    @BeforeClass
    public static void setup() {
        // TODO: 18/11/2019 Change the driverPath to your own path!
        seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\NGeorgiev\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
        navigationPages = new NavigationPages(seleniumConfig.getDriver());
    }

//    @AfterClass
//    public static void teardown(){
//        seleniumConfig.getDriver().close();
//    }

//    @Test
//    public void checkUrlIsOpened(){
//        automationPracticeSite.getBasket().goToBasketURL();
//        Assert.assertEquals("http://automationpractice.com/index.php?controller=order",seleniumConfig.getDriver().getCurrentUrl());
//    }

    @Test
    public void goToDressSite() {
        automationPracticeSite.getBasket().goToProceedToCheckout().getQuantity("00");


    }
}

