package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (id = "dklsjf")
    public WebElement lksdjf;

}
