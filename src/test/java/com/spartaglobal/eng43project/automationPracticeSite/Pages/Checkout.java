package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {

    private WebDriver driver;
    private String checkoutUrl = "http://automationpractice.com/index.php";
    private By addressUpdateButton = By.xpath("//*[@id=\"address_invoice\"]/li[7]/a");
<<<<<<< HEAD
    private By addressDropDown = By.id("id_address_delivery");
    private By dropDownHomeAddress = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[1]/div[1]/div/div/select/option[2]");
=======
    private By billingUpdateButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[2]/div[2]/ul/li[7]/a/span");
>>>>>>> checkout

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

<<<<<<< HEAD

    public Checkout clickDropDownMenu(){

        driver.findElement(addressDropDown).click();


        return this;

    }

    public Checkout selectAddressFromDropDown(){
        driver.findElement(dropDownHomeAddress).click();
        return this;
    }

=======
    public Checkout clickBillingUpdateButton(){
        driver.findElement(billingUpdateButton).click();
        return this;
    }
>>>>>>> checkout
}
