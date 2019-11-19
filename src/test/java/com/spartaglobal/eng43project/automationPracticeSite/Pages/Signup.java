package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Signup {

    private WebDriver driver;
    private String signUpURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private By emailFieldID = By.id("email_create");
    private By AccountexistsErrorID = By.id("create_account_error");
    private By createAccountButton = By.name("SubmitCreate");

    private By yourAddressFirstNameFieldID = By.id("firstname");
    private By yourAddressLastNameFieldID = By.id("lastname");
    private By yourAddressCompanyFieldID = By.id("Company");
    private By yourAddressAddress1FieldID = By.id("address1");
    private By yourAddressAddress2FieldID = By.id("address2");
    private By yourAddressCityFieldID = By.id("city");
    private By yourAddressStateFieldID = By.id("id_state");
    private By yourAddressPostcodeFieldID = By.id("postcode");
    //  private By yourAddressCountrySelectFieldID = By.id("id_country");
    private By yourAddressAdditionalInformationFieldID = By.id("other");
    private By yourAddressHomePhoneFieldID = By.id("phone");
    private By yourAddressMobilePhoneFieldID = By.id("phone_mobile");
    private By yourAddressAddressAliasFieldID = By.id("alias");
    private By yourAddressRegisterButtonID = By.id("submitAccount");

    private By createAccoutnEmailFieldOnSignInPage = By.id("email_create");
    private String signUpEmail = "ccccc123@gmail1.com";

   //YASMINS CODE
    private By titles = By.name("id_gender");
    private By firstname = By.id("customer_firstname");
    private By lastname = By.id("customer_lastname");
    private By email = By.id("email"); // value= eng45@test.com
    private By password = By.name("passwd");

    private By dateDay = By.id("days");
    private By dateMonth = By.id("months");
    private By dateYear = By.id("years");

    private By newsletter = By.id("newsletter");
    private By specialOffer = By.id("optin");

    //Errors
    private By firstnameError = By.className("alert alert-danger");


    private String createAccountURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";

    public Signup(WebDriver driver) {
        this.driver = driver;
    }

    public Signup goToSignUpURL(){
        driver.navigate().to(signUpURL);
        return this;
    }


    public Signup inputEmail(String email){
        driver.findElement(emailFieldID).sendKeys(email);
        return this;
    }

    public Signup clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
        return this;
    }

    public List<WebElement> getEmailExistsError(){
        return driver.findElements(AccountexistsErrorID);

    }

    public void enterValidEmailIntoSIgnUp(){
        driver.findElement(createAccoutnEmailFieldOnSignInPage).sendKeys(signUpEmail);

    }

    public Signup inputFirstNameIntoYourAddressSection(String firstname) {
        waiting();
        driver.findElement(yourAddressFirstNameFieldID).sendKeys(firstname);
        return this;
    }

    public Signup inputLastNameIntoYourAddressSection(String lastname) {
        driver.findElement(yourAddressLastNameFieldID).sendKeys(lastname);
        return this;
    }

    public Signup inputCompanyIntoYourAddressSection(String company) {
        driver.findElement(yourAddressFirstNameFieldID).sendKeys(company);
        return this;
    }

//YASMIN'S CODE


    public void goToCreateAccountPage(){
        driver.navigate().to(createAccountURL);
    }

    public void getTitle () {
        waiting();
        List<WebElement> title = driver.findElements(titles);

        for(org.openqa.selenium.WebElement titles : title) {
            driver.findElement(By.name(titles.getAttribute("name"))).click();
            driver.findElement(By.name(titles.getAttribute("name"))).isSelected();

        }

    }

    public void inputFirstName (String firstnameText) {
        waiting();
        driver.findElement(firstname).sendKeys(firstnameText);

    }

    public void inputLastname (String lastnameText) {
        waiting();
        driver.findElement(lastname).sendKeys(lastnameText);
    }


    public void inputPassword (String passwordText) {
        waiting();
        driver.findElement(password).sendKeys(passwordText);
    }

    public void checkDayOptions () {
        waiting();
        WebElement day = driver.findElement(dateDay);
        Select option = new Select(day);

        for (int i = 0; i < option.getOptions().size() ; i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());

        }
    }

    public void checkMonthOptions () {
        waiting();
        WebElement month = driver.findElement(dateMonth);
        Select option = new Select(month);

        for (int i = 0; i < option.getOptions().size(); i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());

        }
    }

    public void checkYearOptions () {
        waiting();
        WebElement year = driver.findElement(dateYear);
        Select option = new Select(year);

        for (int i = 0; i < option.getOptions().size(); i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());

        }
    }

    public void clickNewsletter () {
        waiting();
        driver.findElement(newsletter).click();
    }

    public void clickSpecialOffer () {
        waiting();
        driver.findElement(specialOffer).click();
    }


    public void waiting () {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


}
