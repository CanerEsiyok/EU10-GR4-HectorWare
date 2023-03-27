package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage_Hamza {
    public ContactsPage_Hamza(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath="//button[@class='icon-add']")
    public WebElement newContactButton;

    @FindBy (xpath = "//input[@id='contact-fullname']")
    public WebElement contactFullNameInput;

    @FindBy (xpath = "//input[@inputmode='tel']")
    public WebElement phoneInput;

    @FindBy (xpath = "//input[@inputmode='email']")
    public WebElement emailInput;

    @FindBy (xpath = "//div[contains(text(),'Post office box')]/following-sibling::input")
    public WebElement postOfficeBoxInput;

    @FindBy (xpath = "//div[contains(text(),'Address')]/following-sibling::input")
    public WebElement addressBoxInput;

    @FindBy (xpath = "//div[contains(text(),'Extended')]/following-sibling::input")
    public WebElement extendedAddressBoxInput;

    @FindBy (xpath = "//div[contains(text(),'Postal')]/following-sibling::input")
    public WebElement postalCodeInput;

    @FindBy (xpath = "//div[contains(text(),'City')]/following-sibling::input")
    public WebElement cityInput;

    @FindBy (xpath = "//div[contains(text(),'State')]/following-sibling::input")
    public WebElement stateInput;

    @FindBy (xpath = "//div[contains(text(),'Country')]/following-sibling::input")
    public WebElement countryInput;

    @FindBy (xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> allContacts;

    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/header/div[3]/div/div/div/button")
    public WebElement threeDotsIcon;

    @FindBy(xpath = "/html/body/div[6]/div/div[1]/div[1]/div/ul/li[3]/button/span[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//h2[@class='empty-content__title']")
    public WebElement noContact;

    }
