package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.WebDriver;

public class Checkout {
    private WebDriver driver;
    private String checkoutUrl = "http://automationpractice.com/index.php";

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCheckoutURL(){
        driver.navigate().to(checkoutUrl);
    }
}
