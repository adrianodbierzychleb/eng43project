package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {



    private WebDriver driver;
    private String checkoutUrl = "http://automationpractice.com/index.php";
    private By addressUpdateButton = By.xpath("//*[@id=\"address_invoice\"]/li[7]/a");

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public Checkout goToCheckoutURL() {
        driver.navigate().to(checkoutUrl);
        return this;
    }

    public Checkout clickDeliveryAddressUpdateButton(){
        driver.findElement(addressUpdateButton).click();
        return this;
    }
}
