package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.DressesPage;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Basket {
    private WebDriver driver;
    private NavigationPages navigationPages;
    private String dressesPageURL = "http://automationpractice.com/index.php?id_category=8&controller=category";
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";

    public Basket(WebDriver driver) {
        this.driver = driver;
    }

    public Basket goToBasketURL(){
        driver.navigate().to(basketUrl);
        return this;
    }
    public Basket goToDressesPage(){
        driver.navigate().to(dressesPageURL);
        return this;
    }
    public Basket SelectItemAndAddToCart(){
        goToDressesPage();
        driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")).click();
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
        driver.findElement(By.name("quantity_3_13_0_0")).sendKeys(quantity);
        driver.findElement(By.name("quantity_3_13_0_0")).sendKeys(Keys.ENTER);
        return this;
    }
}
