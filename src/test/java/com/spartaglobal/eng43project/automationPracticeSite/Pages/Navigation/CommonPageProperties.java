package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPageProperties {
<<<<<<< HEAD
    private WebDriver driver;
    private By womenNavButton = By.linkText("Women");

//    private NavigationPages navigationPages = new NavigationPages(driver);

//    public CommonPageProperties(WebDriver driver) {
//        this.driver = driver;
//    }

    public CommonPageProperties navToWomenPage(){
//        navigationPages.goToHomePageURL()
        driver.findElement(womenNavButton).click();
=======

    private WebDriver driver;
    private By womenButton = By.linkText("Women");

    public CommonPageProperties(WebDriver driver) {
        this.driver = driver;
    }

    public CommonPageProperties clickWomenButton(){
        driver.findElement(womenButton).click();
>>>>>>> navigation
        return this;
    }

}
