package com.spartaglobal.eng43project.ProjectTests.PageNavigationTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.ContactUsPage;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavBar;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdsTests {

    private static SeleniumConfig seleniumConfig;
    private static AutomationPracticeSite automationPracticeSite;
    private static ContactUsPage contactUsPage;
    private static NavBar navBar;

    @BeforeClass
    public static void setup(){
        // TODO: 18/11/2019 Change the driverPath to your own path!
        seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\IYotova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
        navBar = new NavBar(seleniumConfig.getDriver());
    }

    @AfterClass
    public static void teardown(){
        seleniumConfig.getDriver().close();
    }
    
    @Test
    public void shouldClick25OffAd() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().click25Ad();
        Assert.assertEquals("Not this",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void shouldClick45OffAd() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().click45Ad();
        Assert.assertEquals("Not this",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void shouldClickATopTrendsAd() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickTopTrendsAd();
        Assert.assertEquals("Not this",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickAtMensCoatsAd() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickMenCoatsAd();
        Assert.assertEquals("Not this",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickAtWomensCoatsAd() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickWomenCoatsAd();
        Assert.assertEquals("Not this",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickAtSunglassesAd() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickSunglassesAd();
        Assert.assertEquals("Not this",seleniumConfig.getDriver().getCurrentUrl());
    }

    @Test
    public void shouldClickAtHandbagsAd() throws Exception{
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickHandbagsAd();
        Assert.assertEquals("Not this",seleniumConfig.getDriver().getCurrentUrl());
    }

}
