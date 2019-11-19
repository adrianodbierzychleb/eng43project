package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CommonPageProperties {

    private WebDriver driver;
    private By womenButtonHeader = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a");
    private By womenButtonHeaderTopsTshirts = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a");
    private By womenButtonHeaderTopsBlouses = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a");
    private By dressesButtonHeader = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a");
    private By dressesButtonHeaderCasual = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/a");
    private By dressesButtonHeaderEvening = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/a");
    private By dressesButtonHeaderSummer = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a");
    private By tshirtsButtonHeader = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");


    public CommonPageProperties(WebDriver driver) {
        this.driver = driver;
    }

    public CommonPageProperties clickWomenInNavBar(){
        driver.findElement(womenButtonHeader).click();
        return this;
    }

    public CommonPageProperties clickWomenHeaderTopsTshirtLink(){
        WebElement element = driver.findElement(womenButtonHeader);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(womenButtonHeaderTopsTshirts).click();
       return this;
    }

    public CommonPageProperties clickWomenHeaderTopsBlousesLink(){
        WebElement element = driver.findElement(womenButtonHeader);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(womenButtonHeaderTopsBlouses).click();
        return this;
    }

    public CommonPageProperties clickDressesHeader(){
        driver.findElement(dressesButtonHeader).click();
        return this;
    }

    public CommonPageProperties clickDressesHeaderCasualDresses(){
        WebElement element = driver.findElement(dressesButtonHeader);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(dressesButtonHeaderCasual).click();
        return this;
    }

    public CommonPageProperties clickDressesHeaderEveningDresses(){
        WebElement element = driver.findElement(dressesButtonHeader);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(dressesButtonHeaderEvening).click();
        return this;
    }


    public CommonPageProperties clickDressesHeaderSummerDresses(){
        WebElement element = driver.findElement(dressesButtonHeader);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(dressesButtonHeaderSummer).click();
        return this;
    }
    public CommonPageProperties clickTshirtHeader(){
        driver.findElement(tshirtsButtonHeader).click();
        return this;
    }

}
