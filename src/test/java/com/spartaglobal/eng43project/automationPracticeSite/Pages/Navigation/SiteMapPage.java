package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.WebDriver;

public class SiteMapPage {

    private String siteMapPageURL = "http://automationpractice.com/index.php?controller=sitemap";

    private WebDriver driver;

    public SiteMapPage(WebDriver driver) {
        this.driver = driver;
    }

    public SiteMapPage goToSiteMapPage(){
        driver.navigate().to(siteMapPageURL);
        return this;
    }
}
