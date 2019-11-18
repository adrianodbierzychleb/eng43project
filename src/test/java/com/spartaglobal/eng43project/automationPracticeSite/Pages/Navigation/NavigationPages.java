package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.WebDriver;

public class NavigationPages {
    protected WebDriver driver;
    protected String homePageURL = "http://automationpractice.com/index.php";

    public NavigationPages(WebDriver driver) {
        this.driver = driver;
    }
}
