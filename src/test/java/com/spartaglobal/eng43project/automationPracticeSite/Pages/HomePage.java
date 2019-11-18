package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private String homePageURL = "http://automationpractice.com/index.php";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePageURL(){
        driver.navigate().to(homePageURL);
    }
}
