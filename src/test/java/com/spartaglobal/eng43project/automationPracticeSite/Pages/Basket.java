package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Basket {
    private WebDriver driver;
    private NavigationPages navigationPages;
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";
    private By cloth2AddToBasketID = By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default");
    private By cloth3AddToBasketID = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default");
    private By checkoutButtonID = By.linkText("Proceed to checkout");
    private By continueToShoppingID = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span");

    public Basket(WebDriver driver) {
        this.driver = driver;
        navigationPages = new NavigationPages(driver);
    }


    public Basket goToBasketURL(){
        driver.navigate().to(basketUrl);
        return this;
    }

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
        return this;
    }

}
