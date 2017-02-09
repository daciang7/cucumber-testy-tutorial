package org.fasttrackit.automation;


import com.sdl.selenium.web.WebLocator;
import org.testng.annotations.Test;

public class ElementsView{

    private WebLocator emailField =  new WebLocator().setId("email");
    private WebLocator passField = new WebLocator().setName("password");
    private WebLocator loginBtn = new WebLocator().setClasses ("login-btn");
    private WebLocator iconCalendar= new WebLocator().setClasses("icon-calendar");




    public void login(String email, String pass) {
        emailField.sendKeys(email);
        passField.sendKeys(pass);
        loginBtn.click();
    }
}
