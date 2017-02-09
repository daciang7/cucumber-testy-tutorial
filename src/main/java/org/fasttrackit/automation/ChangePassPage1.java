package org.fasttrackit.automation;


import org.apache.xpath.operations.String;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassPage1 {

    @FindBy(name="password")
    WebElement currentPasswordField;
    @FindBy( name="newPassword")
    WebElement repeatPasswordField;
    @FindBy(name="newPasswordRepeat")
    WebElement repeatNewPasswordField;
    @FindBy(xpath="//*[@id='preferences-win']//button[(normalize-space(text()) ='Save')] ")
    WebElement saveBtn;
    @FindBy (className="status-msg")
    WebElement statusMsg;




}
