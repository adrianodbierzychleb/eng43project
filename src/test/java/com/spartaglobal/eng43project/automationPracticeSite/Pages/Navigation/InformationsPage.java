package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.WebDriver;

public class InformationsPage{

    private String informationsPageURL = "http://automationpractice.com/index.php?id_cms_category=1&controller=cms";
    private WebDriver driver;

    public InformationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public InformationsPage goToInformationsPage(){
        driver.navigate().to(informationsPageURL);
        return this;
    }
}
