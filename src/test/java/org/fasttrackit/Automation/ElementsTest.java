package org.fasttrackit.Automation;


import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.automation.LoginView;
import org.fasttrackit.util.TestBase;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ElementsTest extends TestBase {

    private LoginView loginView = new LoginView();

    @Test
    public void checkboxesTest(){
        openLoginPage();

        loginView.login("eu@fast.com","eu.pass");

        CheckBox stopProcessCheckbox=new CheckBox().setElPath("/html/body/form[1]/div[3]/label/input");
        CheckBox labelWithEnterCheckbox=new CheckBox().setElPath("/html/body/form[1]/div[4]/label/input");

        WebLocator stopProcessLabel=new WebLocator().setText("Stop the process?", SearchType.TRIM);
        WebLocator withEnterLabel = new WebLocator().setText("Label with Enter.",SearchType.TRIM,SearchType.CHILD_NODE);

        stopProcessCheckbox.click();
        labelWithEnterCheckbox.click();


        Utils.sleep(2000);
        stopProcessLabel.click();
        withEnterLabel.click();

        Utils.sleep(2000);
        stopProcessLabel.click();
        labelWithEnterCheckbox.click();


        assertThat("Stop the process is not selected!",stopProcessCheckbox.isSelected(),is(true));
    }



}

