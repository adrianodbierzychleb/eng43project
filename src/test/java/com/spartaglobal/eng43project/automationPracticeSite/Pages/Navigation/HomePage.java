package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HomePage {
    private String homePageURL = "http://automationpractice.com/index.php";
    private WebDriver driver;
    private By ad25Link = By.xpath("/html/body/div/div[2]/div/div[1]/div/div[2]/ul/li[1]/a/img");
    private By ad45Link = By.xpath("/html/body/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/a/img");
   // private By bottomAds = By.cssSelector("#htmlcontent_home > ul");
    private By topTrendsLink = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div[1]/ul/li[1]/a/img");
    private By mensCoatLink = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div[1]/ul/li[2]/a/img");
    private By womensCoatLink = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div[1]/ul/li[3]/a/img");
    private By sunglassesLink = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div[1]/ul/li[4]/a/img");
    private By handbagsLink = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div[1]/ul/li[5]/a/img");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage goToHomePageURL(){
        driver.navigate().to(homePageURL);
        return this;
    }

    public HomePage click25Ad(){
        driver.findElement(ad25Link).click();
        return this;
    }


    public HomePage clickTopTrendsAd(){
        driver.findElement(topTrendsLink).click();
        return this;
    }

    public HomePage clickMenCoatsAd(){
        driver.findElement(mensCoatLink).click();
        return this;
    }
    public HomePage clickWomenCoatsAd(){
        driver.findElement(womensCoatLink).click();
        return this;
    }
    public HomePage clickSunglassesAd(){
        driver.findElement(sunglassesLink).click();
        return this;
    }
    public HomePage clickHandbagsAd(){
        driver.findElement(handbagsLink).click();
        return this;
    }
    public HomePage click45Ad(){
        driver.findElement(ad45Link).click();
        return this;
    }

}
