package org.fasttrackit.Automation;

import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.automation.ChangePasswordPage;
import org.fasttrackit.automation.LoginPage;
import org.fasttrackit.util.TestBase;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ChangePasswordTest  extends TestBase {

    private LoginPage loginPage;
    private ChangePasswordPage page;

    public ChangePasswordTest() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        page = PageFactory.initElements(driver, ChangePasswordPage.class);
    }
    @Test
    public void changePasswordWithInvalidCurrentPassword() {
        openPage();

        page.changePassword("wrong.pass", "new.pass", "new.pass");

        assertThat(page.getStatusMessage(), is("Your preview password is incorrect! "));
    }
    @Test
    public void changePasswordWithAnotherInvalidPassword() {
        openPage();

        page.changePassword("eu.pass", "qwerty", "qwerty1");

        assertThat(page.getStatusMessage(),is("Password does not match the confirm password!"));
    }
    @Test
    public void changePasswordWithAnotherValidPassword() {
        openPage();

        page.changePassword("eu.pass", "qwerty", "qwerty");

        assertThat(page.getStatusMessage(), is("Your password has been successfully changed! "));
}
    private void openPage(){
        openBrowser();
        loginPage.login("eu@fast.com","eu.pass");
        WebElement preferencesBtn = driver.findElement(By.xpath("//button[@data-target='#preferences-win']"));
        preferencesBtn.click();
        Utils.sleep(2000);

    }
}


