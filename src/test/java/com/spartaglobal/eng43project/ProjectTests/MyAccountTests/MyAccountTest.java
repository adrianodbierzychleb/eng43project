package com.spartaglobal.eng43project.ProjectTests.MyAccountTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyAccountTest {

    private static SeleniumConfig seleniumConfig;
    private static AutomationPracticeSite automationPracticeSite;

    @BeforeClass
    public static void setup(){
        // TODO: 18/11/2019 Change the driverPath to your own path!
        seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Dana Korang-Awua\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    }

    @AfterClass
    public static void teardown(){
        seleniumConfig.getDriver().close();
    }

    @Test
    public void shouldGoToCheckout() throws Exception{
        //automationPracticeSite;
    }



}
