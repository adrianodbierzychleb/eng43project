package com.spartaglobal.eng43project.ProjectTests.SignUpTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;

import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;

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

    private static ChromeDriver driver;
    private static AutomationPracticeSite site;

    private String accountExistsError = "An account using this email address has already been registered. Please enter a valid password or request a new one.";


    @Before
    public void preRecs(){
        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome","C:\\Users\\Shmaila Rehman\\Downloads\\chromedriver_win32\\chromedriver.exe");

        site = new AutomationPracticeSite(chromeDriverConfig.getDriver());
    }

//    @AfterClass
//    public static void teardown(){
//        site.closeDriver();
//    }

    @Test
    public void emailAccountExists() {

        Iterator<WebElement> itr = site.getSignup().goToSignUpURL().inputEmail("srehman@spartaglobal.com").clickCreateAccountButton().getEmailExistsError().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getText());
        }
    }

    @Test
    public void signUpSuccessful (){
        site.getSignup().goToSignUpURL().inputEmail("jdjfi@gmail.com").clickCreateAccountButton();
    }

}
