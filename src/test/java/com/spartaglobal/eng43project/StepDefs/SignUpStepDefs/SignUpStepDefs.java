package com.spartaglobal.eng43project.StepDefs.SignUpStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpStepDefs {

    public static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","\\\\sg-fp01\\Folder Redirections\\Pawel Misiura\\Desktop\\chromedriver_win32\\chromedriver.exe");
    public static AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    private static Signup signup;

    //I am navigated to the page to the 'Create an Account' form when I enter a valid email

    @Given("that I am on the sign-up page")
    public void that_I_am_on_the_sign_up_page() {
        automationPracticeSite.getSignup().goToSignUpURL();
    }
    @When("I enter a valid email into the Email field in the ‘Create an Account’ section")
    public void i_enter_a_valid_email_into_the_Email_field_in_the_Create_an_Account_section() {
        automationPracticeSite.getSignup().inputEmail("sdf@gmail.com");
    }
    @And("I press ‘Create an account’")
    public void i_press_Create_an_account() {
        automationPracticeSite.getSignup().clickCreateAccountButton();
    }

    @Then("I should be navigated to the ‘Create An Account’ form.")
    public void i_should_be_navigated_to_the_Create_An_Account_form() {
        automationPracticeSite.getSignup();
    }

    @Before
    public static void setup() {
        signup = new Signup(seleniumConfig.getDriver());
        automationPracticeSite.getSignup().goToSignUpURL();

        // private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Shmaila Rehman\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //  private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());}
    }

    //I can fill in the your personal information section on the create an account page.

    @Given("that I am on create account page")
    public void that_I_am_on_create_account_page() {
      //  automationPracticeSite.getSignup().goToSignUpURL().inputEmail("jdjfi@gmail.com").clickCreateAccountButton();

    }
    @When("I select a title")
    public void i_select_a_title() {
        automationPracticeSite.getSignup().getTitle();
    }
    @When("I enter a valid first and last name")
    public void i_enter_a_valid_first_and_last_name() {
        automationPracticeSite.getSignup().inputFirstName("steve");
        automationPracticeSite.getSignup().inputLastname("smith");
    }
    @When("I enter a valid password")
    public void i_enter_a_valid_password() {
        automationPracticeSite.getSignup().inputPassword("qwert");
    }
    @When("I select a birth date")
    public void i_select_a_birth_date() {
        automationPracticeSite.getSignup().checkDayOptions();
        automationPracticeSite.getSignup().checkMonthOptions();
        automationPracticeSite.getSignup().checkYearOptions();
    }
    @When("I select Sign up for our newsletter")
    public void i_select_Sign_up_for_our_newsletter() {
        automationPracticeSite.getSignup().clickNewsletter();
    }
    @When("I select Receive special offers from our partners")
    public void i_select_Receive_special_offers_from_our_partners() {
        automationPracticeSite.getSignup().clickSpecialOffer();
    }
    @Then("I can fill in the your address section of the form")
    public void i_can_fill_in_the_your_address_section_of_the_form() {
        System.out.println("i can move on to the next step");
    }

    // I can fill in the your address section on the create an account page.

    @Given("that I am on the create account page")
    public void that_I_am_on_the_create_account_page() {
      //  automationPracticeSite.getSignup().goToSignUpURL().inputEmail("jdjfi@gmail.com").clickCreateAccountButton();

    }

    @When("I enter a valid first name")
    public void i_enter_a_valid_first_name() {
        automationPracticeSite.getSignup().inputFirstNameIntoYourAddressSection("Steve");

    }

    @And("I enter a valid last name")
    public void i_enter_a_valid_last_name() {
        automationPracticeSite.getSignup().inputLastNameIntoYourAddressSection("Smith");
    }

    @When("I enter a valid company")
    public void i_enter_a_valid_company() {
        automationPracticeSite.getSignup().inputCompanyIntoYourAddressSection("Sparta Global");
    }

    @When("I enter a valid first address")
    public void i_enter_a_valid_first_address() {
        automationPracticeSite.getSignup().inputAddress1IntoYourAddressSection("125 London Road");
    }

    @When("I enter a valid second address")
    public void i_enter_a_valid_second_address() {
        automationPracticeSite.getSignup().inputAddress2IntoYourAddressSection("London Wall");
    }

    @When("I enter a valid city")
    public void i_enter_a_valid_city() {
        automationPracticeSite.getSignup().inputCityIntoYourAddressSection("London");
    }

    @When("select a state")
    public void select_a_state() {
        automationPracticeSite.getSignup().checkAllSatesInYourAddressSection();
    }

    @When("I enter a valid post code")
    public void i_enter_a_valid_post_code() {
        automationPracticeSite.getSignup().inputPostCodeIntoYourAddressSection("12345");
    }

    @When("select a country")
    public void select_a_country() {
        automationPracticeSite.getSignup().checkAllCountriesInYourAddressSection();
    }

    @When("I enter additional information")
    public void i_enter_additional_information() {
        automationPracticeSite.getSignup().inputAdditionalInfoIntoYourAddressSection("here is some additional information");
    }

    @When("I enter a valid home phone")
    public void i_enter_a_valid_home_phone() {
        automationPracticeSite.getSignup().inputHomePhoneInfoIntoYourAddressSection("020819283273");
    }

    @When("I enter a valid mobile phone")
    public void i_enter_a_valid_mobile_phone() {
        automationPracticeSite.getSignup().inputMobilePhoneInfoIntoYourAddressSection("07892837261");
    }

    @When("I enter an address alias")
    public void i_enter_an_address_alias() {
        automationPracticeSite.getSignup().inputAliasInfoIntoYourAddressSection("This is my address alias");
    }

    @Then("I can click register to create my account")
    public void i_can_click_register_to_create_my_account() {
        automationPracticeSite.getSignup().pressRegisterButton();
        automationPracticeSite.getSignup().closeDriver();
    }



    //****************** Authentication page errors **************************


    @Given("I am on the sign-up page")
    public void i_am_on_the_sign_up_page() {
        automationPracticeSite.getSignup().goToSignUpURL();
    }
    @When("I input a invalid email")
    public void i_input_a_invalid_email() {
        automationPracticeSite.getSignup().inputEmail("test@test.com");
    }
    @Then("I receive the corresponding error.")
    public void i_receive_the_corresponding_error_Invalid() {
        automationPracticeSite.getSignup().clickCreateAccountButton();
        automationPracticeSite.getSignup().getEmailError();
    }
    @And("I input a invalid (.*)")
    public void i_input_a_invalid_email(String email) {
        automationPracticeSite.getSignup().inputEmail(email);
    }
    @Then("I receive the corresponding error (.*)")
    public void i_receive_the_corresponding_error(String error) {
        automationPracticeSite.getSignup().clickCreateAccountButton();
        System.out.println(automationPracticeSite.getSignup().getEmailError());
    }

    //*********************** Invalid input for sign up page step defs****************


}
