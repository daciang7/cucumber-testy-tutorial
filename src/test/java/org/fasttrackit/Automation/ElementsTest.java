package org.fasttrackit.Automation;


import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.automation.ElementsView;
import org.fasttrackit.automation.LoginView;
import org.fasttrackit.util.TestBase;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ElementsTest extends TestBase {

    private LoginView loginView = new LoginView();
    private ElementsView page=new ElementsView();

    @Test
    public void checkboxesTest(){
        openLoginPage();

        loginView.login("eu@fast.com","eu.pass");

        page.stopProcessCheckbox.click();
        page.labelWithEnterCheckbox.click();


        Utils.sleep(2000);
        page.stopProcessLabel.click();
        page.withEnterLabel.click();

        Utils.sleep(2000);
        page.stopProcessLabel.click();
        page.labelWithEnterCheckbox.click();


        assertThat("Stop the process is not selected",page.stopProcessCheckbox.isSelected(),is(true));
        assertThat("Label with Enter.",page.labelWithEnterCheckbox.isSelected(),is(true));

    }
      @Test
     public void dropDownTest(){
          openLoginPage();
          loginView.login("eu@fast.com","eu.pass");
          page.autoOption.click();
          page.manualOption.click();
      }



}

