package com.spartaglobal.eng43project.ProjectTests.PageNavigationTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.ContactUsPage;
import gherkin.deps.com.google.gson.internal.$Gson$Preconditions;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavBar;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * A base example of how to lay this class out can be seen in BasketTest.java
 **/

public class PageNavigationTest {


    private static SeleniumConfig seleniumConfig;
    private static AutomationPracticeSite automationPracticeSite;
    private static ContactUsPage contactUsPage;
    private static NavBar navBar;

    @BeforeClass
    public static void setup(){
        // TODO: 18/11/2019 Change the driverPath to your own path!
        seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\SHoque\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
        navBar = new NavBar(seleniumConfig.getDriver());
    }

//    @AfterClass
//    public static void teardown(){
//        seleniumConfig.getDriver().close();
//    }

    @Test
    public void checkUrlIsOpened(){
        automationPracticeSite.getNavigationPages().womensPage().goToWomensPage();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickWomenLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        navBar.clickWomenInNavBar();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickTshirtsLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        navBar.clickWomenHeaderTopsTshirtLink();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=5&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickBlousesLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        navBar.clickWomenHeaderTopsBlousesLink();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=7&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickDressesLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        navBar.clickDressesHeader();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=8&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickDressesCasualDressLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        navBar.clickDressesHeaderCasualDresses();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=9&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickDressesEveningDressLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        navBar.clickDressesHeaderEveningDresses();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=10&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickDressesSummerDressLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        navBar.clickDressesHeaderSummerDresses();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=11&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickTshirtLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        navBar.clickTshirtHeader();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=5&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void shouldClickAd() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickHandbagsAd();
        Assert.assertEquals("Anything but this",seleniumConfig.getDriver().getCurrentUrl());
    }
}
