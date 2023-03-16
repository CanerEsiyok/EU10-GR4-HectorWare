package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.ConfigurationReader;
import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user")
    public WebElement inputUsername;
    @FindBy(id = "password")
    public WebElement inputPassword;
    @FindBy(id = "submit-form")
    public WebElement submitButton;

    public void login(String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        submitButton.click();
    }
}
