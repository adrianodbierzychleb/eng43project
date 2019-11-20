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
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\\\Users\\\\Fabio Fernandes\\\\Downloads\\chromedriver_win32\\chromedriver.exe");
        automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());
    }




    @Test
    public void shouldLogin() throws Exception{
        automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount("eng43@test.com","spartaglobal");
     }


     @Test
     public void shouldGoToOrderHistory() throws Exception{

        automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount("eng43@test.com","spartaglobal").goToOrderHistoryDetails();

      }
      @Test
     public void shouldGoToPersonalInfo() throws Exception{

        automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount("eng43@test.com","spartaglobal").goToMyPersonalInfo();
      }


      @Test
      public void shouldGoToUpdateAddress() throws Exception{
          automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount("eng43@test.com","spartaglobal").goToMyAddres();
       }

       @Test
       public void shouldGoToCreditSlip() throws Exception{
           automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount("eng43@test.com","spartaglobal").goToMyCreditSlips();
        }

        @Test
        public void shouldGoToHomePage() throws Exception{
            automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount("eng43@test.com","spartaglobal").goToHome();
         }

         @Test
         public void shouldGoToMyWishList() throws Exception{
             automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount("eng43@test.com","spartaglobal").goToMywhishList();
          }

          @Test
          public void shouldLogOffAccount() throws Exception{
              automationPracticeSite.getMyAccount().goToHomepage().goToSignIn().loginInToAccount("eng43@test.com","spartaglobal").logoutOfAccount();
           }

}
