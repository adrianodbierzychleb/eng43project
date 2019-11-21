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
        seleniumConfig = new SeleniumConfig("chrome","T:\\Kieran Cornish\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
    }
    @AfterClass
    public static void teardown(){
        seleniumConfig.getDriver().close();
    }
    @Test
    public void WomenlinkTest() throws Exception {
        automationPracticeSite.getFooter().clickWomenlink();
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void SpecialslinkTest() throws Exception {
        automationPracticeSite.getFooter().clickSpecialsLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=prices-drop",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void NewProductsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickNewProductsLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=new-products",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void BestSellersLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickBestSellersLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=best-sales",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void OurStoresLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickOurStoresLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=stores",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void ContactUsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickContactUsLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=contact",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void TermsAndConditionsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickTermsAndConditionsLink();
        Assert.assertEquals("http://automationpractice.com/index.php?id_cms=3&controller=cms",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void AboutUsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickAboutUsLink();
        Assert.assertEquals("http://automationpractice.com/index.php?id_cms=4&controller=cms",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void SitemapLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickSitemapLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=sitemap",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void MyOrdersLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickMyOrdersLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=history",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void MyCreditSlipsLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickMyCreditSlipsLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=order-slip",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void MyAddressesLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickMyAddressesLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=addresses",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void MyPersonalInfoLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickMyPersonalInfoLink();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=identity",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void FacebookLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickFacebookLink();
        Assert.assertEquals("https://www.facebook.com/groups/525066904174158/",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void TwitterLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickTwitterLink();
        Assert.assertEquals("https://twitter.com/seleniumfrmwrk",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void YouTubeLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickYouTubeLink();
        Assert.assertEquals("https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void GoogleLinkTest() throws Exception {
        automationPracticeSite.getFooter().clickGoogleLink();
        Assert.assertEquals("https://plus.google.com/111979135243110831526/posts",seleniumConfig.getDriver().getCurrentUrl());
    }
    @Test
    public void NewsletterSubmitTest() throws Exception {
        automationPracticeSite.getFooter().clickNewsletterSubmit();
        Assert.assertEquals("http://automationpractice.com/index.php",seleniumConfig.getDriver().getCurrentUrl());
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
