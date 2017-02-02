package org.fasttrackit.Automation;


import org.fasttrackit.automation.ChangePasswordPage;
import org.fasttrackit.automation.LoginPage;
import org.fasttrackit.automation.PracticaPage;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


// Practica:  Change Password Test
  public class PracticaTest extends TestBase{

       private LoginPage loginPage;
       private PracticaPage practicaPage;

        public PracticaTest () {
            loginPage = PageFactory.initElements(driver, LoginPage.class);
            practicaPage = PageFactory.initElements(driver, PracticaPage.class);

        }
  }



