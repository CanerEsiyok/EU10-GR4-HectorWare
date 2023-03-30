package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsPage extends DashboardPage {


    //the contactsModule could be "New contact", "+ New group", "All contacts", "Not grouped"
    public WebElement getContactsModule (String contactsModule) {
        if (contactsModule.equalsIgnoreCase("new contact")) {
            return Driver.getDriver().findElement(By.xpath("//button[@id='new-contact-button']"));
        } else {
            String xpath = "//span[@title='" + contactsModule + "']";
            return Driver.getDriver().findElement(By.xpath(xpath));
        }
    }


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


    @FindBy (xpath = "//div[@class='action-item header-menu']//button")
    public WebElement threeDots;

//    @FindBy (xpath = "//div[@class='property property--last property-tel']//span[@class='action-button__text'][normalize-space()='Delete']")
    @FindBy (xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement deleteButton;


}
