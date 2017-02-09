package org.fasttrackit.automation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage {

        @FindBy(id = "email")
        private WebElement emailField;
        @FindBy(name = "password")
        private WebElement passField;
        @FindBy(className = "login-btn")
        private WebElement loginBtn;
        //calendar



        public void login(String email, String pass) {
            emailField.sendKeys(email);
            passField.sendKeys(pass);
            loginBtn.click();
        }


    }


