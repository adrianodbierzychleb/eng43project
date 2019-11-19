package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPageProperties {

    private WebDriver driver;
    private By womenButton = By.linkText("Women");

    public CommonPageProperties(WebDriver driver) {
        this.driver = driver;
    }

    public CommonPageProperties clickWomenButton(){
        driver.findElement(womenButton).click();
        return this;
    }

}
