package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.WebDriver;


public class HomePage {
    private String homePageURL = "http://automationpractice.com/index.php";
    private WebDriver driver;
    private CommonPageProperties commonPageProperties;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.commonPageProperties = new CommonPageProperties(driver);
    }

    public HomePage goToHomePageURL(){
        driver.navigate().to(homePageURL);
        return this;
    }

}
