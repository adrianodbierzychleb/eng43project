package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.WebDriver;

public class TshirtsPage{

    private String tshirtsPageURL = "http://automationpractice.com/index.php?id_category=5&controller=category";

    private WebDriver driver;

    public TshirtsPage(WebDriver driver) {
        this.driver = driver;
    }

    public TshirtsPage goToTshirtsPage(){
        driver.navigate().to(tshirtsPageURL);
        return this;
    }
}
