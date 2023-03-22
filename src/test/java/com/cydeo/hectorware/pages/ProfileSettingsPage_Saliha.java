package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage_Saliha extends DashboardPage {

    public ProfileSettingsPage_Saliha(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='settings']")
    public WebElement profileButton;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settingsButton;


    @FindBy(xpath = "//input[@value='Employee300']")
    public WebElement name;


    @FindBy(xpath ="//input[@id='phone']")
    public WebElement phoneNumber;

    @FindBy(id ="website")
    public WebElement webSite;

    @FindBy(id = "languageinput")
    public WebElement languageDropdown;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name ='address']")
    public WebElement address;

    @FindBy(xpath ="//input[@name='twitter']")
    public WebElement twitter;

    @FindBy (id ="localeinput")
    public WebElement localDropDown;






}
