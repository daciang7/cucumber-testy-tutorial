package org.fasttrackit.Automation;

import com.sdl.selenium.web.utils.Utils;
import org.apache.xpath.SourceTree;
import org.fasttrackit.automation.LoginPage;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoginTest extends TestBase {

    private LoginPage loginPage;

    public LoginTest() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }


    @Test
    public void validLoginTest() {
        System.out.println("ready");
        driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

        loginPage.login("eu@fast.com", "eu.pass");

        try {
            WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
            logoutBtn.click();
        } catch (NoSuchElementException er) {
            Assert.fail("Could not login.Logout button was not present");
        }
    }

    @Test
    public void invalidLoginTest() {

        openBrowser();
        loginPage.login("eu@fast.com", "eu.pass123");

        WebElement errorElement = driver.findElement(By.className("error-msg"));
        System.out.println(errorElement.getText());
        Assert.assertEquals(errorElement.getText(), "Invalid user or password!");
        //assertThat(errorElement.getText(),is("Invalid user or password! "));
    }


}