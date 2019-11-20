package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ContactUsPage {
    private By subjectHeadingDropDownButton = By.id("id_contact");
    private By subjectHeadingElement = By.cssSelector("#id_contact");
    private By emailaddress = By.id("email");
    private By orderReference = By.id("id_order");
    private By attachFilebutton = By.id("fileUpload");
    private By messagearea = By.id("message");
    private By submitbutton = By.id("submitMessage");
    private By errormessageID = By.cssSelector("#center_column > div");


    private String ContactUsPageURL = "http://automationpractice.com/index.php?controller=contact";
    private WebDriver driver;

    public String getErrorMessage(){
        return driver.findElement(errormessageID).getText();
    }

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactUsPage goToContactUsPage() {
        driver.navigate().to(ContactUsPageURL);
        return this;
    }
    public ContactUsPage clicksubmitButton() {
        driver.findElement(submitbutton).click();
        return this;

    }
    public ContactUsPage clickmessagebox(){
        driver.findElement(messagearea).click();
        return this;
    }
    public ContactUsPage inputmessage(String message) {
        driver.findElement(messagearea).sendKeys(message);
        return this;
    }
    public ContactUsPage attachaFilebutton () {
        WebElement fileInput = driver.findElement(By.id("fileUpload"));
//        driver.findElement(By.id("fileUpload")).click();
        fileInput.sendKeys("C:\\Users\\SHoque\\Documents\\Training\\Sabrinas personal summary.docx");

        return this;
    }
    public ContactUsPage inputOrderReference(String orderreference){
        driver.findElement(orderReference).sendKeys(orderreference);
        return this;
    }

    public ContactUsPage inputemailaddress(String email) {
        driver.findElement(emailaddress).sendKeys(email);
        System.out.println(driver.findElement(emailaddress).getText());
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return this;
    }
    public void getSubjectHeadingElements(){
    Select dropdown = new Select(driver.findElement(subjectHeadingElement));
   // List<WebElement> professionItems = driver.findElements(subjectHeadingElement);
        for (WebElement cont : dropdown.getOptions()) {

            dropdown.selectByValue(cont.getAttribute("value"));
          //  System.out.println(cont.getAttribute("value"));
//            dropdown.getAllSelectedOptions();

            dropdown.selectByValue("1");;

            //System.out.println(dropdown.getFirstSelectedOption());
        }
        System.out.println(dropdown.getFirstSelectedOption());
}

}
