package org.fasttrackit.automation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//change password
public class PracticaPage {
    //current password;
    //new password;
    //repeat new password;

    @FindBy(name =" password")
    private WebElement currentPasswordField;
    @FindBy(name="newPassword")
    private WebElement newPasswordField;
    @FindBy(name= "newPasswordRepeat")
    private WebElement repeatPasswordField;

    public void changePassword(String currentPassword,String newPassword,String repeatPassword){

        currentPasswordField.sendKeys(currentPassword);
        newPasswordField.sendKeys(newPassword);
        repeatPasswordField.sendKeys(repeatPassword);
    }
}
