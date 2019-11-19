package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {

    private By singInButton = By.className("login");
    private By emailTextBox = By.id("email");
    private By passwordTextBox = By.id("passwd");
    private By submitLoginButton = By.id("SubmitLogin");

    private WebDriver driver;
    private String checkoutUrl = "http://automationpractice.com/index.php";


    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public Checkout goToCheckoutURL(){

        driver.navigate().to(checkoutUrl);
        return this;
    }


    public Checkout login(){
        driver.findElement(singInButton).click();
        driver.findElement(emailTextBox).sendKeys("eng43@test.com");
        driver.findElement(passwordTextBox).sendKeys("spartaglobal");
        driver.findElement(submitLoginButton).click();
        return this;
    }


    public Checkout updateAdress(){

        return this;
    }

}
