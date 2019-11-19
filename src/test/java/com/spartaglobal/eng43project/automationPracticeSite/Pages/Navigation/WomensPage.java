package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.WebDriver;

public class WomensPage{

    protected String womensPageURL = "http://automationpractice.com/index.php?id_category=3&controller=category";
    private WebDriver driver;

    public WomensPage(WebDriver driver) {
        this.driver = driver;
    }

    public WomensPage goToWomensPage(){
        driver.navigate().to(womensPageURL);
        return this;
    }
}
