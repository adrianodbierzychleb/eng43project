package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {




    private WebDriver driver;
    private String signUpURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    public Signup(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSignUpURL(){
        driver.navigate().to(signUpURL);
    }


}
