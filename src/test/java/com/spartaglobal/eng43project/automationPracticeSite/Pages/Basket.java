package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import io.cucumber.java.bs.A;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Basket {
    private WebDriver driver;
    private Actions actions = new Actions(driver);
    private NavigationPages navigationPages;
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";
    private By checkoutButtonID = By.linkText("Proceed to checkout");
    private By continueToShoppingID = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span");
    private By printedDressQuickBuy = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");

    public Basket(WebDriver driver) {
        this.driver = driver;
        navigationPages = new NavigationPages(driver);
    }

    public Basket goToBasketURL() {
        driver.navigate().to(basketUrl);
        return this;
    }

    public Basket goToWomanPage(){
        navigationPages.womensPage().goToWomensPage();
        return this;
    }


    public Basket clickShoppingButton(){
        waitForElement();
        driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")).click();
        return this;
    }

    public Basket processToCheckout() {
        waitForElement();
        driver.findElement(checkoutButtonID).click();
        return this;
    }

    public Basket goToHomePageURL(){
        navigationPages.homePage().goToHomePageURL();
        return this;
    }

    public Basket waitForElement(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public Basket addItemToBasket(){
        goToHomePageURL();
        driver.findElement(printedDressQuickBuy).click();
        return this;
    }

    public Basket proceedToSummary(){
        waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }

    public Basket proceedToCheckout(){
        waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }

    public Basket selectMultipleProductToCart(){
        WebElement from;
        goToWomanPage();
        for (int i = 1; i < 8; i++ ){
            from = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child("+i+") > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default"));
            from.click();
            if( i == 7 ){
                processToCheckout();
            }
            else {
                clickShoppingButton();
            }
        }
        return this;
    }

    public Basket moveToCartMenu(){
        goToHomePageURL();
        actions.moveToElement(driver.findElement(By.linkText("View my shopping cart"))).perform();
        return this;
    }
}
