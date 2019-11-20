package com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {
    private WebDriver driver;

    private By Womenlink = By.xpath("/html/body/div/div[3]/footer/div/section[2]/div/div/ul/li/a");

    private By SpecialsLink = By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[1]/a");
    private By NewProductsLink= By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[2]/a");
    private By BestSellersLink= By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[3]/a");
    private By OurStoresLink= By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[4]/a");
    private By ContactUsLink= By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[5]/a");
    private By TermsAndConditionsLink= By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[6]/a");
    private By AboutUsLink = By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[7]/a");
    private By SitemapLink= By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[8]/a");

    private By MyOrdersLink= By.xpath("/html/body/div/div[3]/footer/div/section[5]/div/ul/li[1]/a");
    private By MyCreditSlipsLink= By.xpath("/html/body/div/div[3]/footer/div/section[5]/div/ul/li[2]/a");
    private By MyAddressesLink= By.xpath("/html/body/div/div[3]/footer/div/section[5]/div/ul/li[3]/a");
    private By MyPersonalInfoLink= By.xpath("/html/body/div/div[3]/footer/div/section[5]/div/ul/li[4]/a");

    private By FacebookLink= By.xpath("/html/body/div/div[3]/footer/div/section[1]/ul/li[1]");
    private By TwitterLink= By.xpath("/html/body/div/div[3]/footer/div/section[1]/ul/li[2]");
    private By YouTubeLink= By.xpath("/html/body/div/div[3]/footer/div/section[1]/ul/li[3]");
    private By GoogleLink= By.xpath("/html/body/div/div[3]/footer/div/section[1]/ul/li[4]");

    private By NewsletterSubmit= By.xpath("/html/body/div/div[3]/footer/div/div[1]/div/form/div/button");

    private By CallUsLink= By.xpath("/html/body/div/div[3]/footer/div/section[6]/div/ul/li[2]/span");
    private By EmailLink= By.xpath("/html/body/div/div[3]/footer/div/section[6]/div/ul/li[3]/span/a");

    public Footer(WebDriver driver) {
        this.driver = driver;
    }
    public Footer clickWomenlink(){
        driver.findElement(Womenlink).click();
        return this;
    }
    public Footer clickSpecialsLink(){
        driver.findElement(SpecialsLink).click();
        return this;
    }
    public Footer clickNewProductsLink(){
        driver.findElement(NewProductsLink).click();
        return this;
    }
    public Footer clickBestSellersLink(){
        driver.findElement(BestSellersLink).click();
        return this;
    }
    public Footer clickOurStoresLink(){
        driver.findElement(OurStoresLink).click();
        return this;
    }
    public Footer clickContactUsLink(){
        driver.findElement(ContactUsLink).click();
        return this;
    }
    public Footer clickTermsAndConditionsLink(){
        driver.findElement(TermsAndConditionsLink).click();
        return this;
    }

    public Footer clickAboutUsLink(){
        driver.findElement(AboutUsLink).click();
        return this;
    }
    public Footer clickSitemapLink(){
        driver.findElement(SitemapLink).click();
        return this;
    }


    public Footer clickMyOrdersLink(){
        driver.findElement(MyOrdersLink).click();
        return this;
    }
    public Footer clickMyCreditSlipsLink(){
        driver.findElement(MyCreditSlipsLink).click();
        return this;
    }
    public Footer clickMyAddressesLink(){
        driver.findElement(MyAddressesLink).click();
        return this;
    }
    public Footer clickMyPersonalInfoLink(){
        driver.findElement(MyPersonalInfoLink).click();
        return this;
    }
    public Footer clickFacebookLink(){
        driver.findElement(FacebookLink).click();
        return this;
    }
    public Footer clickTwitterLink(){
        driver.findElement(TwitterLink).click();
        return this;
    }
    public Footer clickYouTubeLink(){
        driver.findElement(YouTubeLink).click();
        return this;
    }
    public Footer clickGoogleLink(){
        driver.findElement(GoogleLink).click();
        return this;
    }


    public Footer clickNewsletterSubmit(){
        driver.findElement(NewsletterSubmit).click();
        return this;
    }


    public Footer clickCallUsLink(){
        driver.findElement(CallUsLink).click();
        return this;
    }
    public Footer clickEmailLink(){
        driver.findElement(EmailLink).click();
        return this;
    }


}
