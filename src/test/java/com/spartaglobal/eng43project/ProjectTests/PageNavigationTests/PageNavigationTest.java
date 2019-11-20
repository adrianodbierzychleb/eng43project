package com.spartaglobal.eng43project.ProjectTests.PageNavigationTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.CommonPageProperties;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.ContactUsPage;
import gherkin.deps.com.google.gson.internal.$Gson$Preconditions;
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
    private static CommonPageProperties commonPageProperties;
    private static ContactUsPage contactUsPage;

    @BeforeClass
    public static void setup(){
        // TODO: 18/11/2019 Change the driverPath to your own path!
        seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\SHoque\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
        commonPageProperties = new CommonPageProperties(seleniumConfig.getDriver());
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
        commonPageProperties.clickWomenInNavBar();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickTshirtsLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        commonPageProperties.clickWomenHeaderTopsTshirtLink();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=5&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickBlousesLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        commonPageProperties.clickWomenHeaderTopsBlousesLink();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=7&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickDressesLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        commonPageProperties.clickDressesHeader();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=8&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickDressesCasualDressLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        commonPageProperties.clickDressesHeaderCasualDresses();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=9&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickDressesEveningDressLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        commonPageProperties.clickDressesHeaderEveningDresses();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=10&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickDressesSummerDressLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        commonPageProperties.clickDressesHeaderSummerDresses();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=11&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickTshirtLink() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
        commonPageProperties.clickTshirtHeader();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=5&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }
}
