package com.spartaglobal.eng43project.ProjectTests.SignUpTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * A base example of how to lay this class out can be seen in BasketTest.java
 **/
public class SignUpTest {

    private static Signup signup;

    @BeforeClass
    public static void preRequesites(){
        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "C:\\Users\\Pawel Misiura\\Downloads\\chromedriver_win32\\chromedriver.exe");
        signup = new Signup(chromeDriverConfig.getDriver());
    }

    @Test
    public void enterLastNameInYourAddressTest() throws Exception{
        Assert.assertEquals("Steve", signup.inputFirstNameIntoYourAddressSection("Steve"));

    }

}
