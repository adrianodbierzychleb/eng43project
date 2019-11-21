package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Signup {

    public WebDriver driver;
 //   public WebDriverWait webDriverWait;

    //shams variables
    private String signUpURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private By emailFieldID = By.id("email_create");
    private By emailErrorText = By.cssSelector("#create_account_error");
    private By createAccountButton = By.name("SubmitCreate");
    private String accountFormURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
  //  private By formErrorText = By.xpath("//*[@id=\"center_column\"]/div");
    private By errorMessageId = By.cssSelector("#center_column");


   //Yas's VAriables
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

    //pawels variables
    private By yourAddressFirstNameFieldID = By.id("firstname");
    private By yourAddressLastNameFieldID = By.id("lastname");
    private By yourAddressCompanyFieldID = By.id("company");
    private By yourAddressAddress1FieldID = By.id("address1");
    private By yourAddressAddress2FieldID = By.id("address2");
    private By yourAddressCityFieldID = By.id("city");
    private By yourAddressSelectStateID = By.id("id_state");
    private By yourAddressPostcodeFieldID = By.id("postcode");
    private By yourAddressCountrySelectID = By.id("id_country");
    private By yourAddressAdditionalInformationFieldID = By.id("other");
    private By yourAddressHomePhoneFieldID = By.id("phone");
    private By yourAddressMobilePhoneFieldID = By.id("phone_mobile");
    private By yourAddressAddressAliasFieldID = By.id("alias");
    private By yourAddressRegisterButtonID = By.id("submitAccount");

    public Signup(WebDriver driver) {
        this.driver = driver;
    }

    public Signup goToSignUpURL(){
        driver.navigate().to(signUpURL);
        return this;
    }

    //*******************Email Authentication Methods ************************

    public Signup inputEmail(String email){
        driver.findElement(emailFieldID).sendKeys(email);
        return this;
    }

    public Signup clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
        return this;
    }

    public String getEmailError(){
        return driver.findElement(emailErrorText).getText();
    }

//    public Signup goToCreateAccountPage(){
//        driver.navigate().to(accountFormURL);
//        return this;
//    }


    //*********************Personal information field methods*********************

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
            option.getFirstSelectedOption().getText();
        }
    }
    public void checkMonthOptions () {
        waiting();
        WebElement month = driver.findElement(dateMonth);
        Select option = new Select(month);
        for (int i = 0; i < option.getOptions().size(); i++) {
            option.selectByIndex(i);
            option.getFirstSelectedOption().getText();
        }
    }
    public void checkYearOptions () {
        waiting();
        WebElement year = driver.findElement(dateYear);
        Select option = new Select(year);
        for (int i = 0; i < 2; i++) {
            option.selectByIndex(i);
            option.getFirstSelectedOption().getText();
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

    //*****************Your Address Field Methods******************

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
        driver.findElement(yourAddressCompanyFieldID).sendKeys(company);
        return this;
    }

    public Signup inputAddress1IntoYourAddressSection(String address1) {
        driver.findElement(yourAddressAddress1FieldID).sendKeys(address1);
        return this;
    }

    public Signup inputAddress2IntoYourAddressSection(String address2) {
        driver.findElement(yourAddressAddress2FieldID).sendKeys(address2);
        return this;
    }

    public Signup inputCityIntoYourAddressSection(String city) {
        driver.findElement(yourAddressCityFieldID).sendKeys(city);
        return this;
    }

    public Signup checkAllSatesInYourAddressSection(){
        WebElement continents = driver.findElement(yourAddressSelectStateID);
        Select drpContinents = new Select(continents);

        for (int i = 0; i < drpContinents.getOptions().size(); i++){
            drpContinents.selectByIndex(i);
            drpContinents.getFirstSelectedOption().getText();
        }
        return this;
    }

    public Signup inputPostCodeIntoYourAddressSection(String postCode) {
        driver.findElement(yourAddressPostcodeFieldID).sendKeys(postCode);
        return this;
    }

    public Signup checkAllCountriesInYourAddressSection(){
        WebElement continents = driver.findElement(yourAddressCountrySelectID);
        Select drpContinents = new Select(continents);

        for (int i = 0; i < drpContinents.getOptions().size(); i++){
            drpContinents.selectByIndex(i);
            drpContinents.getFirstSelectedOption().getText();
        }
        return this;
    }

    public Signup inputAdditionalInfoIntoYourAddressSection(String additionalInfo) {
        driver.findElement(yourAddressAdditionalInformationFieldID).sendKeys(additionalInfo);
        return this;
    }

    public Signup inputHomePhoneInfoIntoYourAddressSection(String homePhone) {
        driver.findElement(yourAddressHomePhoneFieldID).sendKeys(homePhone);
        return this;
    }

    public Signup inputMobilePhoneInfoIntoYourAddressSection(String mobilePhone) {
        driver.findElement(yourAddressMobilePhoneFieldID).sendKeys(mobilePhone);
        return this;
    }

    public Signup inputAliasInfoIntoYourAddressSection(String alias) {
        driver.findElement(yourAddressAddressAliasFieldID).sendKeys(alias);
        return this;
    }

    public Signup pressRegisterButton() {
        driver.findElement(yourAddressRegisterButtonID).click();
        return this;
    }

    //****************  browser wait method **************

    public void waiting(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void closeDriver(){
        driver.close();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessageId).getText();
    }
}