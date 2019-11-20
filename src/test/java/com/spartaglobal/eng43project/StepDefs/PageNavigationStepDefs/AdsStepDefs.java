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

    @When("I click an {int}Off")
    public void i_click_an_Off(Integer int1) {
      if(int1 == 25){
          automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().click25Ad();
      }
      else {
          automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().click45Ad();
      }
    }

    @Then("I am navigated to the ad’s location")
    public void i_am_navigated_to_the_ad_s_location() {
        Assert.assertEquals("https://www.prestashop.com/en",seleniumConfig.getDriver().getCurrentUrl());
    }

    @When("I click an Top trends")
    public void i_click_an_Top_trends() {
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickTopTrendsAd();
    }

    @When("I click an Men's Coats")
    public void i_click_an_Men_s_Coats() {
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickMenCoatsAd();
    }

    @When("I click an Women's Coats")
    public void i_click_an_Women_s_Coats() {
        automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickWomenCoatsAd();
    }

    @When("I click an Sunglasses")
    public void i_click_an_Sunglasses() {
       automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickSunglassesAd();
    }

    @When("I click an Handbags")
    public void i_click_an_Handbags() {
       automationPracticeSite.getNavigationPages().homePage().goToHomePageURL().clickHandbagsAd();
    }
}
