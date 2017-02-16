package org.fasttrackit.Automation;


import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.table.Cell;
import com.sdl.selenium.web.table.Row;
import com.sdl.selenium.web.table.Table;
import org.fasttrackit.automation.LoginView;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TablesTest extends TestBase {


    @Test
    public void selectTableRowTest() {
        openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");

        //WebElement checkbox = driver.findElement(By.xpath("//table//input"));
        WebLocator checkbox = new WebLocator().setElPath("//table//input");
        checkbox.click();
    }
    Table table = new Table();

    @Test

    public void selectRowByEmail() {

        openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");
        //find row that contaains specified email in second column
        Row row = table.getRow(new Cell(4, "davidmiller@mail.com"));
        //find remove button inside specified
        //Button removeButton= new Button(row,"Remove");
        // WebLocator  checkbox=new WebLocator().setTag("input");
        CheckBox checkbox = new CheckBox(row);
        checkbox.click();

        WebLocator tableLocator= new WebLocator().setTag("table");
        WebLocator firstNameLocator = new WebLocator().setText("Bob");
        WebLocator lastNameLocator = new WebLocator().setText("Smith");
        WebLocator rowLocator = new WebLocator(tableLocator).setTag("tr").setChildNodes(firstNameLocator,lastNameLocator);
        WebLocator checkboxLocator = new WebLocator().setContainer(rowLocator).setTag("input");
        checkboxLocator.click();


    }
}







