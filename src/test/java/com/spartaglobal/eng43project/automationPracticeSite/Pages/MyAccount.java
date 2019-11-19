package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {

    private WebDriver driver;
    private String homepage = "http://automationpractice.com/index.php";

    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomepage(){

        driver.navigate().to(homepage);
    }

    public MyAccount goToSignIn(){
        return this;
    }



}
