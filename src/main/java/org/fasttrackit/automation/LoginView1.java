package org.fasttrackit.automation;

import com.sdl.selenium.web.WebLocator;

public class LoginView1 {

    private WebLocator emailField = new WebLocator().setId("email");
    private WebLocator passwordField = new WebLocator().setName("password");
    private WebLocator loginBtn= new WebLocator().setClasses("login-btn");

    public void login(String email, String pass) {
        emailField.sendKeys(email);
        passwordField.sendKeys(pass);
        loginBtn.click();

    }

}
