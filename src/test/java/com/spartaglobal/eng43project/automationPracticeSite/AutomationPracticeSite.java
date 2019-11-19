package com.spartaglobal.eng43project.automationPracticeSite;

import com.spartaglobal.eng43project.automationPracticeSite.Pages.Basket;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Checkout;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.HomePage;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.NavigationPages;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeSite {

    private WebDriver driver;
    private Basket basket;
    private Checkout checkout;
    private NavigationPages navigationPages;
    private Signup signup;

    public AutomationPracticeSite(WebDriver driver) {
        this.driver = driver;
        this.basket = new Basket(driver);
        this.checkout = new Checkout(driver);
        this.navigationPages = new NavigationPages(driver);
        this.signup = new Signup(driver);
    }

    public Basket getBasket() {
        return basket;
    }

    public Checkout getCheckout() {
        return checkout;
    }

    public NavigationPages getNavigationPages() {
        return navigationPages;
    }

    public Signup getSignup() {
        return signup;
    }

    public AutomationPracticeSite closeDriver(){
        driver.close();
        return this;
    }


}
