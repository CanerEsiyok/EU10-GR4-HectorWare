package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    public LogOutPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "settings")
    public WebElement profileSettingsIcon;

    @FindBy(xpath = "//*[@data-id='logout']")
    public WebElement logOutButton;

    @FindBy(id = "expanddiv")
    public WebElement settingsDropbox;
}
