package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //module could be "files", "photos", "activity", "spreed", "mail", "contacts", "calendar"
    public WebElement getModule (String module) {
        String xpath = "//ul[@id='appmenu']//li[@data-id='"+module+"']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }
    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkModuleButton;

}
