package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Signup {

    private WebDriver driver;
    private String signUpURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private By emailFieldID = By.id("email_create");
    private By AccountexistsErrorID = By.id("create_account_error");
    private By createAccountButton = By.name("SubmitCreate");
    private String accountFormURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";

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

    public Signup(WebDriver driver) {
        this.driver = driver;
    }

    public Signup goToSignUpURL(){
        driver.navigate().to(signUpURL);
        return this;
    }

    public Signup goToCreateAccountPage(){
        driver.navigate().to(accountFormURL);
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


}
