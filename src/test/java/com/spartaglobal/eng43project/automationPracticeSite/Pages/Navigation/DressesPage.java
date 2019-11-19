package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.WebDriver;

public class DressesPage{

    private String dressesPageURL = "http://automationpractice.com/index.php?id_category=8&controller=category";

    private WebDriver driver;

    public DressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public DressesPage goToDressesPage(){
        driver.navigate().to(dressesPageURL);
        return this;
    }


}
