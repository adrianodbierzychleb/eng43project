package com.spartaglobal.eng43project.automationPracticeSite.Pages;


import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import io.cucumber.java.bs.A;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
=======
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

>>>>>>> basket
import java.util.concurrent.TimeUnit;

public class Basket {
    private WebDriver driver;
    private NavigationPages navigationPages;
<<<<<<< HEAD
    public String totalWithoutTaxString;
    public String grandTotalString;
    private String dressesPageURL = "http://automationpractice.com/index.php?id_category=8&controller=category";
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";

    //private NavigationPages navigationPages;
    private By printedDressQuickBuy = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    private By proceedToCheckoutButton = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
=======
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";
    private By checkoutButtonID = By.linkText("Proceed to checkout");
    private By continueToShoppingID = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span");
    private By printedDressQuickBuy = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
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

    public Basket goToWomanPage(){
        navigationPages.womensPage().goToWomensPage();
        return this;
    }


    public Basket clickShoppingButton(){
        waitForElement();
        driver.findElement(continueToShoppingID).click();
        return this;
    }

    public Basket processToCheckout() {
        waitForElement();
        driver.findElement(checkoutButtonID).click();
        return this;
    }

>>>>>>> basket
    public Basket goToHomePageURL(){
        navigationPages.homePage().goToHomePageURL();
        return this;
    }

    public Basket waitForElement(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public Basket goToProceedToCheckout(){
        SelectItemAndAddToCart().waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }
    public Basket getQuantity(String quantity){

        driver.findElement(By.name("quantity_3_13_0_0")).click();
        driver.findElement(By.name("quantity_3_13_0_0")).sendKeys("1");
        driver.findElement(By.name("quantity_3_13_0_0")).clear();
        driver.findElement(By.name("quantity_3_13_0_0")).sendKeys(quantity);
        driver.findElement(By.name("quantity_3_13_0_0")).sendKeys(Keys.ENTER);
        return this;
    }
    public Basket addItemToBasket(){
        goToHomePageURL();
        driver.findElement(printedDressQuickBuy).click();
        return this;
    }
<<<<<<< HEAD
=======

    public Basket proceedToSummary(){
        waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }

>>>>>>> basket
    public Basket proceedToCheckout(){
        waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }
<<<<<<< HEAD
    public Basket checkTax(){
        waitForElement();
        WebElement totalWithoutTax = driver.findElement(By.id("total_price_without_tax"));
        WebElement grandTotal = driver.findElement(By.id("total_price"));
        totalWithoutTaxString = totalWithoutTax.getText();
        grandTotalString = grandTotal.getText();
=======

    public Basket checkTax(){
        waitForElement();
        WebElement tax = driver.findElement(By.id("total_tax"));
        System.out.println(tax.getText());
        return this;
    }

    public Basket selectMultipleProductToCart(){
        WebElement from;
        goToWomanPage();
        Actions action = new Actions(driver);
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
>>>>>>> basket
        return this;
    }
}
