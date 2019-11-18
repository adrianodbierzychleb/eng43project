package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.WebDriver;

public class HomePage extends NavigationPages {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHomePageURL(){
        driver.navigate().to(homePageURL);
    }
}
