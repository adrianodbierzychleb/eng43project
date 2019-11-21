package com.spartaglobal.eng43project.StepDefs.PageNavigationStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;

public class AdsStepDefs {

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

    @Given("I am at the home page")
    public void i_am_at_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL();
    }

    @When("I click a Offfortyfive")
    public void i_click_a_Offfortyfive() {
       automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().click45Ad();
    }

    @When("I click a Offtwentyfive")
    public void i_click_a_Offtwentyfive() {
       automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().click25Ad();
    }

    @Then("I am navigated to the ad’s location")
    public void i_am_navigated_to_the_ad_s_location() {
        Assert.assertEquals("https://www.prestashop.com/en",seleniumConfig.getDriver().getCurrentUrl());
    }

    @When("I click a Top trends ad")
    public void i_click_a_Top_trends_ad() {
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickTopTrendsAd();
    }

    @When("I click a Men's Coats ad")
    public void i_click_a_Men_s_Coats_ad() {
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickMenCoatsAd();
    }

    @When("I click a Women's Coats ad")
    public void i_click_a_Women_s_Coats_ad() {
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickWomenCoatsAd();
    }

    @When("I click a Sunglasses ad")
    public void i_click_a_Sunglasses_ad() {
       automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickSunglassesAd();
    }

    @When("I click a Handbags ad")
    public void i_click_an_Handbags_ad() {
       automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickHandbagsAd();
    }
}
