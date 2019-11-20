package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {

    private By singInButton = By.className("login");
    private By emailTextBox = By.id("email");
    private By passwordTextBox = By.id("passwd");
    private By submitLoginButton = By.id("SubmitLogin");
<<<<<<< HEAD
=======
    private By orderHistoryButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[1]/a/span");
    private By wishlistButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/ul/li/a");
    private By creditSlipsButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[2]/a");;
    private By addressButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a");;
    private By presonalInfoButtonn = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a");
    private By signOutButton = By.className("logout");
    private By homeButton = By.className("btn btn-default button button-small");
>>>>>>> checkout

    private WebDriver driver;
    private String homepage = "http://automationpractice.com/index.php";

    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }

<<<<<<< HEAD
    public void goToHomepage(){
=======
    public MyAccount goToHomepage(){

>>>>>>> checkout
        driver.navigate().to(homepage);
        return this;
    }

    public MyAccount loginInToAccount(){
        driver.findElement(emailTextBox).sendKeys("eng43@test.com");
        driver.findElement(passwordTextBox).sendKeys("spartaglobal");
        driver.findElement(submitLoginButton).click();
        return this;
    }

<<<<<<< HEAD
    public MyAccount logIntoAccount(){
        driver.findElement(singInButton).click();
        driver.findElement(emailTextBox).sendKeys("eng43@test.com");
        driver.findElement(passwordTextBox).sendKeys("spartaglobal");
        driver.findElement(submitLoginButton).click();
=======
    public MyAccount goToSignIn(){
        driver.findElement(singInButton).click();
        return this;
    }

    public MyAccount goToOrderHistoryDetails()
    {
        driver.findElement(orderHistoryButton).click();
        return this;
    }

    public MyAccount goToMyCreditSlips(){
        driver.findElement(creditSlipsButton).click();
        return this;
    }

    public  MyAccount goToMyAddres(){
        driver.findElement(addressButton).click();
        return this;
    }

    public MyAccount goToMyPersonalInfo(){
        driver.findElement(presonalInfoButtonn).click();
>>>>>>> checkout
        return this;
    }

    public MyAccount goToMywhishList(){
        driver.findElement(wishlistButton).click();
    return this;
    }

    public MyAccount goToHome(){
        driver.findElement(homeButton).click();
        return this;
    }

    public MyAccount logoutOfAccount(){
        driver.findElement(signOutButton).click();
        return this;
    }






}
