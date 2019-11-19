package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import org.openqa.selenium.By;
<<<<<<< HEAD
import org.openqa.selenium.Keys;
=======
>>>>>>> basket
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class Basket {
    private WebDriver driver;
    private NavigationPages navigationPages;
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";
<<<<<<< HEAD
    private By cloth2AddToBasketID = By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default");
    private By cloth3AddToBasketID = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default");
    private By checkoutButtonID = By.linkText("Proceed to checkout");
    private By continueToShoppingID = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span");
=======

    private NavigationPages navigationPages;
    private By printedDressQuickBuy = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    private By proceedToCheckoutButton = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");

>>>>>>> basket

    public Basket(WebDriver driver) {
        this.driver = driver;
        navigationPages = new NavigationPages(driver);
    }

<<<<<<< HEAD

    public Basket goToBasketURL(){
=======
    public Basket goToBasketURL() {
>>>>>>> basket
        driver.navigate().to(basketUrl);
        return this;
    }

<<<<<<< HEAD
    public Basket goToWomanPage(){
        navigationPages.womensPage().goToWomensPage();
        return this;
    }

    public Basket selectProduct1ToCart(){
        goToWomanPage();
        driver.findElement(cloth3AddToBasketID).click();
        return this;
    }

    public Basket clickShoppingButton(){
        selectProduct1ToCart().waitingTime();
        driver.findElement(continueToShoppingID).click();
        return this;
    }

    public Basket selectProduct2ToCart(){
        clickShoppingButton();
        driver.findElement(cloth2AddToBasketID).click();
        return this;
    }

    public Basket waitingTime(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public Basket processToCheckout(){
        selectProduct2ToCart().waitingTime();
        driver.findElement(checkoutButtonID).click();
=======
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

    public Basket proceedToCheckout(){
        addItemToBasket().waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
>>>>>>> basket
        return this;
    }

}
