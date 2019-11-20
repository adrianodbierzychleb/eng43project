package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import io.cucumber.java.bs.A;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Basket {
    private WebDriver driver;
    private NavigationPages navigationPages;
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";
//    private By printedDressQuickBuy = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");

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
        waitForElement();
        return this;
    }

/*    public Basket goToHomePageURL(){
        navigationPages.homePage().goToHomePageURL();
        return this;
    }*/

    public Basket waitForElement(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return this;
    }

 /*   public Basket addItemToBasket(){
        goToHomePageURL();
        driver.findElement(printedDressQuickBuy).click();
        return this;
    }*/

    public Basket proceedToCheckout(){
        waitForElement();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }

    public Basket selectMultipleProductToCart(){
        WebElement from;
        for (int i = 1; i < 8; i++ ){
            from = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li["+i+"]/div/div[2]/div[2]/a[1]"));
            from.click();
            if( i == 7 ){
                proceedToCheckout();
            }
            else {
                clickShoppingButton();
            }
        }
        return this;
    }

    public Basket increaseQuantityInSummary(){
        String[] quantity;

        quantity = new String[7];

        quantity[1] = String.valueOf(By.id("cart_quantity_up_1_1_0_0"));
        quantity[2] = String.valueOf(By.id("cart_quantity_up_2_7_0_0"));
        quantity[3] = String.valueOf(By.id("cart_quantity_up_3_13_0_0"));
        quantity[4] = String.valueOf(By.id("cart_quantity_up_4_16_0_0"));
        quantity[5] = String.valueOf(By.id("cart_quantity_up_5_19_0_0"));
        quantity[6] = String.valueOf(By.id("cart_quantity_up_6_31_0_0"));
        quantity[7] = String.valueOf(By.id("cart_quantity_up_7_34_0_0"));
        return this;
    }

    public Basket increaseTheQuantityOfProduct(){
        selectMultipleProductToCart();
        

        return this;
    }

}
