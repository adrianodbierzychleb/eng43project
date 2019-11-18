package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import javafx.beans.value.WritableObjectValue;
import org.openqa.selenium.WebDriver;

public class NavigationPages {
    protected WebDriver driver;
    private HomePage homePage;
    private DressesPage dressesPage;
    private InformationsPage informationsPage;
    private SiteMapPage siteMapPage;
    private TshirtsPage tshirtsPage;
    private WomensPage womensPage;


    public NavigationPages(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
        this.dressesPage = new DressesPage(driver);
        this.informationsPage = new InformationsPage(driver);
        this.siteMapPage = new SiteMapPage(driver);
        this.tshirtsPage = new TshirtsPage(driver);
        this.womensPage = new WomensPage(driver);
    }

    public HomePage homePage(){
        return homePage;
    }

    public DressesPage dressesPage(){
        return dressesPage;
    }

    public InformationsPage informationsPage(){
        return informationsPage;
    }

    public SiteMapPage siteMapPage(){
        return siteMapPage;
    }

    public TshirtsPage tshirtsPage(){
        return tshirtsPage;
    }

    public WomensPage womensPage(){
        return womensPage;
    }

}
