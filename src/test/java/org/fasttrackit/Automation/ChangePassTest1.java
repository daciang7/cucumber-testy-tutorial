package org.fasttrackit.Automation;

import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.automation.ChangePassPage1;
import org.fasttrackit.automation.LoginPage1;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/*
public class ChangePassTest1 extends TestBase {

   /* private LoginPage1 loginPage1;
    private ChangePassPage1 changePassPage1;

    public ChangePassTest1() {
        loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
        changePassPage1 = PageFactory.initElements(driver, ChangePassPage1.class);
    }

    @Test
    public void changePassWithInvalidCurrentPass1() {
        openPage();
        changePassPage1.changePass("wrong pass1", "new pass1", "new pass1");
        assertThat(changePassPage1.getStatusMessage(), is("Your preview password is incorrect!"));

    }

    @Test
    public void changePassWithInvalidConfirmPass1() {
        openPage();
        changePassPage1.changePass("eu.pass", "tu.pass", "tu.pass1");
        assertThat(changePassPage1.getStatusMessage(), is("Password does not match with the confirm password!"));
    }

    @Test
    public void changePassWithInvalidConfirmPass2() {
        openPage();
        changePassPage1.changePass("eu.pass", "tu.pass", "tu.pass2");
        assertThat(changePassPage1.getStatusMessage(), is("Password does not match with the confirm password!"));
    }

    @Test
    public void changePassWithInvalidConfirmPass3() {
        openPage();
        changePassPage1.changePass("eu.pass", "tu.pass", "tu.pass3");
        assertThat(changePassPage1.getStatusMessage(), is("Password does not match with the confirm password!"));
    }

    @Test
    public void changePassWithInvalidConfirmPass4() {
        openPage();
        changePassPage1.changePass("eu.pass", "tu.pass", "tu.pass4");
        assertThat(changePassPage1.getStatusMessage(), is("Password does not match with the confirm password!"));
    }

    @Test
    public void changePassWithInvalidConfirmPass5() {
        openPage();
        changePassPage1.changePass("eu.pass", "tu.pass", "tu.pass5");
        assertThat(changePassPage1.getStatusMessage(), is("Password does not match with the confirm password!"));
    }

    @Test
    public void changePassWithInvalidConfirmPass6() {
        openPage();
        changePassPage1.changePass("eu.pass", "tu.pass", "tu.pass6");
        assertThat(changePassPage1.getStatusMessage(), is("Password does not match with the confirm password!"));

    }
    @Test
    public void changePassWithInvalidConfirmPass7(){
        openPage();
        changePassPage1.changePass( "eu.pass", "tu.pass", "tu.pass7");
        assertThat(changePassPage1.getStatusMessage(),is("Password does not match with the confirm password! "));
    }


    @Test
    public void changePassWithAValidPass() {
        openPage();
        changePassPage1.changePass("eu.pass", "qwerty", "qwerty");
        assertThat(changePassPage1.getStatusMessage(), is("Your password has been successfully changed! "));
    }

    @Test
    public void changePassWithAValidPass1() {
        openPage();
        changePassPage1.changePass("eu.pass", "querty1", "querty1");
        assertThat(changePassPage1.getStatusMessage(), is("Your password has been successfully changed!"));
    }

    @Test

    public void changePasswithAValidPass2() {
        openPage();
        changePassPage1.changePass("eu.pass", "qwerty2", "qwerty2");
        assertThat(changePassPage1.getStatusMessage(), is("Your password has been successfully changed!"));
    }


    @Test
    public void changePassWithAValidPass3() {
        openPage();
        changePassPage1.changePass(" eu.pass", "qwerty3", "qwerty3");
        assertThat(changePassPage1.getStatusMessage(), is("Your password has been successfully changed!"));
    }

    @Test
    public void changePassWithAValidPass4() {
        openPage();
        changePassPage1.changePass("eu.pass", "qwerty4", "qwerty4");
        assertThat(changePassPage1.getStatusMessage(), is("Your password has been successfully changed!"));
    }

    @Test
    public void changePassWithAValidPass5() {
        openPage();
        changePassPage1.changePass("eu.pass", "qwerty5", "qwerty5");
        assertThat(changePassPage1.getStatusMessage(), is("Your password has been successfully changed!"));

    }
    @Test
    public void changePassWithAValidPass6(){
        openPage();
        changePassPage1.changePass("eu.pass", "qwerty5", "qwerty5");
        assertThat(changePassPage1.getStatusMessage(),is("Your password has been successfully changed!"));
    }

    private void openPage() {
        openLoginPage();
        loginPage1.login("eu@fast.com", "eu.pass");
        WebElement preferencesBtn = driver.findElement(By.xpath("//button[@data-target='#preferences-win']"));
        preferencesBtn.click();
        Utils.sleep(2000);
    }
}

*/

