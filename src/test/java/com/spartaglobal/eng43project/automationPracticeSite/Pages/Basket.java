package com.spartaglobal.eng43project.automationPracticeSite.Pages;

<<<<<<< HEAD
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.DressesPage;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
=======
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import org.openqa.selenium.By;
>>>>>>> basket
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class Basket {
    private WebDriver driver;
    private NavigationPages navigationPages;
    private String dressesPageURL = "http://automationpractice.com/index.php?id_category=8&controller=category";
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";

<<<<<<< HEAD
=======
    private NavigationPages navigationPages;
    private By printedDressQuickBuy = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    private By proceedToCheckoutButton = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");


>>>>>>> basket
    public Basket(WebDriver driver) {
        this.driver = driver;
        navigationPages = new NavigationPages(driver);
    }

    public Basket goToBasketURL() {
        driver.navigate().to(basketUrl);
        return this;
    }
<<<<<<< HEAD
    public Basket goToDressesPage(){
        driver.navigate().to(dressesPageURL);
        return this;
    }
    public Basket SelectItemAndAddToCart(){
        goToDressesPage();
        driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")).click();
        return this;
    }
=======

    public Basket goToHomePageURL(){
        navigationPages.homePage().goToHomePageURL();
        return this;
    }


>>>>>>> basket
    public Basket waitForElement(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
<<<<<<< HEAD
    public Basket goToProceedToCheckout(){
        SelectItemAndAddToCart().waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }
    public Basket getQuantity(String quantity){
        driver.findElement(By.name("quantity_3_13_0_0")).sendKeys(quantity);
        driver.findElement(By.name("quantity_3_13_0_0")).sendKeys(Keys.ENTER);
        return this;
    }
=======

    public Basket addItemToBasket(){
        goToHomePageURL();
        driver.findElement(printedDressQuickBuy).click();
        return this;
    }

    public Basket proceedToCheckout(){
        addItemToBasket().waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }

>>>>>>> basket
}
