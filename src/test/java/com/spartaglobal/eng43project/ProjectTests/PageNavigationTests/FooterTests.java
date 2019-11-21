package com.spartaglobal.eng43project.ProjectTests.PageNavigationTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FooterTests {
    private static SeleniumConfig seleniumConfig;
    private static AutomationPracticeSite automationPracticeSite;

    @BeforeClass
    public static void setup(){
        // TODO: 18/11/2019 Change the driverPath to your own path!
        seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\IYotova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    }
    @AfterClass
    public static void teardown(){
        seleniumConfig.getDriver().close();
    }
    @Test
    public void WomenlinkTest() throws Exception {
        automationPracticeSite.getFooter().clickWomenlink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void SpecialslinkTest() throws Exception {
        automationPracticeSite.getFooter().clickSpecialsLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void NewProductsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickNewProductsLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void BestSellersLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickBestSellersLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void OurStoresLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickOurStoresLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void ContactUsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickContactUsLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void TermsAndConditionsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickTermsAndConditionsLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void AboutUsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickAboutUsLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void SitemapLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickSitemapLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void MyOrdersLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickMyOrdersLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void MyCreditSlipsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickMyCreditSlipsLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void MyAddressesLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickMyAddressesLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void MyPersonalInfoLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickMyPersonalInfoLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void FacebookLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickFacebookLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void TwitterLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickTwitterLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void YouTubeLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickYouTubeLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void GoogleLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickGoogleLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void NewsletterSubmitTest() throws Exception {
        automationPracticeSite.getFooter().clickNewsletterSubmit();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void CallUsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickCallUsLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void EmailLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickEmailLink();
        Assert.assertEquals("",seleniumConfig.getDriver().getCurrentUrl());
    }
}
