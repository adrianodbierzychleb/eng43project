package com.spartaglobal.eng43project.ProjectTests.PageNavigationTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Navigation.ContactUsPage;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContactUsPageTest {
    private static SeleniumConfig seleniumConfig;
    private static ContactUsPage contactUsPage;

    @BeforeClass
    public static void setup() {
        contactUsPage = new ContactUsPage(seleniumConfig.getDriver());
    }
//    @AfterClass
//    public static void teardown(){
//        seleniumConfig.getDriver().close();
//    }

    @Test
    public void testdropdownsubjectheading() throws Exception{
        contactUsPage.goToContactUsPage().getSubjectHeadingElements();
    }
    @Test
    public void testemailinput() throws Exception{
        contactUsPage.goToContactUsPage().inputemailaddress("sabrina@gmail.com");
    }
    @Test
    public void testcontactspageinput() throws Exception{
        contactUsPage.goToContactUsPage().getSubjectHeadingElements();
        contactUsPage.inputemailaddress("sabrina@gmail.com");
        contactUsPage.inputOrderReference("ehwqjbf8sref");
        contactUsPage.attachaFilebutton();
        contactUsPage.clickmessagebox();
        contactUsPage.inputmessage("this is my message");
        contactUsPage.clicksubmitButton();
    }
}
