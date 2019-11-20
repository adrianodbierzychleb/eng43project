package com.spartaglobal.eng43project.automationPracticeSite.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateAnAccount {

        private WebDriver driver;
        private String createAccountURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";

        private By titles = By.name("id_gender");
        private By firstname = By.id("customer_firstname");
        private By lastname = By.id("customer_lastname");
        private By email = By.id("email"); // value= eng45@test.com
        private By password = By.id("passwd");

        private By dateDay = By.id("days");
        private By dateMonth = By.id("months");
        private By dateYear = By.id("years");

        private By newsletter = By.id("newsletter");
        private By specialOffer = By.id("optin");


        public CreateAnAccount(WebDriver driver) {
            this.driver = driver;
        }

        public void goToCreateAccountPage() {
            driver.navigate().to(createAccountURL);
        }

        public void getTitle() {

            List<WebElement> title = driver.findElements(titles);

            for (org.openqa.selenium.WebElement titles : title) {
                driver.findElement(By.name(titles.getAttribute("name"))).click();
                driver.findElement(By.name(titles.getAttribute("name"))).isSelected();

            }

        }

        public void inputFirstName(String firstnameText) {
            driver.findElement(firstname).sendKeys(firstnameText);
        }

        public String getFirstnameFieldText() {
            return driver.findElement(firstname).getAttribute("value");
        }

        public void inputLastname(String lastnameText) {
            driver.findElement(lastname).sendKeys(lastnameText);
        }

        public String getLastnameFieldText() {
            return driver.findElement(lastname).getAttribute("value");
        }

        public String emailAlreadyAdded() {
            return driver.findElement(email).getAttribute("value");
        }

        public void inputPassword(String passwordText) {
            driver.findElement(password).sendKeys(passwordText);
        }

        public void checkDayOptions() {
            WebElement day = driver.findElement(dateDay);
            Select option = new Select(day);

            for (int i = 0; i < option.getOptions().size(); i++) {
                option.selectByIndex(i);
                System.out.println(option.getFirstSelectedOption().getText());

            }
        }

        public void checkMonthOptions() {
            WebElement month = driver.findElement(dateMonth);
            Select option = new Select(month);

            for (int i = 0; i < option.getOptions().size(); i++) {
                option.selectByIndex(i);
                System.out.println(option.getFirstSelectedOption().getText());

            }
        }

        public void checkYearOptions() {
            WebElement year = driver.findElement(dateYear);
            Select option = new Select(year);

            for (int i = 0; i < option.getOptions().size(); i++) {
                option.selectByIndex(i);
                System.out.println(option.getFirstSelectedOption().getText());

            }
        }

        public void clickNewsletter() {
            driver.findElement(newsletter).click();
        }

        public void clickSpecialOffer() {
            driver.findElement(specialOffer).click();
        }

    }


