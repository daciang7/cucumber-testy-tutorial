package org.fasttrackit.Automation;

import org.fasttrackit.automation.LoginView;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoginTest1 extends TestBase {

    //private LoginPage1 page1;
    private LoginView page = new LoginView();
   // public LoginTest1 ()
   //     page = PageFactory.initElements(driver, LoginPage.class);
   // }


    @Test
    public void validLoginTest1() {
        openLoginPage();

        page.login("eu@fast.com", "eu.pass");

        try {
            WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
            logoutBtn.click();
        } catch (NoSuchElementException er) {
            Assert.fail("Could not login.Logout button was not present");
        }
    }

    @Test
    public void invalidLoginTest1() {
        openLoginPage();

        page.login("eu@fast.com", "eu.pa9ss");

        WebElement errorElement = driver.findElement(By.className("error-msg"));
        System.out.println(errorElement.getText());
        Assert.assertEquals(errorElement.getText(), "Invalid user or password!");
        //assertThat(errorElement.getText(),is("Invalid user or password! "));
    }
}