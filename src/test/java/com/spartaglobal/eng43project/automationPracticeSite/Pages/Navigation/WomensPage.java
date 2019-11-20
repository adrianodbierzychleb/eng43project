package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import com.spartaglobal.eng43project.automationPracticeSite.Pages.Basket;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
