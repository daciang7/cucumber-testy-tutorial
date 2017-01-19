package org.fasttrackit.Automation;

import org.apache.xpath.SourceTree;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Dacian on 1/12/2017.
 */
public class LoginTest extends TestBase {
    @Test
    public void validLoginTest() {
        System.out.println("ready");
        driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

        login("eu@fast.com", "eu.pass");

        try {
            WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
            logoutBtn.click();
        } catch (NoSuchElementException er) {
            Assert.fail("Could not login.Logout button was not present");
        }
    }

    @Test
    public void invalidLoginTest() {

        System.out.println("ready");
        driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

        login("eu@fast.com", "eu.pass123");

        WebElement errorElement = driver.findElement(By.className("error-msg"));
        System.out.println(errorElement.getText());
        Assert.assertEquals(errorElement.getText(),"Invalid user or password!");
        //assertThat(errorElement.getText(),is("Invalid user or password! "));
    }
    @Test
    public void changePasswordWithInvalidCurrentPassword(){
        openBrowser();
        login("eu@fast.com","eu.pass");
        WebElement preferencesBtn=driver.findElement(By.xpath("//button[@data-target='#preferences-win']"));
        preferencesBtn.click();

        WebElement currentPasswordField = driver.findElement(By.name("password"));
        WebElement newPasswordField= driver.findElement(By.name("newPassword"));
        WebElement repeatPasswordField =driver.findElement(By.name("newPasswordRepeat"));

        currentPasswordField.sendKeys("wrong.pass");
        newPasswordField.sendKeys("new.pass");
        repeatPasswordField.sendKeys("new.pass");
    }
    public void openBrowser(){
        System.out.println("ready");
        driver.get(" https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html ");
       // driver.get("file :// C:Produse/Testy/src/test/functional/app-demo/login.html");
    }

    public void login(String user, String pass) {
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.className("login-btn"));

        emailField.sendKeys(user);
        passField.sendKeys(pass);
        loginBtn.click();
    }

}