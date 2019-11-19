package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private String homePageURL = "http://automationpractice.com/index.php";
    private WebDriver driver;
<<<<<<< HEAD
   private CommonPageProperties commonPageProperties;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        //this.commonPageProperties = new CommonPageProperties();
=======
    private CommonPageProperties commonPageProperties;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.commonPageProperties = new CommonPageProperties(driver);
>>>>>>> navigation
    }

    public HomePage goToHomePageURL(){
        driver.navigate().to(homePageURL);
        return this;
    }
<<<<<<< HEAD
//    private By womenNavButton = By.linkText("Women");
//
////    private NavigationPages navigationPages = new NavigationPages(driver);
//
//
//    public HomePage navToWomenPage(){
////        navigationPages.goToHomePageURL()
//        driver.findElement(womenNavButton);
//        return this;
//    }

    public HomePage navToWomenPage(){
        navToWomenPage();
        return this;
    }





=======

    public HomePage getNavToWomen(){
        commonPageProperties.clickWomenButton();
        return this;
    }
>>>>>>> navigation
}
