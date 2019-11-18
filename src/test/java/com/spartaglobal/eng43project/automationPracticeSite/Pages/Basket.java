package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.WebDriver;

public class Basket {
    private WebDriver driver;
    private String basketUrl = "http://automationpractice.com/index.php?controller=order";
    public Basket(WebDriver driver) {
        this.driver = driver;
    }

    public Basket goToBasketURL(){
        driver.navigate().to(basketUrl);
        return this;
    }
}
