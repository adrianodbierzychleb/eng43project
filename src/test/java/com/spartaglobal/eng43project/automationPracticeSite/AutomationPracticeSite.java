package com.spartaglobal.eng43project.automationPracticeSite;

import com.spartaglobal.eng43project.automationPracticeSite.Pages.Basket;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Checkout;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.HomePage;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Signup;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeSite {

    private WebDriver driver;
    private Basket basket;
    private Checkout checkout;
    private HomePage homePage;
    private Signup signup;

    public AutomationPracticeSite(WebDriver driver) {
        this.driver = driver;
        this.basket = new Basket(driver);
        this.checkout = new Checkout(driver);
        this.homePage = new HomePage(driver);
        this.signup = new Signup(driver);
    }

    public Basket getBasket() {
        return basket;
    }

    public Checkout getCheckout() {
        return checkout;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public Signup getSignup() {
        return signup;
    }
}
