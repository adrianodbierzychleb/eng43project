package com.spartaglobal.eng43project.ProjectTests.BasketTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Basket;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.eo.Se;
import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketTest {

    private static SeleniumConfig seleniumConfig;
    private static AutomationPracticeSite automationPracticeSite;
    private static NavigationPages navigationPages;

    @BeforeClass
    public static void setup(){
        // TODO: 18/11/2019 Change the driverPath to your own path!
        seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Anis Subba\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
        navigationPages = new NavigationPages(seleniumConfig.getDriver());
    }

    /*@AfterClass
    public static void teardown(){
        seleniumConfig.getDriver().close();
    }*/

    @Test
    public void checkUrlIsOpened(){
        automationPracticeSite.getBasket().goToBasketURL();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=order",seleniumConfig.getDriver().getCurrentUrl());
    }

    /*Given I am in Woman Catalog page
    When I have added multiple products using the quick view functionality to the cart
    Then I can process to payment by pressing the checkout button*/
    @Test
    public void goToWomanHomePage(){
        navigationPages.womensPage().goToWomensPage();
    }

    @Test
    public void addMultipleItemInCart(){
        automationPracticeSite.getBasket().processToCheckout();
    }
}
