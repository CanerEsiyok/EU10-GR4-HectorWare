package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public LogoutPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id="settings")
    public WebElement profileSettingButton;
    @FindBy(id="expanddiv")
    public WebElement settingsMenu;

    @FindBy(xpath="//*[@data-id='logout']")
    public WebElement logOutButton;
}
