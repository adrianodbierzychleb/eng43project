package com.spartaglobal.eng43project.ProjectTests.MyAccountTests;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MyAccountTests {

    private static AutomationPracticeSite automationPracticeSite;

    @Before
    public void setup(){
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\\\Users\\\\Adrian Odbierzychleb\\\\Downloads\\\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    }




    @Test
    public void shouldLogin() throws Exception{
        automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount();
     }


     @Test
     public void shouldGoToOrderHistory() throws Exception{

        automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount().goToOrderHistoryDetails();

      }
      @Test
     public void shouldGoToPersonalInfo() throws Exception{

        automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount().goToMyPersonalInfo();
      }


      @Test
      public void shouldGoToUpdateAddress() throws Exception{
          automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount().goToMyAddres();
       }

       @Test
       public void shouldGoToCreditSlip() throws Exception{
           automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount().goToMyCreditSlips();
        }

        @Test
        public void shouldGoToHomePage() throws Exception{
            automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount().goToHome();
         }

         @Test
         public void shouldGoToMyWishList() throws Exception{
             automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount().goToMywhishList();
          }

          @Test
          public void shouldLogOffAccount() throws Exception{
              automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount().logoutOfAccount();
           }

}